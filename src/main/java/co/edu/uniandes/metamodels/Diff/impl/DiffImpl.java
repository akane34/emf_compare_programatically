/**
 */
package co.edu.uniandes.metamodels.Diff.impl;

import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.metamodels.Diff.Diff;
import co.edu.uniandes.metamodels.Diff.DiffPackage;
import co.edu.uniandes.metamodels.Diff.RefactoringType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.DiffImpl#getNewVersion <em>New Version</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.DiffImpl#getOldVersion <em>Old Version</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.DiffImpl#getRefactoringType <em>Refactoring Type</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.DiffImpl#getChange <em>Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffImpl extends MinimalEObjectImpl.Container implements Diff {
	/**
	 * The default value of the '{@link #getNewVersion() <em>New Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewVersion() <em>New Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewVersion()
	 * @generated
	 * @ordered
	 */
	protected String newVersion = NEW_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldVersion() <em>Old Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldVersion() <em>Old Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersion()
	 * @generated
	 * @ordered
	 */
	protected String oldVersion = OLD_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefactoringType() <em>Refactoring Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefactoringType()
	 * @generated
	 * @ordered
	 */
	protected EList<RefactoringType> refactoringType;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected EList<Change> change;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffPackage.Literals.DIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewVersion() {
		return newVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewVersion(String newNewVersion) {
		String oldNewVersion = newVersion;
		newVersion = newNewVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.DIFF__NEW_VERSION, oldNewVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldVersion() {
		return oldVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldVersion(String newOldVersion) {
		String oldOldVersion = oldVersion;
		oldVersion = newOldVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.DIFF__OLD_VERSION, oldOldVersion, oldVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefactoringType> getRefactoringType() {
		if (refactoringType == null) {
			refactoringType = new EObjectContainmentEList<RefactoringType>(RefactoringType.class, this, DiffPackage.DIFF__REFACTORING_TYPE);
		}
		return refactoringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Change> getChange() {
		if (change == null) {
			change = new EObjectContainmentEList<Change>(Change.class, this, DiffPackage.DIFF__CHANGE);
		}
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiffPackage.DIFF__REFACTORING_TYPE:
				return ((InternalEList<?>)getRefactoringType()).basicRemove(otherEnd, msgs);
			case DiffPackage.DIFF__CHANGE:
				return ((InternalEList<?>)getChange()).basicRemove(otherEnd, msgs);
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
			case DiffPackage.DIFF__NEW_VERSION:
				return getNewVersion();
			case DiffPackage.DIFF__OLD_VERSION:
				return getOldVersion();
			case DiffPackage.DIFF__REFACTORING_TYPE:
				return getRefactoringType();
			case DiffPackage.DIFF__CHANGE:
				return getChange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiffPackage.DIFF__NEW_VERSION:
				setNewVersion((String)newValue);
				return;
			case DiffPackage.DIFF__OLD_VERSION:
				setOldVersion((String)newValue);
				return;
			case DiffPackage.DIFF__REFACTORING_TYPE:
				getRefactoringType().clear();
				getRefactoringType().addAll((Collection<? extends RefactoringType>)newValue);
				return;
			case DiffPackage.DIFF__CHANGE:
				getChange().clear();
				getChange().addAll((Collection<? extends Change>)newValue);
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
			case DiffPackage.DIFF__NEW_VERSION:
				setNewVersion(NEW_VERSION_EDEFAULT);
				return;
			case DiffPackage.DIFF__OLD_VERSION:
				setOldVersion(OLD_VERSION_EDEFAULT);
				return;
			case DiffPackage.DIFF__REFACTORING_TYPE:
				getRefactoringType().clear();
				return;
			case DiffPackage.DIFF__CHANGE:
				getChange().clear();
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
			case DiffPackage.DIFF__NEW_VERSION:
				return NEW_VERSION_EDEFAULT == null ? newVersion != null : !NEW_VERSION_EDEFAULT.equals(newVersion);
			case DiffPackage.DIFF__OLD_VERSION:
				return OLD_VERSION_EDEFAULT == null ? oldVersion != null : !OLD_VERSION_EDEFAULT.equals(oldVersion);
			case DiffPackage.DIFF__REFACTORING_TYPE:
				return refactoringType != null && !refactoringType.isEmpty();
			case DiffPackage.DIFF__CHANGE:
				return change != null && !change.isEmpty();
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
		result.append(" (newVersion: ");
		result.append(newVersion);
		result.append(", oldVersion: ");
		result.append(oldVersion);
		result.append(')');
		return result.toString();
	}

} //DiffImpl
