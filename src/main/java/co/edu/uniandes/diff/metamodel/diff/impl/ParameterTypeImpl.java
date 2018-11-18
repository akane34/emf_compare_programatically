/**
 */
package co.edu.uniandes.diff.metamodel.diff.impl;

import co.edu.uniandes.diff.metamodel.diff.ElementDefinition;
import co.edu.uniandes.diff.metamodel.diff.ParameterType;
import co.edu.uniandes.diff.metamodel.diff.diffPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.diff.impl.ParameterTypeImpl#getOldDefinition <em>Old Definition</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.diff.impl.ParameterTypeImpl#getNewDefinition <em>New Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterTypeImpl extends ModifyImpl implements ParameterType {
	/**
	 * The cached value of the '{@link #getOldDefinition() <em>Old Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldDefinition()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinition oldDefinition;

	/**
	 * The cached value of the '{@link #getNewDefinition() <em>New Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDefinition()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinition newDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return diffPackage.Literals.PARAMETER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition getOldDefinition() {
		return oldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOldDefinition(ElementDefinition newOldDefinition, NotificationChain msgs) {
		ElementDefinition oldOldDefinition = oldDefinition;
		oldDefinition = newOldDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, diffPackage.PARAMETER_TYPE__OLD_DEFINITION, oldOldDefinition, newOldDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldDefinition(ElementDefinition newOldDefinition) {
		if (newOldDefinition != oldDefinition) {
			NotificationChain msgs = null;
			if (oldDefinition != null)
				msgs = ((InternalEObject)oldDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - diffPackage.PARAMETER_TYPE__OLD_DEFINITION, null, msgs);
			if (newOldDefinition != null)
				msgs = ((InternalEObject)newOldDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - diffPackage.PARAMETER_TYPE__OLD_DEFINITION, null, msgs);
			msgs = basicSetOldDefinition(newOldDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, diffPackage.PARAMETER_TYPE__OLD_DEFINITION, newOldDefinition, newOldDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition getNewDefinition() {
		return newDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewDefinition(ElementDefinition newNewDefinition, NotificationChain msgs) {
		ElementDefinition oldNewDefinition = newDefinition;
		newDefinition = newNewDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, diffPackage.PARAMETER_TYPE__NEW_DEFINITION, oldNewDefinition, newNewDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewDefinition(ElementDefinition newNewDefinition) {
		if (newNewDefinition != newDefinition) {
			NotificationChain msgs = null;
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - diffPackage.PARAMETER_TYPE__NEW_DEFINITION, null, msgs);
			if (newNewDefinition != null)
				msgs = ((InternalEObject)newNewDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - diffPackage.PARAMETER_TYPE__NEW_DEFINITION, null, msgs);
			msgs = basicSetNewDefinition(newNewDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, diffPackage.PARAMETER_TYPE__NEW_DEFINITION, newNewDefinition, newNewDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case diffPackage.PARAMETER_TYPE__OLD_DEFINITION:
				return basicSetOldDefinition(null, msgs);
			case diffPackage.PARAMETER_TYPE__NEW_DEFINITION:
				return basicSetNewDefinition(null, msgs);
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
			case diffPackage.PARAMETER_TYPE__OLD_DEFINITION:
				return getOldDefinition();
			case diffPackage.PARAMETER_TYPE__NEW_DEFINITION:
				return getNewDefinition();
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
			case diffPackage.PARAMETER_TYPE__OLD_DEFINITION:
				setOldDefinition((ElementDefinition)newValue);
				return;
			case diffPackage.PARAMETER_TYPE__NEW_DEFINITION:
				setNewDefinition((ElementDefinition)newValue);
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
			case diffPackage.PARAMETER_TYPE__OLD_DEFINITION:
				setOldDefinition((ElementDefinition)null);
				return;
			case diffPackage.PARAMETER_TYPE__NEW_DEFINITION:
				setNewDefinition((ElementDefinition)null);
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
			case diffPackage.PARAMETER_TYPE__OLD_DEFINITION:
				return oldDefinition != null;
			case diffPackage.PARAMETER_TYPE__NEW_DEFINITION:
				return newDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterTypeImpl
