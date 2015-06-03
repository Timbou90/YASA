/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import shootingmachineemfmodel.Alarm;
import shootingmachineemfmodel.Counter;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.AlarmImpl#getHasCounter <em>Has Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlarmImpl extends StandardclassImpl implements Alarm {
	/**
	 * The cached value of the '{@link #getHasCounter() <em>Has Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCounter()
	 * @generated
	 * @ordered
	 */
	protected Counter hasCounter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter getHasCounter() {
		return hasCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasCounter(Counter newHasCounter, NotificationChain msgs) {
		Counter oldHasCounter = hasCounter;
		hasCounter = newHasCounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER, oldHasCounter, newHasCounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCounter(Counter newHasCounter) {
		if (newHasCounter != hasCounter) {
			NotificationChain msgs = null;
			if (hasCounter != null)
				msgs = ((InternalEObject)hasCounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER, null, msgs);
			if (newHasCounter != null)
				msgs = ((InternalEObject)newHasCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER, null, msgs);
			msgs = basicSetHasCounter(newHasCounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER, newHasCounter, newHasCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER:
				return basicSetHasCounter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER:
				return getHasCounter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER:
				setHasCounter((Counter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER:
				setHasCounter((Counter)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.ALARM__HAS_COUNTER:
				return hasCounter != null;
		}
		return super.eIsSet(featureID);
	}

} //AlarmImpl