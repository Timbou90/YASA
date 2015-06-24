/**
 */
package shootingmachineemfmodel.tests;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

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

    public static void generateOilFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {
    	//Dateipfad + Dateiname
        File OilFile = new File(Brickname + "\\" + Brickname + ".oil");

        //Datei erstellen, wenn noch nicht vorhanden
        if (!OilFile.exists()) {
            OilFile.createNewFile();
            System.out.print("\tDatei " + Brickname + ".oil erstellt\n");
        }



        //BufferedWriter
        FileWriter oilFileWriter = new FileWriter(OilFile.getAbsoluteFile());
        BufferedWriter oilFileBuffer = new BufferedWriter(oilFileWriter);

        //Anfang hardcoded
        String oilFileBeginn = "#include \"implementation.oil\"\n\n"
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

        oilFileBuffer.write(oilFileBeginn); //String Beginn(Anfang) in Datei schreiben

        //for schleife fuer Task sektion
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
        	shootingmachineemfmodel.Task actualTask = mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j);
            String oilFileTask = "\tTASK " + actualTask.getName() + "\n"
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

            //EVENTS die zu den TASKS gehoeren
            for(int k = 0; k < actualTask.getHasEvent().size(); k++)
            {
                oilFileTask = oilFileTask + "\t\tEVENT = " + actualTask.getHasEvent().get(k).getName() + ";\n";
            }
            oilFileTask = oilFileTask + "\t};\n\n";

            oilFileBuffer.write(oilFileTask);

            //for Schleife f�r ALARME
            for(int k = 0; k < actualTask.getHasAlarm().size(); k++)
            {
                String oilFileAlarm = "\tALARM " + actualTask.getHasAlarm().get(k).getName() + "\n"
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
                String oilFileCounter = "\tCOUNTER C_" + actualTask.getHasAlarm().get(k).getName() + "\n"
                        + "\t{\n"
                        + "\t\tMINCYCLE = " + actualTask.getHasAlarm().get(k).getMINCYCLE() + ";\n"
                        + "\t\tMAXALLOWEDVALUE = " + actualTask.getHasAlarm().get(k).getMAXALLOWEDVALUE() + ";\n"
                        + "\t\tTICKSPERBASE = " + actualTask.getHasAlarm().get(k).getTICKSPERBASE() + ";\n"
                        + "\t};\n\n";

                oilFileBuffer.write(oilFileAlarm);
                oilFileBuffer.write(oilFileCounter);

                System.out.print("\t\tALARM " + actualTask.getHasAlarm().get(k).getName() + " und COUNTER C_"
                		+ actualTask.getHasAlarm().get(k).getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");

            }

        }
        //for Schleife fuer EVENTS
        for (int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasEventBrick().size(); j++)
        {
        	shootingmachineemfmodel.Event actualEvent = mySystem.getHasBrick().get(Brickindex).getHasEventBrick().get(j);
            String oilFileEvent = "\tEVENT " + actualEvent.getName() + "\n"
                    + "\t{\n"
                    + "\t\tMASK = AUTO;\n"
                    + "\t};\n\n";
            oilFileBuffer.write(oilFileEvent);

            System.out.print("\t\tEVENT " + actualEvent.getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");
        }

        //for Schleife fuer implizite Events
        for (int j = 0; j < mySystem.getHasConnections().size(); j++)
        {
        	for(int k = 0; k < mySystem.getHasConnections().get(j).getHasReceiverPorts().size();k++)
        	{
                String oilFileEvent = "\tEVENT " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT\n"
                        + "\t{\n"
                        + "\t\tMASK = AUTO;\n"
                        + "\t};\n\n";
                oilFileBuffer.write(oilFileEvent);
                System.out.print("\t\tImplizites Event " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT erzeugt\n");
        	}
        }
        oilFileBuffer.write("};");


        oilFileBuffer.close(); //Datei schlie�en

    }

    public static void generatecFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {
    	//Dateipfad + Dateiname
    	File cFile = new File(Brickname + "\\" + Brickname + ".c");

    	//Datei erstellen, wenn noch nicht vorhanden
        if (!cFile.exists()) {
            cFile.createNewFile();
            System.out.print("\tDatei " + Brickname + ".c erstellt\n");
        }

        //BufferedWriter
        FileWriter cFileWriter = new FileWriter(cFile.getAbsoluteFile());
        BufferedWriter cFileBuffer = new BufferedWriter(cFileWriter);

        String cFileBeginn = "#include \"kernel.h\"\n"
                + "#include \"kernel_id.h\"\n"
                + "#include \"ecrobot_interface.h\"\n"
                + "#include \"ecrobot_bluetooth.h\"\n\n";
        cFileBuffer.write(cFileBeginn);

        //For Schleife in welcher alle Tasks deklariert werden
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
            String cFileDeclareTask = "DeclareTask(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getName() + ");\n";
            cFileBuffer.write(cFileDeclareTask);

            cFileBuffer.write("\n");

            //For Schleife in welcher alle Alarme mit den zugehoerigen Countern deklariert werden
            for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().size(); k++)
            {
                String cFileDeclareAlarm = "DeclareAlarm(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + ");\n"
                        + "DeclareCounter(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + ");\n";
                cFileBuffer.write(cFileDeclareAlarm);
            }
            cFileBuffer.write("\n");
        }

        //For Schleife in welcher alle Events deklariert werden
        for (int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasEventBrick().size(); j++)
        {
            String cFileDeclareEvent = "DeclareEvent(" + mySystem.getHasBrick().get(Brickindex).getHasEventBrick().get(j).getName() + ");\n";
            cFileBuffer.write(cFileDeclareEvent);
        }
        cFileBuffer.write("\n");


        //For Schleife in welcher die Runnables deklariert werden
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
            for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().size(); k++)
            {
                String cFileRunnable = "//" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + "\n"
                		+ "void " + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + "()\n"
                        + "{\n"
                        + copyFiletoString(mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getApplicationcode())
                        + "\n}\n\n";
                cFileBuffer.write(cFileRunnable);
                System.out.print("\t\tRunnable " + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + " hinzugefuegt\n");
            }
        }

        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
        	String cFileTask = "TASK(" +  mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getName() + ")\n"
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
        	cFileBuffer.write(cFileTask);
        }
        cFileBuffer.close();
    }

    public static void generatedynamiccFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {

    	//Dateipfad + Dateiname
        File gencFile = new File(Brickname + "\\YASA_generated.c");


        if (!gencFile.exists()) {
        	gencFile.createNewFile();
            System.out.print("\tDatei YASA_generated.c erstellt\n");
        }


        FileWriter gencFileWriter = new FileWriter(gencFile.getAbsoluteFile());
        BufferedWriter gencFileBuffer = new BufferedWriter(gencFileWriter);

        // Sender-Receiver Ports
        //Pro SenderReceiverConnection ein Event und eine globale Variable erstellen
        for (int j = 0; j < mySystem.getHasConnections().size(); j++)
        {
        	for(int k = 0; k < mySystem.getHasConnections().get(j).getHasReceiverPorts().size();k++)
        	{
        		String genc = "DeclareEvent(" + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT);\n";
        		genc = genc + "U8 " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_SPEICHER[MAX_MESSAGE_LENGHT] = {0};\n";
        		gencFileBuffer.write(genc);
                System.out.print("\t\tEVENT " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT erstellt.\n");
                System.out.print("\t\tVariable U8 " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_SPEICHER[MAX_MESSAGE_LENGHT] erstellt.\n");
        	}
        }

        for(int j = 0; j < mySystem.getHasConnections().size(); j++)
        {
        	shootingmachineemfmodel.Brick acBrick = mySystem.getHasBrick().get(Brickindex);

        	String mySenderrtefunc = "\ninline std_return " + mySystem.getHasConnections().get(j).getHasSenderPorts().getName() + "(char *a)\n{\n";
        	String myReceiverrtefun = "";

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
        	gencFileBuffer.write(mySenderrtefunc);
        	System.out.print("\t\tFunktion "+ mySystem.getHasConnections().get(j).getHasSenderPorts().getName() + "(char *a) erstellt\n");
        }

        //Datei schlie�en
        gencFileBuffer.close();
    }

    public static List<String> generateComService(ToplevelSystem mySystem) throws IOException
    {
    	List<String> retlist = new ArrayList<String>();
    	String BT_Global_String = "";
    	String BT_Receiver_String = "";
    	String BT_Transmitter_String = "";
    	Map<String, String> BT_Events = new HashMap<String,String>();

    	for(int i = 0; i < mySystem.getHasConnections().size(); i++)
    	{
    		for(int j = 0; j < mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().size();j++)
    		{
    			BT_Events.put(mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().get(j).getHasReceiverPort().getName() + "_EVENT", mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().get(j).getHasReceiverPort().getName() + "_EVENT");
    		}
    	}

    	BT_Global_String += "#define BT_COM_SIZE " + BT_Events.size() + "\n";
    	BT_Receiver_String += "#define BT_DYNAMIC_RECEIVER_CODE ";
    	if(BT_Events.size() > 0)
    	{
	    	BT_Receiver_String += "WaitEvent( ";
	    	for(String key : BT_Events.keySet())
	    	{
	    		BT_Receiver_String += BT_Events.get(key) + " | ";
	    	}
	    	BT_Receiver_String = BT_Receiver_String.substring(0, BT_Receiver_String.length() - 2);
	    	BT_Receiver_String += ");";
	    	BT_Receiver_String += "GetEvent(TASK_BT_INTERFACE_READER, &event);";
	    	for(String key : BT_Events.keySet())
	    	{
	    		BT_Receiver_String += "if(event & " + BT_Events.get(key) + "){" + "ClearEvent(" + BT_Events.get(key) + ");";
	    		BT_Receiver_String += "strcpy(BT_transmit_package, COMSERVICE_receive_package[" + PortToID.get(BT_Events.get(key).substring(0, BT_Events.get(key).length() - 6 )) + "];";
	    		BT_Receiver_String += "}";
	    	}
    	}
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

        File file = new File("C:\\Users\\Flo-virtual\\Documents\\GitRepos\\YASA\\Modell\\runtime-EclipseApplication\\RemoteSystemsTempFiles\\My.shootingmachineemfmodel");
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
            		if(! PortToID.containsKey(mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().get(j).getHasReceiverPort().getName()))
            			PortToID.put(mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().get(j).getHasReceiverPort().getName(), i * mySystem.getHasConnections().get(i).getHasInterBrickCommunicationSystem().size() + j );
            	}
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


                //Erzeugung oil File:
                generateOilFile(mySystem, i, Brickname);

                //Erzeugung c File:
                generatecFile(mySystem, i, Brickname);

                //Erzeugung dynamisches c File mit RTE Funktionen:
                generatedynamiccFile(mySystem, i, Brickname);

                List<String> comstrings = generateComService(mySystem);

                File genvarfile = new File(Brickname + "\\YASA_generated_variables.c");
                if (!genvarfile.exists()) {
                	genvarfile.createNewFile();
                    System.out.print("\tDatei YASA_generated_variables.c erstellt\n");
                }


                FileWriter genvarfileWriter = new FileWriter(genvarfile.getAbsoluteFile());
                BufferedWriter genvarfileBuffer = new BufferedWriter(genvarfileWriter);
                genvarfileBuffer.write(comstrings.get(0));
                genvarfileBuffer.write(comstrings.get(1));
                genvarfileBuffer.write(comstrings.get(2));
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
