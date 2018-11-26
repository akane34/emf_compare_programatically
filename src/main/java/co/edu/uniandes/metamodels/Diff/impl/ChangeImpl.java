/**
 */
package co.edu.uniandes.metamodels.Diff.impl;

import co.edu.uniandes.metamodels.Diff.APIElementType;
import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.metamodels.Diff.DiffPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.ChangeImpl#getChangeElement <em>Change Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeImpl extends MinimalEObjectImpl.Container implements Change {
	/**
	 * The default value of the '{@link #getChangeElement() <em>Change Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeElement()
	 * @generated
	 * @ordered
	 */
	protected static final APIElementType CHANGE_ELEMENT_EDEFAULT = APIElementType.PACKAGE;

	/**
	 * The cached value of the '{@link #getChangeElement() <em>Change Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeElement()
	 * @generated
	 * @ordered
	 */
	protected APIElementType changeElement = CHANGE_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffPackage.Literals.CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIElementType getChangeElement() {
		return changeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeElement(APIElementType newChangeElement) {
		APIElementType oldChangeElement = changeElement;
		changeElement = newChangeElement == null ? CHANGE_ELEMENT_EDEFAULT : newChangeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.CHANGE__CHANGE_ELEMENT, oldChangeElement, changeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffPackage.CHANGE__CHANGE_ELEMENT:
				return getChangeElement();
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
			case DiffPackage.CHANGE__CHANGE_ELEMENT:
				setChangeElement((APIElementType)newValue);
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
			case DiffPackage.CHANGE__CHANGE_ELEMENT:
				setChangeElement(CHANGE_ELEMENT_EDEFAULT);
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
			case DiffPackage.CHANGE__CHANGE_ELEMENT:
				return changeElement != CHANGE_ELEMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (changeElement: ");
		result.append(changeElement);
		result.append(')');
		return result.toString();
	}

} //ChangeImpl
