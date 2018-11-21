/**
 */
package co.edu.uniandes.metamodel.Html.impl;

import co.edu.uniandes.metamodel.Html.FRAME;
import co.edu.uniandes.metamodel.Html.HtmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FRAME</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMEImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMEImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMEImpl#getMarginwidth <em>Marginwidth</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMEImpl#getMarginheight <em>Marginheight</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMEImpl#getScrolling <em>Scrolling</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMEImpl#getNoresize <em>Noresize</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FRAMEImpl extends MinimalEObjectImpl.Container implements FRAME {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Object src;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name;

	/**
	 * The cached value of the '{@link #getMarginwidth() <em>Marginwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginwidth()
	 * @generated
	 * @ordered
	 */
	protected Object marginwidth;

	/**
	 * The cached value of the '{@link #getMarginheight() <em>Marginheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginheight()
	 * @generated
	 * @ordered
	 */
	protected Object marginheight;

	/**
	 * The cached value of the '{@link #getScrolling() <em>Scrolling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrolling()
	 * @generated
	 * @ordered
	 */
	protected Object scrolling;

	/**
	 * The cached value of the '{@link #getNoresize() <em>Noresize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoresize()
	 * @generated
	 * @ordered
	 */
	protected Object noresize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FRAMEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(Object newSrc) {
		Object oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMarginwidth() {
		return marginwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginwidth(Object newMarginwidth) {
		Object oldMarginwidth = marginwidth;
		marginwidth = newMarginwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__MARGINWIDTH, oldMarginwidth, marginwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMarginheight() {
		return marginheight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginheight(Object newMarginheight) {
		Object oldMarginheight = marginheight;
		marginheight = newMarginheight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__MARGINHEIGHT, oldMarginheight, marginheight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getScrolling() {
		return scrolling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrolling(Object newScrolling) {
		Object oldScrolling = scrolling;
		scrolling = newScrolling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__SCROLLING, oldScrolling, scrolling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNoresize() {
		return noresize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoresize(Object newNoresize) {
		Object oldNoresize = noresize;
		noresize = newNoresize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__NORESIZE, oldNoresize, noresize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.FRAME__SRC:
				return getSrc();
			case HtmlPackage.FRAME__NAME:
				return getName();
			case HtmlPackage.FRAME__MARGINWIDTH:
				return getMarginwidth();
			case HtmlPackage.FRAME__MARGINHEIGHT:
				return getMarginheight();
			case HtmlPackage.FRAME__SCROLLING:
				return getScrolling();
			case HtmlPackage.FRAME__NORESIZE:
				return getNoresize();
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
			case HtmlPackage.FRAME__SRC:
				setSrc(newValue);
				return;
			case HtmlPackage.FRAME__NAME:
				setName(newValue);
				return;
			case HtmlPackage.FRAME__MARGINWIDTH:
				setMarginwidth(newValue);
				return;
			case HtmlPackage.FRAME__MARGINHEIGHT:
				setMarginheight(newValue);
				return;
			case HtmlPackage.FRAME__SCROLLING:
				setScrolling(newValue);
				return;
			case HtmlPackage.FRAME__NORESIZE:
				setNoresize(newValue);
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
			case HtmlPackage.FRAME__SRC:
				setSrc((Object)null);
				return;
			case HtmlPackage.FRAME__NAME:
				setName((Object)null);
				return;
			case HtmlPackage.FRAME__MARGINWIDTH:
				setMarginwidth((Object)null);
				return;
			case HtmlPackage.FRAME__MARGINHEIGHT:
				setMarginheight((Object)null);
				return;
			case HtmlPackage.FRAME__SCROLLING:
				setScrolling((Object)null);
				return;
			case HtmlPackage.FRAME__NORESIZE:
				setNoresize((Object)null);
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
			case HtmlPackage.FRAME__SRC:
				return src != null;
			case HtmlPackage.FRAME__NAME:
				return name != null;
			case HtmlPackage.FRAME__MARGINWIDTH:
				return marginwidth != null;
			case HtmlPackage.FRAME__MARGINHEIGHT:
				return marginheight != null;
			case HtmlPackage.FRAME__SCROLLING:
				return scrolling != null;
			case HtmlPackage.FRAME__NORESIZE:
				return noresize != null;
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
		result.append(" (src: ");
		result.append(src);
		result.append(", name: ");
		result.append(name);
		result.append(", marginwidth: ");
		result.append(marginwidth);
		result.append(", marginheight: ");
		result.append(marginheight);
		result.append(", scrolling: ");
		result.append(scrolling);
		result.append(", noresize: ");
		result.append(noresize);
		result.append(')');
		return result.toString();
	}

} //FRAMEImpl
