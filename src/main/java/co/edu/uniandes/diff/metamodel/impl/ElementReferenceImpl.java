/**
 */
package co.edu.uniandes.diff.metamodel.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import co.edu.uniandes.diff.metamodel.APIElement;
import co.edu.uniandes.diff.metamodel.DiffPackage;
import co.edu.uniandes.diff.metamodel.ElementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.impl.ElementReferenceImpl#getApiElementName <em>Api Element Name</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.impl.ElementReferenceImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.impl.ElementReferenceImpl#getApiElement <em>Api Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementReferenceImpl extends MinimalEObjectImpl.Container implements ElementReference {
	/**
	 * The default value of the '{@link #getApiElementName() <em>Api Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String API_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiElementName() <em>Api Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiElementName()
	 * @generated
	 * @ordered
	 */
	protected String apiElementName = API_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApiElement() <em>Api Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiElement()
	 * @generated
	 * @ordered
	 */
	protected APIElement apiElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffPackage.Literals.ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiElementName() {
		return apiElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiElementName(String newApiElementName) {
		String oldApiElementName = apiElementName;
		apiElementName = newApiElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.ELEMENT_REFERENCE__API_ELEMENT_NAME, oldApiElementName, apiElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(BigInteger newLineNumber) {
		BigInteger oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.ELEMENT_REFERENCE__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIElement getApiElement() {
		if (apiElement != null && apiElement.eIsProxy()) {
			InternalEObject oldApiElement = (InternalEObject)apiElement;
			apiElement = (APIElement)eResolveProxy(oldApiElement);
			if (apiElement != oldApiElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiffPackage.ELEMENT_REFERENCE__API_ELEMENT, oldApiElement, apiElement));
			}
		}
		return apiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIElement basicGetApiElement() {
		return apiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiElement(APIElement newApiElement) {
		APIElement oldApiElement = apiElement;
		apiElement = newApiElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.ELEMENT_REFERENCE__API_ELEMENT, oldApiElement, apiElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffPackage.ELEMENT_REFERENCE__API_ELEMENT_NAME:
				return getApiElementName();
			case DiffPackage.ELEMENT_REFERENCE__LINE_NUMBER:
				return getLineNumber();
			case DiffPackage.ELEMENT_REFERENCE__API_ELEMENT:
				if (resolve) return getApiElement();
				return basicGetApiElement();
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
			case DiffPackage.ELEMENT_REFERENCE__API_ELEMENT_NAME:
				setApiElementName((String)newValue);
				return;
			case DiffPackage.ELEMENT_REFERENCE__LINE_NUMBER:
				setLineNumber((BigInteger)newValue);
				return;
			case DiffPackage.ELEMENT_REFERENCE__API_ELEMENT:
				setApiElement((APIElement)newValue);
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
			case DiffPackage.ELEMENT_REFERENCE__API_ELEMENT_NAME:
				setApiElementName(API_ELEMENT_NAME_EDEFAULT);
				return;
			case DiffPackage.ELEMENT_REFERENCE__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case DiffPackage.ELEMENT_REFERENCE__API_ELEMENT:
				setApiElement((APIElement)null);
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
			case DiffPackage.ELEMENT_REFERENCE__API_ELEMENT_NAME:
				return API_ELEMENT_NAME_EDEFAULT == null ? apiElementName != null : !API_ELEMENT_NAME_EDEFAULT.equals(apiElementName);
			case DiffPackage.ELEMENT_REFERENCE__LINE_NUMBER:
				return LINE_NUMBER_EDEFAULT == null ? lineNumber != null : !LINE_NUMBER_EDEFAULT.equals(lineNumber);
			case DiffPackage.ELEMENT_REFERENCE__API_ELEMENT:
				return apiElement != null;
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
		result.append(" (apiElementName: ");
		result.append(apiElementName);
		result.append(", lineNumber: ");
		result.append(lineNumber);
		result.append(')');
		return result.toString();
	}

} //ElementReferenceImpl
