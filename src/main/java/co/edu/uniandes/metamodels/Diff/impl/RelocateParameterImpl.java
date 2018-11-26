/**
 */
package co.edu.uniandes.metamodels.Diff.impl;

import co.edu.uniandes.metamodels.Diff.DiffPackage;
import co.edu.uniandes.metamodels.Diff.ParameterLocation;
import co.edu.uniandes.metamodels.Diff.RelocateParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relocate Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.RelocateParameterImpl#getNewLocation <em>New Location</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.RelocateParameterImpl#getOldLocation <em>Old Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelocateParameterImpl extends ComplexImpl implements RelocateParameter {
	/**
	 * The default value of the '{@link #getNewLocation() <em>New Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterLocation NEW_LOCATION_EDEFAULT = ParameterLocation.QUERY;

	/**
	 * The cached value of the '{@link #getNewLocation() <em>New Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewLocation()
	 * @generated
	 * @ordered
	 */
	protected ParameterLocation newLocation = NEW_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldLocation() <em>Old Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterLocation OLD_LOCATION_EDEFAULT = ParameterLocation.QUERY;

	/**
	 * The cached value of the '{@link #getOldLocation() <em>Old Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldLocation()
	 * @generated
	 * @ordered
	 */
	protected ParameterLocation oldLocation = OLD_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelocateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffPackage.Literals.RELOCATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation getNewLocation() {
		return newLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewLocation(ParameterLocation newNewLocation) {
		ParameterLocation oldNewLocation = newLocation;
		newLocation = newNewLocation == null ? NEW_LOCATION_EDEFAULT : newNewLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.RELOCATE_PARAMETER__NEW_LOCATION, oldNewLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation getOldLocation() {
		return oldLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldLocation(ParameterLocation newOldLocation) {
		ParameterLocation oldOldLocation = oldLocation;
		oldLocation = newOldLocation == null ? OLD_LOCATION_EDEFAULT : newOldLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.RELOCATE_PARAMETER__OLD_LOCATION, oldOldLocation, oldLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffPackage.RELOCATE_PARAMETER__NEW_LOCATION:
				return getNewLocation();
			case DiffPackage.RELOCATE_PARAMETER__OLD_LOCATION:
				return getOldLocation();
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
			case DiffPackage.RELOCATE_PARAMETER__NEW_LOCATION:
				setNewLocation((ParameterLocation)newValue);
				return;
			case DiffPackage.RELOCATE_PARAMETER__OLD_LOCATION:
				setOldLocation((ParameterLocation)newValue);
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
			case DiffPackage.RELOCATE_PARAMETER__NEW_LOCATION:
				setNewLocation(NEW_LOCATION_EDEFAULT);
				return;
			case DiffPackage.RELOCATE_PARAMETER__OLD_LOCATION:
				setOldLocation(OLD_LOCATION_EDEFAULT);
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
			case DiffPackage.RELOCATE_PARAMETER__NEW_LOCATION:
				return newLocation != NEW_LOCATION_EDEFAULT;
			case DiffPackage.RELOCATE_PARAMETER__OLD_LOCATION:
				return oldLocation != OLD_LOCATION_EDEFAULT;
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
		result.append(" (newLocation: ");
		result.append(newLocation);
		result.append(", oldLocation: ");
		result.append(oldLocation);
		result.append(')');
		return result.toString();
	}

} //RelocateParameterImpl
