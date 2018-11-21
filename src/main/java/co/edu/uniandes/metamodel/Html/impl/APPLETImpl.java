/**
 */
package co.edu.uniandes.metamodel.Html.impl;

import co.edu.uniandes.metamodel.Html.APPLET;
import co.edu.uniandes.metamodel.Html.HtmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APPLET</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.APPLETImpl#getApplet <em>Applet</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.APPLETImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.APPLETImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.APPLETImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.APPLETImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.APPLETImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APPLETImpl extends MinimalEObjectImpl.Container implements APPLET {
	/**
	 * The cached value of the '{@link #getApplet() <em>Applet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplet()
	 * @generated
	 * @ordered
	 */
	protected Object applet;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Object class_;

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
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Object height;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APPLETImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.APPLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getApplet() {
		return applet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplet(Object newApplet) {
		Object oldApplet = applet;
		applet = newApplet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.APPLET__APPLET, oldApplet, applet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(Object newClass) {
		Object oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.APPLET__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.APPLET__SRC, oldSrc, src));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.APPLET__ALIGN, oldAlign, align));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.APPLET__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Object newHeight) {
		Object oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.APPLET__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.APPLET__APPLET:
				return getApplet();
			case HtmlPackage.APPLET__CLASS:
				return getClass_();
			case HtmlPackage.APPLET__SRC:
				return getSrc();
			case HtmlPackage.APPLET__ALIGN:
				return getAlign();
			case HtmlPackage.APPLET__WIDTH:
				return getWidth();
			case HtmlPackage.APPLET__HEIGHT:
				return getHeight();
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
			case HtmlPackage.APPLET__APPLET:
				setApplet(newValue);
				return;
			case HtmlPackage.APPLET__CLASS:
				setClass(newValue);
				return;
			case HtmlPackage.APPLET__SRC:
				setSrc(newValue);
				return;
			case HtmlPackage.APPLET__ALIGN:
				setAlign(newValue);
				return;
			case HtmlPackage.APPLET__WIDTH:
				setWidth(newValue);
				return;
			case HtmlPackage.APPLET__HEIGHT:
				setHeight(newValue);
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
			case HtmlPackage.APPLET__APPLET:
				setApplet((Object)null);
				return;
			case HtmlPackage.APPLET__CLASS:
				setClass((Object)null);
				return;
			case HtmlPackage.APPLET__SRC:
				setSrc((Object)null);
				return;
			case HtmlPackage.APPLET__ALIGN:
				setAlign((Object)null);
				return;
			case HtmlPackage.APPLET__WIDTH:
				setWidth((Object)null);
				return;
			case HtmlPackage.APPLET__HEIGHT:
				setHeight((Object)null);
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
			case HtmlPackage.APPLET__APPLET:
				return applet != null;
			case HtmlPackage.APPLET__CLASS:
				return class_ != null;
			case HtmlPackage.APPLET__SRC:
				return src != null;
			case HtmlPackage.APPLET__ALIGN:
				return align != null;
			case HtmlPackage.APPLET__WIDTH:
				return width != null;
			case HtmlPackage.APPLET__HEIGHT:
				return height != null;
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
		result.append(" (applet: ");
		result.append(applet);
		result.append(", class: ");
		result.append(class_);
		result.append(", src: ");
		result.append(src);
		result.append(", align: ");
		result.append(align);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //APPLETImpl
