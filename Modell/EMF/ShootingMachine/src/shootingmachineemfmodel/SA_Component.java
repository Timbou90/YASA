/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SA Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.SA_Component#getHasPortsSAC <em>Has Ports SAC</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getSA_Component()
 * @model
 * @generated
 */
public interface SA_Component extends Component {
	/**
	 * Returns the value of the '<em><b>Has Ports SAC</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Ports}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ports SAC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ports SAC</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getSA_Component_HasPortsSAC()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ports> getHasPortsSAC();

} // SA_Component
