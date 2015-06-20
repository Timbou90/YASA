/**
 */
package shootingmachineemfmodel.tests;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import shootingmachineemfmodel.ShootingmachineemfmodelFactory;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;
import shootingmachineemfmodel.ToplevelSystem;
import shootingmachineemfmodel.util.ShootingmachineemfmodelResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>shootingmachineemfmodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShootingmachineemfmodelExample {
	/**
	 * <!-- begin-user-doc -->
	 * Load all the argument file paths or URIs as instances of the model.
	 * <!-- end-user-doc -->
	 * @param args the file paths or URIs.
	 * @generated
	 */
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

		File file = new File("C:\\Users\\Philipp\\Documents\\YASA\\Modell\\runtime-EclipseApplication\\RemoteSystemsTempFiles\\My.shootingmachineemfmodel");
        URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI("My.shootingmachineemfmodel");


        try {
            // Demand load resource for this file.
            //
        	Resource resource = resourceSet.getResource(uri, true);

        	ToplevelSystem mySystem = (ToplevelSystem)resource.getContents().get(0);


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
            	else
            	{
            		for (File c : BrickFolder.listFiles())
            			c.delete();
            		BrickFolder.delete();
            		BrickFolder.mkdir();
            		System.out.print("Ordner " + Brickname + " rekursiv geloescht und neu erstellt\n");
            	}

            	//Dateipfad + Dateiname
            	File OilFile = new File(Brickname + "\\" + Brickname + ".oil");

            	//Datei erstellen, wenn noch nicht vorhanden
            	if (!OilFile.exists()) {
    				OilFile.createNewFile();
    				System.out.print("\tDatei " + Brickname + ".oil erstellt\n");
    			}

            	//BufferedWriter
            	FileWriter fw = new FileWriter(OilFile.getAbsoluteFile());
            	BufferedWriter bw = new BufferedWriter(fw);

            	//Anfang hardcoded
            	String Beginn = "#include \"implementation.oil\"\n\n"
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

            	bw.write(Beginn); //String Beginn(Anfang) in Datei schreiben

            	//for schleife fuer Task sektion
            	for(int j = 0; j < mySystem.getHasBrick().get(i).getHasTaskBrick().size(); j++)
            	{
            		String Task = "\tTASK " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getName() + "\n"
            				+ "\t{\n";
            		//Wenn AUTOSTART true ist:
            		if (mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).isAUTOSTART() == true)
            		{
            			Task = Task + "\t\tAUTOSTART = TRUE\n"
        						+ "\t\t{\n"
        						+ "\t\t\tAPPMODE = LEGOSAR;\n"
        						+ "\t\t};\n";
            		}
            		//AUTOSTART false
            		else
            		{
            			Task = Task + "\t\tAUTOSTART = FALSE;\n";
            		}
            		Task = Task + "\t\tPRIORITY = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getPRIORITY() + ";\n"
            				+ "\t\tACIVATION = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getACTIVATION() + ";\n"
            				+ "\t\tSCHEDULE = FULL;\n"
            				+ "\t\tSTACKSIZE = 512;\n";

            		System.out.print("\t\tTASK " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");

            		//EVENTS die zu den TASKS gehoeren
            		for(int k = 0; k < mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasEvent().size(); k++)
            		{
            			Task = Task + "\t\tEVENT = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasEvent().get(k).getName() + ";\n";
            		}
            		Task = Task + "\t};\n\n";

            		bw.write(Task);

            		//for Schleife f�r ALARME
            		for(int k = 0; k < mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().size(); k++)
                	{
                		String Alarm = "\tALARM " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + "\n"
                				+ "\t{\n"
                				+ "\t\tCOUNTER = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + ";\n"
                				+ "\t\tACTION = ACTIVATETASK\n"
                				+ "\t\t{\n"
                				+ "\t\t\tTASK = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getName() + ";\n"
                				+ "\t\t};\n";
                		//AUTOSTART ist true
                		if(mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).isAUTOSTART() == true)
                		{
                			Alarm = Alarm + "\t\tAUTOSTART = TRUE\n"
                					+ "\t\t{\n"
                					+ "\t\t\tALARMTIME = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getALARMTIME() + ";\n"
                					+ "\t\t\tCYCLETIME = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getCYCLETIME() + ";\n"
                					+ "\t\t\tAPPMODE = LEGOSAR;\n"
                					+ "\t\t};\n";
                		}
                		//AUTOSTART ist false
                		else
                		{
                			Alarm = Alarm + "\t\tAUTOSTART = FALSE;\n";
                		}
                		Alarm = Alarm + "\t};\n\n";

                		//pro ALARM 1 Counter erstellen
                		String Counter = "\tCOUNTER C_" + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + "\n"
                				+ "\t{\n"
                				+ "\t\tMINCYCLE = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getMINCYCLE() + ";\n"
                				+ "\t\tMAXALLOWEDVALUE = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getMAXALLOWEDVALUE() + ";\n"
                				+ "\t\tTICKSPERBASE = " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getTICKSPERBASE() + ";\n"
                				+ "\t};\n\n";

                		bw.write(Alarm);
                		bw.write(Counter);

                		System.out.print("\t\tALARM " + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + " und COUNTER C_" + mySystem.getHasBrick().get(i).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");

                	}

            	}

            	//for Schleife fuer EVENTS
            	for (int j = 0; j < mySystem.getHasBrick().get(i).getHasEventBrick().size(); j++)
            	{
            		String Event = "\tEVENT " + mySystem.getHasBrick().get(i).getHasEventBrick().get(j).getName() + "\n"
            				+ "\t{\n"
            				+ "\t\tMASK = AUTO;\n"
            				+ "\t};\n\n";
            		bw.write(Event);

            		System.out.print("\t\tEVENT " + mySystem.getHasBrick().get(i).getHasEventBrick().get(j).getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");

            	}
            	bw.write("};");


            	bw.close(); //Datei schlie�en


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