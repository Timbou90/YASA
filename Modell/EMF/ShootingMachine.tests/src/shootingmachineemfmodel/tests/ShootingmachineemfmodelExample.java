/**
 */
package shootingmachineemfmodel.tests;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import shootingmachineemfmodel.HWExtern;
import shootingmachineemfmodel.HWIntern;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;
import shootingmachineemfmodel.ToplevelSystem;
//import shootingmachineemfmodel.util.ShootingmachineemfmodelResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>shootingmachineemfmodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShootingmachineemfmodelExample {
	/*
	 * HASHES VORBEREITEN:
	 */
	static Map<String, String> RunnablesToTask = new HashMap<String, String>();
    static Map<String, String> EventPort = new HashMap<String, String>();
    static Map<String, String> PortRunnable = new HashMap<String, String>();
    static Map<String, Integer> PortToID = new HashMap<String, Integer>();
    static Map<String, Integer> TaskBrick = new HashMap<String, Integer>();
    static Map<Integer, String> IDToPort = new HashMap<Integer, String>();

    //Funktion um Runnablecode aus angegebenem Pfad einlesen und als String zurueckgeben
    public static String copyFiletoString(String input)
    {
        String runnablecode = "";
        File file = new File(input);

        if (!file.canRead() || !file.isFile())
        {
        	System.out.print("Error: Datei " + input + " konnte nicht gefunden werden!!\n");
        	System.exit(0);
        }

            BufferedReader in = null;
        try
        {
            in = new BufferedReader(new FileReader(input));
            String zeile = null;
            while ((zeile = in.readLine()) != null)
            {
                runnablecode = runnablecode + zeile + "\n";
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (in != null)
                try
                {
                    in.close();
                }
                catch (IOException e)
                {

                }
        }
        System.out.print("\t\tDatei " + input + " eingelesen\n");

        return runnablecode;
    }

    //Funktion um Ordner rekursiv mit evtl. Unterordnern und Dateien zu loeschen
    public static void deleteDir(File path)
    {
    	for (File files : path.listFiles())
        {
        	if (files.isDirectory())
        		deleteDir(files);
        	files.delete();
        }
            path.delete();
    }

    public static List<String> generateOilFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {

    	System.out.print("\tDatei " + Brickname + ".oil erstellt.\n");
    	List<String> retlist = new ArrayList<String>();
    	String oilFileBeginn = "";
    	String oilFileTask = "";
    	String oilFileInitHook = "";
    	String oilFileAlarm = "";
    	String oilFileCounter = "";
    	String oilFileEvent = "";

        //Anfang hardcoded
        oilFileBeginn = "#include \"implementation.oil\"\n\n"
                + "CPU ATMEL_AT91SAM7S256\n"
                + "{\n"
                + "\tOS LEJOS_OSEK\n"
                + "\t{\n"
                + "\t\tSTATUS = EXTENDED;\n"
                + "\t\tSTARTUPHOOK = FALSE;\n"
                + "\t\tERRORHOOK = FALSE;\n"
                + "\t\tSHUTDOWNHOOK = FALSE;\n"
                + "\t\tPRETASKHOOK = FALSE;\n"
                + "\t\tPOSTTASKHOOK = FALSE;\n"
                + "\t\tUSEGETSERVICEID = FALSE;\n"
                + "\t\tUSEPARAMETERACCESS = FALSE;\n"
                + "\t\tUSERESSCHEDULER = FALSE;\n"
                + "\t};\n\n"
                + "\tAPPMODE LEGOSAR{};\n\n";

        //for schleife fuer Task sektion
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
        	shootingmachineemfmodel.Task actualTask = mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j);
            oilFileTask = "\tTASK " + actualTask.getName() + "\n"
                    + "\t{\n";
            //Wenn AUTOSTART true ist:
            if (actualTask.isAUTOSTART() == true)
            {
                oilFileTask = oilFileTask + "\t\tAUTOSTART = TRUE\n"
                        + "\t\t{\n"
                        + "\t\t\tAPPMODE = LEGOSAR;\n"
                        + "\t\t};\n";
            }
            //AUTOSTART false
            else
            {
                oilFileTask = oilFileTask + "\t\tAUTOSTART = FALSE;\n";
            }
            oilFileTask = oilFileTask + "\t\tPRIORITY = " + actualTask.getPRIORITY() + ";\n"
                    + "\t\tACIVATION = " + actualTask.getACTIVATION() + ";\n"
                    + "\t\tSCHEDULE = FULL;\n"
                    + "\t\tSTACKSIZE = 512;\n";

            System.out.print("\t\tTASK " + actualTask.getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");

            oilFileInitHook = "\tTASK InitHook\n"
            		+"\t{\n"
            		+"\t\tAUTOSTART = TRUE\n"
            		+"\t\t{\n"
            		+"\t\t\tAPPMODE = LEGOSAR;\n"
            		+"\t\t};\n"
            		+"\t\tPRIORITY = 10;\n"
            		+"\t\tACTIVATION = 1\n"
            		+"\t\tSCHEDULE = FULL\n"
            		+"\t\tSTACKSIZE = 512\n"
            		+"\t};\n\n";

            System.out.print("\t\tImpliziten Task InitHook hinzugefuegt.\n");

            //EVENTS die zu den TASKS gehoeren
            for(int k = 0; k < actualTask.getHasEvent().size(); k++)
            {
                oilFileTask = oilFileTask + "\t\tEVENT = " + actualTask.getHasEvent().get(k).getName() + ";\n";
            }
            oilFileTask = oilFileTask + "\t};\n\n";


            //for Schleife f�r ALARME
            for(int k = 0; k < actualTask.getHasAlarm().size(); k++)
            {
                oilFileAlarm = "\tALARM " + actualTask.getHasAlarm().get(k).getName() + "\n"
                        + "\t{\n"
                        + "\t\tCOUNTER = " + actualTask.getHasAlarm().get(k).getName() + ";\n"
                        + "\t\tACTION = ACTIVATETASK\n"
                        + "\t\t{\n"
                        + "\t\t\tTASK = " + actualTask.getName() + ";\n"
                        + "\t\t};\n";
                //AUTOSTART ist true
                if(actualTask.getHasAlarm().get(k).isAUTOSTART() == true)
                {
                    oilFileAlarm = oilFileAlarm + "\t\tAUTOSTART = TRUE\n"
                            + "\t\t{\n"
                            + "\t\t\tALARMTIME = " + actualTask.getHasAlarm().get(k).getALARMTIME() + ";\n"
                            + "\t\t\tCYCLETIME = " + actualTask.getHasAlarm().get(k).getCYCLETIME() + ";\n"
                            + "\t\t\tAPPMODE = LEGOSAR;\n"
                            + "\t\t};\n";
                }
                //AUTOSTART ist false
                else
                {
                    oilFileAlarm = oilFileAlarm + "\t\tAUTOSTART = FALSE;\n";
                }
                oilFileAlarm = oilFileAlarm + "\t};\n\n";

                //pro ALARM 1 Counter erstellen
                oilFileCounter = "\tCOUNTER C_" + actualTask.getHasAlarm().get(k).getName() + "\n"
                        + "\t{\n"
                        + "\t\tMINCYCLE = " + actualTask.getHasAlarm().get(k).getMINCYCLE() + ";\n"
                        + "\t\tMAXALLOWEDVALUE = " + actualTask.getHasAlarm().get(k).getMAXALLOWEDVALUE() + ";\n"
                        + "\t\tTICKSPERBASE = " + actualTask.getHasAlarm().get(k).getTICKSPERBASE() + ";\n"
                        + "\t};\n\n";


                System.out.print("\t\tALARM " + actualTask.getHasAlarm().get(k).getName() + " und COUNTER C_"
                		+ actualTask.getHasAlarm().get(k).getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");

            }


        }
        //for Schleife fuer EVENTS
        for (int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasEventBrick().size(); j++)
        {
        	shootingmachineemfmodel.Event actualEvent = mySystem.getHasBrick().get(Brickindex).getHasEventBrick().get(j);
            oilFileEvent = "\tEVENT " + actualEvent.getName() + "\n"
                    + "\t{\n"
                    + "\t\tMASK = AUTO;\n"
                    + "\t};\n\n";

            System.out.print("\t\tEVENT " + actualEvent.getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");
        }

        //for Schleife fuer implizite Events
        for (int j = 0; j < mySystem.getHasConnections().size(); j++)
        {
        	for(int k = 0; k < mySystem.getHasConnections().get(j).getHasReceiverPorts().size();k++)
        	{
                oilFileEvent = "\tEVENT " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT\n"
                        + "\t{\n"
                        + "\t\tMASK = AUTO;\n"
                        + "\t};\n\n";
                System.out.print("\t\tImplizites Event " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT erzeugt\n");
        	}
        }


        retlist.add(oilFileBeginn);
        retlist.add(oilFileTask);
        retlist.add(oilFileInitHook);
    	retlist.add(oilFileAlarm);
    	retlist.add(oilFileCounter);
    	retlist.add(oilFileEvent);
        retlist.add("};");

        return retlist;
    }

    public static List<String> generatecFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {
    	System.out.print("\tDatei " + Brickname + ".c erstellt.\n");
    	List<String> retlist = new ArrayList<String>();
    	String cFileBeginn = "";
    	String cFileDeclareInitHook = "";
    	String cFileDeclareTask = "";
    	String cFileDeclareAlarm = "";
    	String newline = "\n";
    	String cFileDeclareEvent = "";
    	String newline1 = "\n";
    	String cFileRunnable = "";
    	String cFileInitHook = "";
    	String cFileTask = "";



        cFileBeginn = "#include \"kernel.h\"\n"
                + "#include \"kernel_id.h\"\n"
                + "#include \"ecrobot_interface.h\"\n"
                + "#include \"ecrobot_bluetooth.h\"\n\n";


        cFileDeclareInitHook = "DeclareTask(InitHook);\n";
        //For Schleife in welcher alle Tasks deklariert werden
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
            cFileDeclareTask = "DeclareTask(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getName() + ");\n\n";


            //For Schleife in welcher alle Alarme mit den zugehoerigen Countern deklariert werden
            for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().size(); k++)
            {
                cFileDeclareAlarm = "DeclareAlarm(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + ");\n"
                        + "DeclareCounter(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + ");\n";
            }
        }

        //For Schleife in welcher alle Events deklariert werden
        for (int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasEventBrick().size(); j++)
        {
            cFileDeclareEvent = "DeclareEvent(" + mySystem.getHasBrick().get(Brickindex).getHasEventBrick().get(j).getName() + ");\n";
        }


        //For Schleife in welcher die Runnables deklariert werden
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
            for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().size(); k++)
            {
                cFileRunnable = "//" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + "\n"
                		+ "void " + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + "()\n"
                        + "{\n"
                        + copyFiletoString(mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getApplicationcode())
                        + "\n}\n\n";
                System.out.print("\t\tRunnable " + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + " hinzugefuegt\n");
            }
        }

        cFileInitHook = "TASK(InitHook)\n"
        		+ "{\n";
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().size(); j++)
        {
        	try{
        		shootingmachineemfmodel.HWIntern myinput =  (HWIntern) mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j);
        		if(myinput.getType() == shootingmachineemfmodel.HWType.SONIC)
        		{
        			cFileInitHook += "\tecrobot_init_sonar_sensor(NXT_PORT_S"+mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j).getPortnumber()+");\n";
        			System.out.print("\t\tPort " + mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j).getPortnumber() + " als Ultraschall initialisiert\n");
        		}
        	}catch (java.lang.ClassCastException e){

        	}

        	try{
        		shootingmachineemfmodel.HWExtern myoutput = (HWExtern) mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j);
        		cFileInitHook += "\ti2c_enable(NXT_PORT_S"+myoutput.getPinnumber()+");\n";
        		System.out.print("\t\tI2C Expander an Port " + mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j).getPortnumber() + " initialisiert.\n");
        	}
        	catch (java.lang.ClassCastException e)
        	{

        	}
        }
        cFileInitHook += "}\n\n";
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
        	cFileTask = "TASK(" +  mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getName() + ")\n"
        			+ "{\n"
        			+ "\twhile(1)\n"
        			+ "\t{\n";
        			//Hier werden voruebergehend einfach alle runnables des Tasks nacheinander aufgerufen
        			/*
        			 *
        			 *
        			 *
        			 * Hier noch dynamisch Zeug rein generieren
        			 *
        			 *
        			 *
        			 */
        	for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().size(); k++)
            {
        		cFileTask = cFileTask + "\t\t" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + "();\n";
            }
        	cFileTask = cFileTask +  "\t}\n"
        			+ "\tTerminateTask();\n"
        			+ "}\n";
        }

        retlist.add(cFileBeginn);
        retlist.add(cFileDeclareInitHook);
    	retlist.add(cFileDeclareTask);
    	retlist.add(cFileDeclareAlarm);
    	retlist.add(newline);
    	retlist.add(cFileDeclareEvent);
    	retlist.add(newline1);
    	retlist.add(cFileRunnable);
    	retlist.add(cFileInitHook);
    	retlist.add(cFileTask);


        return retlist;
    }

    public static List<String> generatedynamiccFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {
    	System.out.print("\tDatei YASA_generated.c erstellt.\n");
    	List <String> retlist = new ArrayList<String>();
    	String genc = "";
    	String mySenderrtefunc = "";
    	String myReceiverrtefun = "";


        // Sender-Receiver Ports
        //Pro SenderReceiverConnection ein Event und eine globale Variable erstellen
        for (int j = 0; j < mySystem.getHasConnections().size(); j++)
        {
        	for(int k = 0; k < mySystem.getHasConnections().get(j).getHasReceiverPorts().size();k++)
        	{
        		genc = "DeclareEvent(" + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT);\n";
        		genc = genc + "U8 " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_SPEICHER[MAX_MESSAGE_LENGHT] = {0};\n";
                System.out.print("\t\tEVENT " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT erstellt.\n");
                System.out.print("\t\tVariable U8 " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_SPEICHER[MAX_MESSAGE_LENGHT] erstellt.\n");
        	}
        }

        for(int j = 0; j < mySystem.getHasConnections().size(); j++)
        {
        	shootingmachineemfmodel.Brick acBrick = mySystem.getHasBrick().get(Brickindex);

        	mySenderrtefunc = "\ninline std_return " + mySystem.getHasConnections().get(j).getHasSenderPorts().getName() + "(char *a)\n{\n";
        	myReceiverrtefun = "";

        	if(mySystem.getHasConnections().get(j).getHasInterBrickCommunicationSystem().size() >= 2)
        	{
        		//InterBrickConnection ist vorhanden -> �ber mehrere Bricks kommunizieren
        	}
        	else
        	{
        		for(int k = 0; k < mySystem.getHasConnections().get(j).getHasReceiverPorts().size(); k++)
        		{
        			mySenderrtefunc = mySenderrtefunc + "\t" + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_SPEICHER = *a;\n";
        			mySenderrtefunc = mySenderrtefunc + "\tSetEvent(" + RunnablesToTask.get(PortRunnable.get(mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName())) + ", " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT);\n";
        		}
        	}

        	mySenderrtefunc += "}";
        	System.out.print("\t\tFunktion "+ mySystem.getHasConnections().get(j).getHasSenderPorts().getName() + "(char *a) erstellt\n");
        }

        retlist.add(genc);
    	retlist.add(mySenderrtefunc);
    	retlist.add(myReceiverrtefun);

        return retlist;
    }

    public static List<String> generateComService(ToplevelSystem mySystem, int Brickindex) throws IOException
    {
    	// alles nur f�r einen Brick
    	List<String> retlist = new ArrayList<String>();
    	String BT_Global_String = "";
    	String BT_Receiver_String = "";
    	String BT_Transmitter_String = "";

    	// abpr�fen wie viele logische Ports auf dem aktuellen Brick sind
    	// wie viel davon sind Sender und wie viele sind Receiver

    	shootingmachineemfmodel.Brick actBrick = mySystem.getHasBrick().get(Brickindex);
    	/*
    	 * setzten des globalen defines, wie gro�e der Speicherbereich fuer die Comschicht sein muss -> ist fuer beide Bricks gleich
    	 * zuordnung zwischen den Bricks erfolgt symmetrisch, d.h. auf beiden Bricks zwei Speicherbereiche, die gleich "gehalten" werden!
    	 */
    	BT_Global_String += "#define BT_COM_SERVICE " + (PortToID.size()) + "\n";

    	String loc_WaitEvents = "";
    	String if_bed = "";

    	String loc_red_string = "switch(id){";
    	for(int i = 0; i < mySystem.getHasConnections().size(); i++)
    	{
    		if(Brickindex == TaskBrick.get(RunnablesToTask.get(PortRunnable.get(mySystem.getHasConnections().get(i).getHasSenderPorts().getName()))))
    		{
    			//Senderport auf aktuellem Brick
    			loc_WaitEvents += "WaitEvent(";
    			for(int j = 0; j < mySystem.getHasConnections().get(i).getHasReceiverPorts().size(); j++)
    			{
    				loc_WaitEvents += mySystem.getHasConnections().get(i).getHasReceiverPorts().get(j).getName() + "_EVENT | ";
    				if_bed += "if(event & " + mySystem.getHasConnections().get(i).getHasReceiverPorts().get(j).getName() + "_EVENT){";
    				if_bed += "ClearEvent(" + mySystem.getHasConnections().get(i).getHasReceiverPorts().get(j).getName() + "_EVENT);";
    				if_bed += "*transmit_pack_ptr = " + PortToID.get(mySystem.getHasConnections().get(i).getHasReceiverPorts().get(j).getName()) + ";" + "transmit_pack_ptr++;";
    				if_bed += "strcpy(BT_transmit_package, COMSERVICE_transmit_package[" + PortToID.get(mySystem.getHasConnections().get(i).getHasReceiverPorts().get(j).getName()) + "]);";
    				if(mySystem.getHasBrick().get(Brickindex).isIsMaster())
    					if_bed += "SetEvent(BT_IMPLIZIT_MASTER,BT_SEND_MY_MESSAGE);";
    				else
    					if_bed += "SetEvent(BT_IMPLIZIT_SLAVE,BT_SEND_MY_MESSAGE);";
    				if_bed += "}";
    			}
    		}
    		else
    		{
    			//Receiverport auf aktuellem Brick
    			for(int j = 0; j < mySystem.getHasConnections().get(i).getHasReceiverPorts().size(); j++)
    			{
    				loc_red_string += "case " + PortToID.get(mySystem.getHasConnections().get(i).getHasReceiverPorts().get(j).getName()) + ":";
    				loc_red_string += "SetEvent(" + RunnablesToTask.get(PortRunnable.get(mySystem.getHasConnections().get(i).getHasReceiverPorts().get(j).getName()));
    				loc_red_string +=  "," + mySystem.getHasConnections().get(i).getHasReceiverPorts().get(j).getName() + "_EVENT);";
    				loc_red_string += "break;";
    			}

    		}

    	}
    	if(loc_WaitEvents.length() > 0)
    	{
    		loc_WaitEvents = loc_WaitEvents.substring(0, loc_WaitEvents.length() - 2) + ");";
    		BT_Transmitter_String = "#define BT_DYNAMIC_WRITER_CODE (" + loc_WaitEvents + "GetEvent(TASK_BT_INTERFACE_WRITER, &event);" + if_bed + ")";
    	}
    	else
    		BT_Transmitter_String = "#define BT_DYNAMIC_WRITER_CODE";

    	loc_red_string += "}";
    	BT_Receiver_String = "#define BT_DYNAMIC_READER_CODE ( "+ loc_red_string + ")";


    	retlist.add(BT_Global_String);
    	retlist.add(BT_Receiver_String);
    	retlist.add(BT_Transmitter_String);
    	return retlist;
    }

    public static void main(String[] args) {
        // Create a resource set to hold the resources.
        //
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory to handle all file extensions.
        //
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
            (Resource.Factory.Registry.DEFAULT_EXTENSION,
             new XMIResourceFactoryImpl());

        // Register the package to ensure it is available during loading.
        //
        resourceSet.getPackageRegistry().put
            (ShootingmachineemfmodelPackage.eNS_URI,
             ShootingmachineemfmodelPackage.eINSTANCE);

        File file = new File("C:\\Users\\eip46272\\Desktop\\YASA-master\\Modell\\runtime-EclipseApplication\\RemoteSystemsTempFiles\\My.shootingmachineemfmodel");
        URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI("My.shootingmachineemfmodel");


        try {
            // Demand load resource for this file.
            //
            Resource resource = resourceSet.getResource(uri, true);

            ToplevelSystem mySystem = (ToplevelSystem)resource.getContents().get(0);
        	//initialisierungen fuer die Hashes
            for(int i = 0; i < mySystem.getHasComponent().size(); i++)
            {
            	for(int j = 0; j < mySystem.getHasComponent().get(i).getHasRunnable().size(); j++)
            	{
            		 for(int k = 0; k < mySystem.getHasComponent().get(i).getHasRunnable().get(j).getHasSWPorts().size(); k++)
            		 {
            			 PortRunnable.put(mySystem.getHasComponent().get(i).getHasRunnable().get(j).getHasSWPorts().get(k).getName(), mySystem.getHasComponent().get(i).getHasRunnable().get(j).getName());
            		 }
            	}
            }

            //Weitere Initialisierungen
            for (int j = 0; j < mySystem.getHasConnections().size(); j++)
            {
            	for(int k = 0; k < mySystem.getHasConnections().get(j).getHasReceiverPorts().size();k++)
            	{
            		EventPort.put(mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT", mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName());
            	}
            }

            //Und noch mehr Hashes initialisieren
            for(int i = 0; i < mySystem.getHasBrick().size(); i++)
            {
            	int Brickindex = i;
	            for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
	            {
	            	for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().size(); k++)
	                {
	            		RunnablesToTask.put(mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName(), mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getName());
	                }
	            }
            }

            for(int i = 0; i < mySystem.getHasConnections().size(); i++)
            {
            	for(int j = 0; j < mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().size(); j++)
            	{
            		for(int k = 0; k < mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().get(j).getHasReceiverPort().size(); k++)
            		{
            			if(!PortToID.containsKey(mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().get(j).getHasReceiverPort().get(k).getName()))
            				PortToID.put(mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().get(j).getHasReceiverPort().get(k).getName(), i * j + k );
            		}
            	}

            }
            for(int i = 0; i < mySystem.getHasBrick().size();i++)
            	for(int j = 0; j < mySystem.getHasBrick().get(i).getHasTaskBrick().size(); j++)
            		TaskBrick.put(mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getName(), i);

            //also making a hashmap with ID to port
            for(String key : PortToID.keySet())
            {
            	IDToPort.put(PortToID.get(key), key);
            }
            /*
             *
             * HASHES FERTIG
             *
             */


            //For Schleife in welcher die einzelnen Dateien und Ordner erstellt werden
            for(int i = 0; i<mySystem.getHasBrick().size(); i++)
            {

                String Brickname = mySystem.getHasBrick().get(i).getName();
                //Ordnername = Name des Bricks
                File BrickFolder = new File(Brickname);

                //Ordner erstellen, falls noch nicht vorhanden
                if(!BrickFolder.exists()){
                    BrickFolder.mkdir();
                    System.out.print("Ordner " + Brickname + " erstellt\n");
                }
                else //Wenn Ordner schon vorhanden ist, Ordner mit Dateien vorher loeschen
                {
                    deleteDir(BrickFolder);
                    BrickFolder.mkdir();
                    System.out.print("Ordner " + Brickname + " rekursiv geloescht und neu erstellt\n");
                }


                /*
                 *
                 * Erzeugung oil File:
                 *
                 *
                 */
                List <String> oilStrings = generateOilFile(mySystem, i, Brickname);


                //Dateipfad + Dateiname
                File OilFile = new File(Brickname + "\\" + Brickname + ".oil");
                if (!OilFile.exists()) {
                    OilFile.createNewFile();
                }


                //BufferedWriter
                FileWriter oilFileWriter = new FileWriter(OilFile.getAbsoluteFile());
                BufferedWriter oilFileBuffer = new BufferedWriter(oilFileWriter);

                oilFileBuffer.write(oilStrings.get(0));
                oilFileBuffer.write(oilStrings.get(1));
                oilFileBuffer.write(oilStrings.get(2));
                oilFileBuffer.write(oilStrings.get(3));
                oilFileBuffer.write(oilStrings.get(4));
                oilFileBuffer.write(oilStrings.get(5));
                oilFileBuffer.write(oilStrings.get(6));

                oilFileBuffer.close();

                /*
                 *
                 * Erzeugung c File
                 *
                 *
                 */
                List <String> cStrings = generatecFile(mySystem, i, Brickname);

                //Dateipfad + Dateiname
            	File cFile = new File(Brickname + "\\" + Brickname + ".c");

            	//Datei erstellen, wenn noch nicht vorhanden
                if (!cFile.exists()) {
                    cFile.createNewFile();
                }

                //BufferedWriter
                FileWriter cFileWriter = new FileWriter(cFile.getAbsoluteFile());
                BufferedWriter cFileBuffer = new BufferedWriter(cFileWriter);

                cFileBuffer.write(cStrings.get(0));
                cFileBuffer.write(cStrings.get(1));
                cFileBuffer.write(cStrings.get(2));
                cFileBuffer.write(cStrings.get(3));
                cFileBuffer.write(cStrings.get(4));
                cFileBuffer.write(cStrings.get(5));
                cFileBuffer.write(cStrings.get(6));
                cFileBuffer.write(cStrings.get(7));
                cFileBuffer.write(cStrings.get(8));
                cFileBuffer.write(cStrings.get(9));

                cFileBuffer.close();

                /*
                 *
                 * Dynamischen C-Code Erzeugen
                 *
                 *
                 */
                List <String> dynamiccStrings = generatedynamiccFile(mySystem, i, Brickname);

                //Dateipfad + Dateiname
                File gencFile = new File(Brickname + "\\YASA_generated.c");


                if (!gencFile.exists()) {
                	gencFile.createNewFile();
                }


                FileWriter gencFileWriter = new FileWriter(gencFile.getAbsoluteFile());
                BufferedWriter gencFileBuffer = new BufferedWriter(gencFileWriter);

                gencFileBuffer.write(dynamiccStrings.get(0));
                gencFileBuffer.write(dynamiccStrings.get(1));
                gencFileBuffer.write(dynamiccStrings.get(2));

                gencFileBuffer.close();


                /*
                 *
                 * Com Service erzeugen
                 *
                 *
                 */
                List<String> comstrings = generateComService(mySystem,i);

                File genvarfile = new File(Brickname + "\\YASA_generated_variables.c");
                if (!genvarfile.exists()) {
                	genvarfile.createNewFile();
                    System.out.print("\tDatei YASA_generated_variables.c erstellt\n");
                }


                FileWriter genvarfileWriter = new FileWriter(genvarfile.getAbsoluteFile());
                BufferedWriter genvarfileBuffer = new BufferedWriter(genvarfileWriter);
                genvarfileBuffer.write(comstrings.get(0) + "\n");
                genvarfileBuffer.write(comstrings.get(1) + "\n");
                genvarfileBuffer.write(comstrings.get(2) + "\n");
                genvarfileBuffer.close();
            }
        }
        catch (RuntimeException exception) {
            System.out.println("Problem loading " + uri);
            exception.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
	 * <!-- begin-user-doc -->
     * Prints diagnostics with indentation.
     * <!-- end-user-doc -->
	 * @param diagnostic the diagnostic to print.
	 * @param indent the indentation for printing.
	 * @generated
	 */
    protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

} //ShootingmachineemfmodelExample
