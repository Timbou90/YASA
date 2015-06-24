/**
 *
 * $Id$
 */
package shootingmachineemfmodel.validation;


/**
 * A sample validator interface for {@link shootingmachineemfmodel.Alarm}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AlarmValidator {
	boolean validate();

	boolean validateMINCYCLE(int value);
	boolean validateMAXALLOWEDVALUE(int value);
	boolean validateTICKSPERBASE(int value);
	boolean validateAUTOSTART(boolean value);
	boolean validateALARMTIME(int value);
	boolean validateCYCLETIME(int value);
}
