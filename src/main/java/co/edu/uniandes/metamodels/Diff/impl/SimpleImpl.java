/**
 */
package co.edu.uniandes.metamodels.Diff.impl;

import co.edu.uniandes.metamodels.Diff.DiffPackage;
import co.edu.uniandes.metamodels.Diff.ElementReference;
import co.edu.uniandes.metamodels.Diff.Simple;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.SimpleImpl#getNew <em>New</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.impl.SimpleImpl#getOld <em>Old</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleImpl extends ChangeImpl implements Simple {
	/**
	 * The cached value of the '{@link #getNew() <em>New</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew()
	 * @generated
	 * @ordered
	 */
	protected ElementReference new_;

	/**
	 * The cached value of the '{@link #getOld() <em>Old</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOld()
	 * @generated
	 * @ordered
	 */
	protected ElementReference old;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffPackage.Literals.SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementReference getNew() {
		return new_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNew(ElementReference newNew, NotificationChain msgs) {
		ElementReference oldNew = new_;
		new_ = newNew;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiffPackage.SIMPLE__NEW, oldNew, newNew);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew(ElementReference newNew) {
		if (newNew != new_) {
			NotificationChain msgs = null;
			if (new_ != null)
				msgs = ((InternalEObject)new_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiffPackage.SIMPLE__NEW, null, msgs);
			if (newNew != null)
				msgs = ((InternalEObject)newNew).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiffPackage.SIMPLE__NEW, null, msgs);
			msgs = basicSetNew(newNew, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.SIMPLE__NEW, newNew, newNew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementReference getOld() {
		return old;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOld(ElementReference newOld, NotificationChain msgs) {
		ElementReference oldOld = old;
		old = newOld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiffPackage.SIMPLE__OLD, oldOld, newOld);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOld(ElementReference newOld) {
		if (newOld != old) {
			NotificationChain msgs = null;
			if (old != null)
				msgs = ((InternalEObject)old).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiffPackage.SIMPLE__OLD, null, msgs);
			if (newOld != null)
				msgs = ((InternalEObject)newOld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiffPackage.SIMPLE__OLD, null, msgs);
			msgs = basicSetOld(newOld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.SIMPLE__OLD, newOld, newOld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiffPackage.SIMPLE__NEW:
				return basicSetNew(null, msgs);
			case DiffPackage.SIMPLE__OLD:
				return basicSetOld(null, msgs);
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
			case DiffPackage.SIMPLE__NEW:
				return getNew();
			case DiffPackage.SIMPLE__OLD:
				return getOld();
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
			case DiffPackage.SIMPLE__NEW:
				setNew((ElementReference)newValue);
				return;
			case DiffPackage.SIMPLE__OLD:
				setOld((ElementReference)newValue);
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
			case DiffPackage.SIMPLE__NEW:
				setNew((ElementReference)null);
				return;
			case DiffPackage.SIMPLE__OLD:
				setOld((ElementReference)null);
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
			case DiffPackage.SIMPLE__NEW:
				return new_ != null;
			case DiffPackage.SIMPLE__OLD:
				return old != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleImpl
