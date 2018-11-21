/**
 */
package co.edu.uniandes.metamodel.Html.impl;

import co.edu.uniandes.metamodel.Html.HtmlPackage;
import co.edu.uniandes.metamodel.Html.TD;
import co.edu.uniandes.metamodel.Html.TR;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.TDImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.TDImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.TDImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.TDImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.TDImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.TDImpl#getTr <em>Tr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDImpl extends TABLEElementImpl implements TD {
	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected Object colspan;

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected Object rowspan;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected Object valign;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected Object align;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width;

	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected TR tr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.TD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspan(Object newColspan) {
		Object oldColspan = colspan;
		colspan = newColspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__COLSPAN, oldColspan, colspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowspan(Object newRowspan) {
		Object oldRowspan = rowspan;
		rowspan = newRowspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__ROWSPAN, oldRowspan, rowspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValign(Object newValign) {
		Object oldValign = valign;
		valign = newValign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__VALIGN, oldValign, valign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Object newAlign) {
		Object oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TR getTr() {
		if (tr != null && tr.eIsProxy()) {
			InternalEObject oldTr = (InternalEObject)tr;
			tr = (TR)eResolveProxy(oldTr);
			if (tr != oldTr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HtmlPackage.TD__TR, oldTr, tr));
			}
		}
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TR basicGetTr() {
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTr(TR newTr, NotificationChain msgs) {
		TR oldTr = tr;
		tr = newTr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__TR, oldTr, newTr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTr(TR newTr) {
		if (newTr != tr) {
			NotificationChain msgs = null;
			if (tr != null)
				msgs = ((InternalEObject)tr).eInverseRemove(this, HtmlPackage.TR__TDS, TR.class, msgs);
			if (newTr != null)
				msgs = ((InternalEObject)newTr).eInverseAdd(this, HtmlPackage.TR__TDS, TR.class, msgs);
			msgs = basicSetTr(newTr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__TR, newTr, newTr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.TD__TR:
				if (tr != null)
					msgs = ((InternalEObject)tr).eInverseRemove(this, HtmlPackage.TR__TDS, TR.class, msgs);
				return basicSetTr((TR)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.TD__TR:
				return basicSetTr(null, msgs);
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
			case HtmlPackage.TD__COLSPAN:
				return getColspan();
			case HtmlPackage.TD__ROWSPAN:
				return getRowspan();
			case HtmlPackage.TD__VALIGN:
				return getValign();
			case HtmlPackage.TD__ALIGN:
				return getAlign();
			case HtmlPackage.TD__WIDTH:
				return getWidth();
			case HtmlPackage.TD__TR:
				if (resolve) return getTr();
				return basicGetTr();
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
			case HtmlPackage.TD__COLSPAN:
				setColspan(newValue);
				return;
			case HtmlPackage.TD__ROWSPAN:
				setRowspan(newValue);
				return;
			case HtmlPackage.TD__VALIGN:
				setValign(newValue);
				return;
			case HtmlPackage.TD__ALIGN:
				setAlign(newValue);
				return;
			case HtmlPackage.TD__WIDTH:
				setWidth(newValue);
				return;
			case HtmlPackage.TD__TR:
				setTr((TR)newValue);
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
			case HtmlPackage.TD__COLSPAN:
				setColspan((Object)null);
				return;
			case HtmlPackage.TD__ROWSPAN:
				setRowspan((Object)null);
				return;
			case HtmlPackage.TD__VALIGN:
				setValign((Object)null);
				return;
			case HtmlPackage.TD__ALIGN:
				setAlign((Object)null);
				return;
			case HtmlPackage.TD__WIDTH:
				setWidth((Object)null);
				return;
			case HtmlPackage.TD__TR:
				setTr((TR)null);
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
			case HtmlPackage.TD__COLSPAN:
				return colspan != null;
			case HtmlPackage.TD__ROWSPAN:
				return rowspan != null;
			case HtmlPackage.TD__VALIGN:
				return valign != null;
			case HtmlPackage.TD__ALIGN:
				return align != null;
			case HtmlPackage.TD__WIDTH:
				return width != null;
			case HtmlPackage.TD__TR:
				return tr != null;
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
		result.append(" (colspan: ");
		result.append(colspan);
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(", valign: ");
		result.append(valign);
		result.append(", align: ");
		result.append(align);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //TDImpl
