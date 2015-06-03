/**
 */
package shootingmachineemfmodel.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.util.Diagnostician;

import shootingmachineemfmodel.ShootingmachineemfmodelFactory;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

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
			 new ShootingmachineemfmodelResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(ShootingmachineemfmodelPackage.eNS_URI,
			 ShootingmachineemfmodelPackage.eINSTANCE);

		File file = new File("I:\\runtime-EclipseApplication\\RemoteSystemsTempFiles\\My.shootingmachineemfmodel");
        URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI("My.shootingmachineemfmodel");
        //URI uri = URI.createURI("D:\\runtime-EclipseApplication\\RemoteSystemsTempFiles\\My.defaultname");

        try {
            // Demand load resource for this file.
            //
            Resource resource = resourceSet.getResource(uri, true);
            System.out.print("CPU ATMEL_AT91SAM7S256\n"
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
            		+ "APPMODE LEGOSAR{};\n\n");

        }
        catch (RuntimeException exception) {
            System.out.println("Problem loading " + uri);
            exception.printStackTrace();
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