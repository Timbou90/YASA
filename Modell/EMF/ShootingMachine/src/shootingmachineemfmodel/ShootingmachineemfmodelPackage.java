/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see shootingmachineemfmodel.ShootingmachineemfmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ShootingmachineemfmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shootingmachineemfmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://shootingmachineemfmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shootingmachineemfmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShootingmachineemfmodelPackage eINSTANCE = shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.StandardclassImpl <em>Standardclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.StandardclassImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getStandardclass()
	 * @generated
	 */
	int STANDARDCLASS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDCLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Standardclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDCLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Standardclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ToplevelSystemImpl <em>Toplevel System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ToplevelSystemImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getToplevelSystem()
	 * @generated
	 */
	int TOPLEVEL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPLEVEL_SYSTEM__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Has Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPLEVEL_SYSTEM__HAS_COMPONENT = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPLEVEL_SYSTEM__HAS_BRICK = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPLEVEL_SYSTEM__HAS_CONNECTIONS = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Toplevel System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPLEVEL_SYSTEM_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Toplevel System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPLEVEL_SYSTEM_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ComponentImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Has Runnable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HAS_RUNNABLE = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.BrickImpl <em>Brick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.BrickImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getBrick()
	 * @generated
	 */
	int BRICK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Has Task Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_TASK_BRICK = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Event Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_EVENT_BRICK = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Alarm Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_ALARM_BRICK = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has HW Ports Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_HW_PORTS_BRICK = STANDARDCLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__IS_MASTER = STANDARDCLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SA_ComponentImpl <em>SA Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SA_ComponentImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSA_Component()
	 * @generated
	 */
	int SA_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Runnable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT__HAS_RUNNABLE = COMPONENT__HAS_RUNNABLE;

	/**
	 * The number of structural features of the '<em>SA Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SA Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SW_ComponentImpl <em>SW Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SW_ComponentImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSW_Component()
	 * @generated
	 */
	int SW_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Runnable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT__HAS_RUNNABLE = COMPONENT__HAS_RUNNABLE;

	/**
	 * The number of structural features of the '<em>SW Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SW Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.PortsImpl <em>Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.PortsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getPorts()
	 * @generated
	 */
	int PORTS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__NAME = STANDARDCLASS__NAME;

	/**
	 * The number of structural features of the '<em>Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SenderPortsImpl <em>Sender Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SenderPortsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSenderPorts()
	 * @generated
	 */
	int SENDER_PORTS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_PORTS__NAME = PORTS__NAME;

	/**
	 * The number of structural features of the '<em>Sender Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_PORTS_FEATURE_COUNT = PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sender Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_PORTS_OPERATION_COUNT = PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ReceiverPortsImpl <em>Receiver Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ReceiverPortsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getReceiverPorts()
	 * @generated
	 */
	int RECEIVER_PORTS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PORTS__NAME = PORTS__NAME;

	/**
	 * The feature id for the '<em><b>Blockierend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PORTS__BLOCKIEREND = PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receiver Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PORTS_FEATURE_COUNT = PORTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Receiver Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PORTS_OPERATION_COUNT = PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SenderImpl <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SenderImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSender()
	 * @generated
	 */
	int SENDER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__NAME = SENDER_PORTS__NAME;

	/**
	 * The number of structural features of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_FEATURE_COUNT = SENDER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_OPERATION_COUNT = SENDER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ClientImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = SENDER_PORTS__NAME;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = SENDER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = SENDER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SendEventImpl <em>Send Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SendEventImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSendEvent()
	 * @generated
	 */
	int SEND_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT__NAME = SENDER_PORTS__NAME;

	/**
	 * The number of structural features of the '<em>Send Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT_FEATURE_COUNT = SENDER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT_OPERATION_COUNT = SENDER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ReceiverImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__NAME = RECEIVER_PORTS__NAME;

	/**
	 * The feature id for the '<em><b>Blockierend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__BLOCKIEREND = RECEIVER_PORTS__BLOCKIEREND;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = RECEIVER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_OPERATION_COUNT = RECEIVER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ServerImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = RECEIVER_PORTS__NAME;

	/**
	 * The feature id for the '<em><b>Blockierend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__BLOCKIEREND = RECEIVER_PORTS__BLOCKIEREND;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = RECEIVER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = RECEIVER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.GetEventImpl <em>Get Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.GetEventImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getGetEvent()
	 * @generated
	 */
	int GET_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EVENT__NAME = RECEIVER_PORTS__NAME;

	/**
	 * The feature id for the '<em><b>Blockierend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EVENT__BLOCKIEREND = RECEIVER_PORTS__BLOCKIEREND;

	/**
	 * The number of structural features of the '<em>Get Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EVENT_FEATURE_COUNT = RECEIVER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EVENT_OPERATION_COUNT = RECEIVER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.TaskImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Has Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_EVENT = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Alarm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_ALARM = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Runnable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_RUNNABLE = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>AUTOSTART</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AUTOSTART = STANDARDCLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>PRIORITY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = STANDARDCLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ACTIVATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACTIVATION = STANDARDCLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.EventImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = STANDARDCLASS__NAME;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.AlarmImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>MINCYCLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__MINCYCLE = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MAXALLOWEDVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__MAXALLOWEDVALUE = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TICKSPERBASE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__TICKSPERBASE = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>AUTOSTART</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__AUTOSTART = STANDARDCLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ALARMTIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ALARMTIME = STANDARDCLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CYCLETIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__CYCLETIME = STANDARDCLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ConnectionsImpl <em>Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ConnectionsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getConnections()
	 * @generated
	 */
	int CONNECTIONS = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Has Receiver Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__HAS_RECEIVER_PORTS = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Sender Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__HAS_SENDER_PORTS = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Inter Brick Communication System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__HAS_INTER_BRICK_COMMUNICATION_SYSTEM = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__HAS_MESSAGE = STANDARDCLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.RunnableImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Applicationcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__APPLICATIONCODE = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has SW Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__HAS_SW_PORTS = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl <em>Inter Brick Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.InterBrickCommunicationImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getInterBrickCommunication()
	 * @generated
	 */
	int INTER_BRICK_COMMUNICATION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__MESSAGE_ID = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has IBC Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__HAS_IBC_OUT = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has IBC In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__HAS_IBC_IN = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Receiver Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__HAS_RECEIVER_PORT = STANDARDCLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__HAS_MESSAGE = STANDARDCLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Inter Brick Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Inter Brick Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWPortsImpl <em>HW Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWPortsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWPorts()
	 * @generated
	 */
	int HW_PORTS = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORTS__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORTS__PORTNAME = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HW Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORTS_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HW Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORTS_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWInputImpl <em>HW Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWInputImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWInput()
	 * @generated
	 */
	int HW_INPUT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INPUT__NAME = HW_PORTS__NAME;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INPUT__PORTNAME = HW_PORTS__PORTNAME;

	/**
	 * The feature id for the '<em><b>Has OSPORTS IN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INPUT__HAS_OSPORTS_IN = HW_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HW Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INPUT_FEATURE_COUNT = HW_PORTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HW Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INPUT_OPERATION_COUNT = HW_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWOutputImpl <em>HW Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWOutputImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWOutput()
	 * @generated
	 */
	int HW_OUTPUT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_OUTPUT__NAME = HW_PORTS__NAME;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_OUTPUT__PORTNAME = HW_PORTS__PORTNAME;

	/**
	 * The feature id for the '<em><b>Has OSPORTS OUT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_OUTPUT__HAS_OSPORTS_OUT = HW_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HW Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_OUTPUT_FEATURE_COUNT = HW_PORTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HW Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_OUTPUT_OPERATION_COUNT = HW_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWInternImpl <em>HW Intern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWInternImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWIntern()
	 * @generated
	 */
	int HW_INTERN = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INTERN__NAME = HW_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INTERN__PORTNAME = HW_INPUT__PORTNAME;

	/**
	 * The feature id for the '<em><b>Has OSPORTS IN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INTERN__HAS_OSPORTS_IN = HW_INPUT__HAS_OSPORTS_IN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INTERN__TYPE = HW_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HW Intern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INTERN_FEATURE_COUNT = HW_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HW Intern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INTERN_OPERATION_COUNT = HW_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWExternImpl <em>HW Extern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWExternImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWExtern()
	 * @generated
	 */
	int HW_EXTERN = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN__NAME = HW_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN__PORTNAME = HW_INPUT__PORTNAME;

	/**
	 * The feature id for the '<em><b>Has OSPORTS IN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN__HAS_OSPORTS_IN = HW_INPUT__HAS_OSPORTS_IN;

	/**
	 * The feature id for the '<em><b>Pinnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN__PINNUMBER = HW_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HW Extern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN_FEATURE_COUNT = HW_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HW Extern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN_OPERATION_COUNT = HW_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.MotorImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = HW_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__PORTNAME = HW_OUTPUT__PORTNAME;

	/**
	 * The feature id for the '<em><b>Has OSPORTS OUT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__HAS_OSPORTS_OUT = HW_OUTPUT__HAS_OSPORTS_OUT;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = HW_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = HW_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.DisplayImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__NAME = HW_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__PORTNAME = HW_OUTPUT__PORTNAME;

	/**
	 * The feature id for the '<em><b>Has OSPORTS OUT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__HAS_OSPORTS_OUT = HW_OUTPUT__HAS_OSPORTS_OUT;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = HW_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OPERATION_COUNT = HW_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.MessageImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Message Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_HEADER = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>My Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MY_MESSAGE = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.OSPortINImpl <em>OS Port IN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.OSPortINImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getOSPortIN()
	 * @generated
	 */
	int OS_PORT_IN = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_PORT_IN__NAME = RECEIVER_PORTS__NAME;

	/**
	 * The feature id for the '<em><b>Blockierend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_PORT_IN__BLOCKIEREND = RECEIVER_PORTS__BLOCKIEREND;

	/**
	 * The number of structural features of the '<em>OS Port IN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_PORT_IN_FEATURE_COUNT = RECEIVER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OS Port IN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_PORT_IN_OPERATION_COUNT = RECEIVER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.OSPortOUTImpl <em>OS Port OUT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.OSPortOUTImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getOSPortOUT()
	 * @generated
	 */
	int OS_PORT_OUT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_PORT_OUT__NAME = SENDER_PORTS__NAME;

	/**
	 * The number of structural features of the '<em>OS Port OUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_PORT_OUT_FEATURE_COUNT = SENDER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OS Port OUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_PORT_OUT_OPERATION_COUNT = SENDER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.HWType <em>HW Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.HWType
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWType()
	 * @generated
	 */
	int HW_TYPE = 31;


	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.HWPort <em>HW Port</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.HWPort
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWPort()
	 * @generated
	 */
	int HW_PORT = 32;


	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.ToplevelSystem <em>Toplevel System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toplevel System</em>'.
	 * @see shootingmachineemfmodel.ToplevelSystem
	 * @generated
	 */
	EClass getToplevelSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.ToplevelSystem#getHasComponent <em>Has Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Component</em>'.
	 * @see shootingmachineemfmodel.ToplevelSystem#getHasComponent()
	 * @see #getToplevelSystem()
	 * @generated
	 */
	EReference getToplevelSystem_HasComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.ToplevelSystem#getHasBrick <em>Has Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Brick</em>'.
	 * @see shootingmachineemfmodel.ToplevelSystem#getHasBrick()
	 * @see #getToplevelSystem()
	 * @generated
	 */
	EReference getToplevelSystem_HasBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.ToplevelSystem#getHasConnections <em>Has Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Connections</em>'.
	 * @see shootingmachineemfmodel.ToplevelSystem#getHasConnections()
	 * @see #getToplevelSystem()
	 * @generated
	 */
	EReference getToplevelSystem_HasConnections();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see shootingmachineemfmodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Component#getHasRunnable <em>Has Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Runnable</em>'.
	 * @see shootingmachineemfmodel.Component#getHasRunnable()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_HasRunnable();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick</em>'.
	 * @see shootingmachineemfmodel.Brick
	 * @generated
	 */
	EClass getBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Brick#getHasTaskBrick <em>Has Task Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Task Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasTaskBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasTaskBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Brick#getHasEventBrick <em>Has Event Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Event Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasEventBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasEventBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Brick#getHasAlarmBrick <em>Has Alarm Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Alarm Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasAlarmBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasAlarmBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Brick#getHasHWPortsBrick <em>Has HW Ports Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has HW Ports Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasHWPortsBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasHWPortsBrick();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Brick#isIsMaster <em>Is Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Master</em>'.
	 * @see shootingmachineemfmodel.Brick#isIsMaster()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_IsMaster();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.SA_Component <em>SA Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SA Component</em>'.
	 * @see shootingmachineemfmodel.SA_Component
	 * @generated
	 */
	EClass getSA_Component();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.SW_Component <em>SW Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Component</em>'.
	 * @see shootingmachineemfmodel.SW_Component
	 * @generated
	 */
	EClass getSW_Component();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Ports <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports</em>'.
	 * @see shootingmachineemfmodel.Ports
	 * @generated
	 */
	EClass getPorts();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.SenderPorts <em>Sender Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Ports</em>'.
	 * @see shootingmachineemfmodel.SenderPorts
	 * @generated
	 */
	EClass getSenderPorts();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.ReceiverPorts <em>Receiver Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver Ports</em>'.
	 * @see shootingmachineemfmodel.ReceiverPorts
	 * @generated
	 */
	EClass getReceiverPorts();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.ReceiverPorts#isBlockierend <em>Blockierend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blockierend</em>'.
	 * @see shootingmachineemfmodel.ReceiverPorts#isBlockierend()
	 * @see #getReceiverPorts()
	 * @generated
	 */
	EAttribute getReceiverPorts_Blockierend();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see shootingmachineemfmodel.Sender
	 * @generated
	 */
	EClass getSender();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see shootingmachineemfmodel.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.SendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Event</em>'.
	 * @see shootingmachineemfmodel.SendEvent
	 * @generated
	 */
	EClass getSendEvent();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see shootingmachineemfmodel.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see shootingmachineemfmodel.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.GetEvent <em>Get Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Event</em>'.
	 * @see shootingmachineemfmodel.GetEvent
	 * @generated
	 */
	EClass getGetEvent();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Standardclass <em>Standardclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standardclass</em>'.
	 * @see shootingmachineemfmodel.Standardclass
	 * @generated
	 */
	EClass getStandardclass();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Standardclass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shootingmachineemfmodel.Standardclass#getName()
	 * @see #getStandardclass()
	 * @generated
	 */
	EAttribute getStandardclass_Name();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see shootingmachineemfmodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Task#getHasEvent <em>Has Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Event</em>'.
	 * @see shootingmachineemfmodel.Task#getHasEvent()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasEvent();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Task#getHasAlarm <em>Has Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Alarm</em>'.
	 * @see shootingmachineemfmodel.Task#getHasAlarm()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasAlarm();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Task#getHasRunnable <em>Has Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Runnable</em>'.
	 * @see shootingmachineemfmodel.Task#getHasRunnable()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasRunnable();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Task#isAUTOSTART <em>AUTOSTART</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AUTOSTART</em>'.
	 * @see shootingmachineemfmodel.Task#isAUTOSTART()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_AUTOSTART();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Task#getPRIORITY <em>PRIORITY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PRIORITY</em>'.
	 * @see shootingmachineemfmodel.Task#getPRIORITY()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_PRIORITY();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Task#getACTIVATION <em>ACTIVATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACTIVATION</em>'.
	 * @see shootingmachineemfmodel.Task#getACTIVATION()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ACTIVATION();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see shootingmachineemfmodel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see shootingmachineemfmodel.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Alarm#getMINCYCLE <em>MINCYCLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MINCYCLE</em>'.
	 * @see shootingmachineemfmodel.Alarm#getMINCYCLE()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_MINCYCLE();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Alarm#getMAXALLOWEDVALUE <em>MAXALLOWEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXALLOWEDVALUE</em>'.
	 * @see shootingmachineemfmodel.Alarm#getMAXALLOWEDVALUE()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_MAXALLOWEDVALUE();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Alarm#getTICKSPERBASE <em>TICKSPERBASE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TICKSPERBASE</em>'.
	 * @see shootingmachineemfmodel.Alarm#getTICKSPERBASE()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_TICKSPERBASE();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Alarm#isAUTOSTART <em>AUTOSTART</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AUTOSTART</em>'.
	 * @see shootingmachineemfmodel.Alarm#isAUTOSTART()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_AUTOSTART();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Alarm#getALARMTIME <em>ALARMTIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ALARMTIME</em>'.
	 * @see shootingmachineemfmodel.Alarm#getALARMTIME()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_ALARMTIME();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Alarm#getCYCLETIME <em>CYCLETIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CYCLETIME</em>'.
	 * @see shootingmachineemfmodel.Alarm#getCYCLETIME()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_CYCLETIME();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections</em>'.
	 * @see shootingmachineemfmodel.Connections
	 * @generated
	 */
	EClass getConnections();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Connections#getHasReceiverPorts <em>Has Receiver Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Receiver Ports</em>'.
	 * @see shootingmachineemfmodel.Connections#getHasReceiverPorts()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_HasReceiverPorts();

	/**
	 * Returns the meta object for the reference '{@link shootingmachineemfmodel.Connections#getHasSenderPorts <em>Has Sender Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Sender Ports</em>'.
	 * @see shootingmachineemfmodel.Connections#getHasSenderPorts()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_HasSenderPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Connections#getHasInterBrickCommunicationSystem <em>Has Inter Brick Communication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Inter Brick Communication System</em>'.
	 * @see shootingmachineemfmodel.Connections#getHasInterBrickCommunicationSystem()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_HasInterBrickCommunicationSystem();

	/**
	 * Returns the meta object for the containment reference '{@link shootingmachineemfmodel.Connections#getHasMessage <em>Has Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Message</em>'.
	 * @see shootingmachineemfmodel.Connections#getHasMessage()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_HasMessage();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see shootingmachineemfmodel.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Runnable#getApplicationcode <em>Applicationcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicationcode</em>'.
	 * @see shootingmachineemfmodel.Runnable#getApplicationcode()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Applicationcode();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Runnable#getHasSWPorts <em>Has SW Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has SW Ports</em>'.
	 * @see shootingmachineemfmodel.Runnable#getHasSWPorts()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_HasSWPorts();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.InterBrickCommunication <em>Inter Brick Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Brick Communication</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication
	 * @generated
	 */
	EClass getInterBrickCommunication();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.InterBrickCommunication#getMessageID <em>Message ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message ID</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getMessageID()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EAttribute getInterBrickCommunication_MessageID();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.InterBrickCommunication#getHasIBCOut <em>Has IBC Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has IBC Out</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getHasIBCOut()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EReference getInterBrickCommunication_HasIBCOut();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.InterBrickCommunication#getHasIBCIn <em>Has IBC In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has IBC In</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getHasIBCIn()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EReference getInterBrickCommunication_HasIBCIn();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.InterBrickCommunication#getHasReceiverPort <em>Has Receiver Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Receiver Port</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getHasReceiverPort()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EReference getInterBrickCommunication_HasReceiverPort();

	/**
	 * Returns the meta object for the reference '{@link shootingmachineemfmodel.InterBrickCommunication#getHasMessage <em>Has Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Message</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getHasMessage()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EReference getInterBrickCommunication_HasMessage();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWPorts <em>HW Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Ports</em>'.
	 * @see shootingmachineemfmodel.HWPorts
	 * @generated
	 */
	EClass getHWPorts();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.HWPorts#getPortname <em>Portname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portname</em>'.
	 * @see shootingmachineemfmodel.HWPorts#getPortname()
	 * @see #getHWPorts()
	 * @generated
	 */
	EAttribute getHWPorts_Portname();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWInput <em>HW Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Input</em>'.
	 * @see shootingmachineemfmodel.HWInput
	 * @generated
	 */
	EClass getHWInput();

	/**
	 * Returns the meta object for the reference '{@link shootingmachineemfmodel.HWInput#getHas_OSPORTS_IN <em>Has OSPORTS IN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has OSPORTS IN</em>'.
	 * @see shootingmachineemfmodel.HWInput#getHas_OSPORTS_IN()
	 * @see #getHWInput()
	 * @generated
	 */
	EReference getHWInput_Has_OSPORTS_IN();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWOutput <em>HW Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Output</em>'.
	 * @see shootingmachineemfmodel.HWOutput
	 * @generated
	 */
	EClass getHWOutput();

	/**
	 * Returns the meta object for the reference '{@link shootingmachineemfmodel.HWOutput#getHas_OSPORTS_OUT <em>Has OSPORTS OUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has OSPORTS OUT</em>'.
	 * @see shootingmachineemfmodel.HWOutput#getHas_OSPORTS_OUT()
	 * @see #getHWOutput()
	 * @generated
	 */
	EReference getHWOutput_Has_OSPORTS_OUT();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWIntern <em>HW Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Intern</em>'.
	 * @see shootingmachineemfmodel.HWIntern
	 * @generated
	 */
	EClass getHWIntern();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.HWIntern#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see shootingmachineemfmodel.HWIntern#getType()
	 * @see #getHWIntern()
	 * @generated
	 */
	EAttribute getHWIntern_Type();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWExtern <em>HW Extern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Extern</em>'.
	 * @see shootingmachineemfmodel.HWExtern
	 * @generated
	 */
	EClass getHWExtern();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.HWExtern#getPinnumber <em>Pinnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinnumber</em>'.
	 * @see shootingmachineemfmodel.HWExtern#getPinnumber()
	 * @see #getHWExtern()
	 * @generated
	 */
	EAttribute getHWExtern_Pinnumber();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see shootingmachineemfmodel.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see shootingmachineemfmodel.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see shootingmachineemfmodel.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Message#getMessageHeader <em>Message Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Header</em>'.
	 * @see shootingmachineemfmodel.Message#getMessageHeader()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageHeader();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Message#getMyMessage <em>My Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Message</em>'.
	 * @see shootingmachineemfmodel.Message#getMyMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MyMessage();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.OSPortIN <em>OS Port IN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Port IN</em>'.
	 * @see shootingmachineemfmodel.OSPortIN
	 * @generated
	 */
	EClass getOSPortIN();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.OSPortOUT <em>OS Port OUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Port OUT</em>'.
	 * @see shootingmachineemfmodel.OSPortOUT
	 * @generated
	 */
	EClass getOSPortOUT();

	/**
	 * Returns the meta object for enum '{@link shootingmachineemfmodel.HWType <em>HW Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HW Type</em>'.
	 * @see shootingmachineemfmodel.HWType
	 * @generated
	 */
	EEnum getHWType();

	/**
	 * Returns the meta object for enum '{@link shootingmachineemfmodel.HWPort <em>HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HW Port</em>'.
	 * @see shootingmachineemfmodel.HWPort
	 * @generated
	 */
	EEnum getHWPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShootingmachineemfmodelFactory getShootingmachineemfmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ToplevelSystemImpl <em>Toplevel System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ToplevelSystemImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getToplevelSystem()
		 * @generated
		 */
		EClass TOPLEVEL_SYSTEM = eINSTANCE.getToplevelSystem();

		/**
		 * The meta object literal for the '<em><b>Has Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPLEVEL_SYSTEM__HAS_COMPONENT = eINSTANCE.getToplevelSystem_HasComponent();

		/**
		 * The meta object literal for the '<em><b>Has Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPLEVEL_SYSTEM__HAS_BRICK = eINSTANCE.getToplevelSystem_HasBrick();

		/**
		 * The meta object literal for the '<em><b>Has Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPLEVEL_SYSTEM__HAS_CONNECTIONS = eINSTANCE.getToplevelSystem_HasConnections();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ComponentImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Has Runnable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HAS_RUNNABLE = eINSTANCE.getComponent_HasRunnable();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.BrickImpl <em>Brick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.BrickImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getBrick()
		 * @generated
		 */
		EClass BRICK = eINSTANCE.getBrick();

		/**
		 * The meta object literal for the '<em><b>Has Task Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_TASK_BRICK = eINSTANCE.getBrick_HasTaskBrick();

		/**
		 * The meta object literal for the '<em><b>Has Event Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_EVENT_BRICK = eINSTANCE.getBrick_HasEventBrick();

		/**
		 * The meta object literal for the '<em><b>Has Alarm Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_ALARM_BRICK = eINSTANCE.getBrick_HasAlarmBrick();

		/**
		 * The meta object literal for the '<em><b>Has HW Ports Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_HW_PORTS_BRICK = eINSTANCE.getBrick_HasHWPortsBrick();

		/**
		 * The meta object literal for the '<em><b>Is Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__IS_MASTER = eINSTANCE.getBrick_IsMaster();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SA_ComponentImpl <em>SA Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SA_ComponentImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSA_Component()
		 * @generated
		 */
		EClass SA_COMPONENT = eINSTANCE.getSA_Component();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SW_ComponentImpl <em>SW Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SW_ComponentImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSW_Component()
		 * @generated
		 */
		EClass SW_COMPONENT = eINSTANCE.getSW_Component();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.PortsImpl <em>Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.PortsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getPorts()
		 * @generated
		 */
		EClass PORTS = eINSTANCE.getPorts();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SenderPortsImpl <em>Sender Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SenderPortsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSenderPorts()
		 * @generated
		 */
		EClass SENDER_PORTS = eINSTANCE.getSenderPorts();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ReceiverPortsImpl <em>Receiver Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ReceiverPortsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getReceiverPorts()
		 * @generated
		 */
		EClass RECEIVER_PORTS = eINSTANCE.getReceiverPorts();

		/**
		 * The meta object literal for the '<em><b>Blockierend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVER_PORTS__BLOCKIEREND = eINSTANCE.getReceiverPorts_Blockierend();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SenderImpl <em>Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SenderImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSender()
		 * @generated
		 */
		EClass SENDER = eINSTANCE.getSender();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ClientImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SendEventImpl <em>Send Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SendEventImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSendEvent()
		 * @generated
		 */
		EClass SEND_EVENT = eINSTANCE.getSendEvent();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ReceiverImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ServerImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.GetEventImpl <em>Get Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.GetEventImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getGetEvent()
		 * @generated
		 */
		EClass GET_EVENT = eINSTANCE.getGetEvent();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.StandardclassImpl <em>Standardclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.StandardclassImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getStandardclass()
		 * @generated
		 */
		EClass STANDARDCLASS = eINSTANCE.getStandardclass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARDCLASS__NAME = eINSTANCE.getStandardclass_Name();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.TaskImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Has Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_EVENT = eINSTANCE.getTask_HasEvent();

		/**
		 * The meta object literal for the '<em><b>Has Alarm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_ALARM = eINSTANCE.getTask_HasAlarm();

		/**
		 * The meta object literal for the '<em><b>Has Runnable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_RUNNABLE = eINSTANCE.getTask_HasRunnable();

		/**
		 * The meta object literal for the '<em><b>AUTOSTART</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__AUTOSTART = eINSTANCE.getTask_AUTOSTART();

		/**
		 * The meta object literal for the '<em><b>PRIORITY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_PRIORITY();

		/**
		 * The meta object literal for the '<em><b>ACTIVATION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ACTIVATION = eINSTANCE.getTask_ACTIVATION();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.EventImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.AlarmImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '<em><b>MINCYCLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__MINCYCLE = eINSTANCE.getAlarm_MINCYCLE();

		/**
		 * The meta object literal for the '<em><b>MAXALLOWEDVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__MAXALLOWEDVALUE = eINSTANCE.getAlarm_MAXALLOWEDVALUE();

		/**
		 * The meta object literal for the '<em><b>TICKSPERBASE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__TICKSPERBASE = eINSTANCE.getAlarm_TICKSPERBASE();

		/**
		 * The meta object literal for the '<em><b>AUTOSTART</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__AUTOSTART = eINSTANCE.getAlarm_AUTOSTART();

		/**
		 * The meta object literal for the '<em><b>ALARMTIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__ALARMTIME = eINSTANCE.getAlarm_ALARMTIME();

		/**
		 * The meta object literal for the '<em><b>CYCLETIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__CYCLETIME = eINSTANCE.getAlarm_CYCLETIME();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ConnectionsImpl <em>Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ConnectionsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getConnections()
		 * @generated
		 */
		EClass CONNECTIONS = eINSTANCE.getConnections();

		/**
		 * The meta object literal for the '<em><b>Has Receiver Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__HAS_RECEIVER_PORTS = eINSTANCE.getConnections_HasReceiverPorts();

		/**
		 * The meta object literal for the '<em><b>Has Sender Ports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__HAS_SENDER_PORTS = eINSTANCE.getConnections_HasSenderPorts();

		/**
		 * The meta object literal for the '<em><b>Has Inter Brick Communication System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__HAS_INTER_BRICK_COMMUNICATION_SYSTEM = eINSTANCE.getConnections_HasInterBrickCommunicationSystem();

		/**
		 * The meta object literal for the '<em><b>Has Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__HAS_MESSAGE = eINSTANCE.getConnections_HasMessage();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.RunnableImpl <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.RunnableImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getRunnable()
		 * @generated
		 */
		EClass RUNNABLE = eINSTANCE.getRunnable();

		/**
		 * The meta object literal for the '<em><b>Applicationcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__APPLICATIONCODE = eINSTANCE.getRunnable_Applicationcode();

		/**
		 * The meta object literal for the '<em><b>Has SW Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE__HAS_SW_PORTS = eINSTANCE.getRunnable_HasSWPorts();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl <em>Inter Brick Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.InterBrickCommunicationImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getInterBrickCommunication()
		 * @generated
		 */
		EClass INTER_BRICK_COMMUNICATION = eINSTANCE.getInterBrickCommunication();

		/**
		 * The meta object literal for the '<em><b>Message ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_BRICK_COMMUNICATION__MESSAGE_ID = eINSTANCE.getInterBrickCommunication_MessageID();

		/**
		 * The meta object literal for the '<em><b>Has IBC Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_BRICK_COMMUNICATION__HAS_IBC_OUT = eINSTANCE.getInterBrickCommunication_HasIBCOut();

		/**
		 * The meta object literal for the '<em><b>Has IBC In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_BRICK_COMMUNICATION__HAS_IBC_IN = eINSTANCE.getInterBrickCommunication_HasIBCIn();

		/**
		 * The meta object literal for the '<em><b>Has Receiver Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_BRICK_COMMUNICATION__HAS_RECEIVER_PORT = eINSTANCE.getInterBrickCommunication_HasReceiverPort();

		/**
		 * The meta object literal for the '<em><b>Has Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_BRICK_COMMUNICATION__HAS_MESSAGE = eINSTANCE.getInterBrickCommunication_HasMessage();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWPortsImpl <em>HW Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWPortsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWPorts()
		 * @generated
		 */
		EClass HW_PORTS = eINSTANCE.getHWPorts();

		/**
		 * The meta object literal for the '<em><b>Portname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORTS__PORTNAME = eINSTANCE.getHWPorts_Portname();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWInputImpl <em>HW Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWInputImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWInput()
		 * @generated
		 */
		EClass HW_INPUT = eINSTANCE.getHWInput();

		/**
		 * The meta object literal for the '<em><b>Has OSPORTS IN</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_INPUT__HAS_OSPORTS_IN = eINSTANCE.getHWInput_Has_OSPORTS_IN();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWOutputImpl <em>HW Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWOutputImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWOutput()
		 * @generated
		 */
		EClass HW_OUTPUT = eINSTANCE.getHWOutput();

		/**
		 * The meta object literal for the '<em><b>Has OSPORTS OUT</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_OUTPUT__HAS_OSPORTS_OUT = eINSTANCE.getHWOutput_Has_OSPORTS_OUT();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWInternImpl <em>HW Intern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWInternImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWIntern()
		 * @generated
		 */
		EClass HW_INTERN = eINSTANCE.getHWIntern();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_INTERN__TYPE = eINSTANCE.getHWIntern_Type();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWExternImpl <em>HW Extern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWExternImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWExtern()
		 * @generated
		 */
		EClass HW_EXTERN = eINSTANCE.getHWExtern();

		/**
		 * The meta object literal for the '<em><b>Pinnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_EXTERN__PINNUMBER = eINSTANCE.getHWExtern_Pinnumber();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.MotorImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.DisplayImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.MessageImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_HEADER = eINSTANCE.getMessage_MessageHeader();

		/**
		 * The meta object literal for the '<em><b>My Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MY_MESSAGE = eINSTANCE.getMessage_MyMessage();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.OSPortINImpl <em>OS Port IN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.OSPortINImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getOSPortIN()
		 * @generated
		 */
		EClass OS_PORT_IN = eINSTANCE.getOSPortIN();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.OSPortOUTImpl <em>OS Port OUT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.OSPortOUTImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getOSPortOUT()
		 * @generated
		 */
		EClass OS_PORT_OUT = eINSTANCE.getOSPortOUT();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.HWType <em>HW Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.HWType
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWType()
		 * @generated
		 */
		EEnum HW_TYPE = eINSTANCE.getHWType();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.HWPort <em>HW Port</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.HWPort
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWPort()
		 * @generated
		 */
		EEnum HW_PORT = eINSTANCE.getHWPort();

	}

} //ShootingmachineemfmodelPackage
