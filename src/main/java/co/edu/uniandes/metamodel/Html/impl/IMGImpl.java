/**
 */
package co.edu.uniandes.metamodel.Html.impl;

import co.edu.uniandes.metamodel.Html.HtmlPackage;
import co.edu.uniandes.metamodel.Html.IMG;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getVspace <em>Vspace</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getHspace <em>Hspace</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getIsmap <em>Ismap</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getUsemap <em>Usemap</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.IMGImpl#getBorder <em>Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMGImpl extends BODYElementImpl implements IMG {
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
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected Object alt;

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
	 * The cached value of the '{@link #getVspace() <em>Vspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVspace()
	 * @generated
	 * @ordered
	 */
	protected Object vspace;

	/**
	 * The cached value of the '{@link #getHspace() <em>Hspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHspace()
	 * @generated
	 * @ordered
	 */
	protected Object hspace;

	/**
	 * The cached value of the '{@link #getIsmap() <em>Ismap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmap()
	 * @generated
	 * @ordered
	 */
	protected Object ismap;

	/**
	 * The cached value of the '{@link #getUsemap() <em>Usemap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsemap()
	 * @generated
	 * @ordered
	 */
	protected Object usemap;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected Object border;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.IMG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__SRC, oldSrc, src));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(Object newAlt) {
		Object oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__ALT, oldAlt, alt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVspace() {
		return vspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVspace(Object newVspace) {
		Object oldVspace = vspace;
		vspace = newVspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__VSPACE, oldVspace, vspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHspace() {
		return hspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHspace(Object newHspace) {
		Object oldHspace = hspace;
		hspace = newHspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__HSPACE, oldHspace, hspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsmap() {
		return ismap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsmap(Object newIsmap) {
		Object oldIsmap = ismap;
		ismap = newIsmap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__ISMAP, oldIsmap, ismap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUsemap() {
		return usemap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsemap(Object newUsemap) {
		Object oldUsemap = usemap;
		usemap = newUsemap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__USEMAP, oldUsemap, usemap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(Object newBorder) {
		Object oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.IMG__SRC:
				return getSrc();
			case HtmlPackage.IMG__WIDTH:
				return getWidth();
			case HtmlPackage.IMG__HEIGHT:
				return getHeight();
			case HtmlPackage.IMG__ALT:
				return getAlt();
			case HtmlPackage.IMG__ALIGN:
				return getAlign();
			case HtmlPackage.IMG__VSPACE:
				return getVspace();
			case HtmlPackage.IMG__HSPACE:
				return getHspace();
			case HtmlPackage.IMG__ISMAP:
				return getIsmap();
			case HtmlPackage.IMG__USEMAP:
				return getUsemap();
			case HtmlPackage.IMG__BORDER:
				return getBorder();
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
			case HtmlPackage.IMG__SRC:
				setSrc(newValue);
				return;
			case HtmlPackage.IMG__WIDTH:
				setWidth(newValue);
				return;
			case HtmlPackage.IMG__HEIGHT:
				setHeight(newValue);
				return;
			case HtmlPackage.IMG__ALT:
				setAlt(newValue);
				return;
			case HtmlPackage.IMG__ALIGN:
				setAlign(newValue);
				return;
			case HtmlPackage.IMG__VSPACE:
				setVspace(newValue);
				return;
			case HtmlPackage.IMG__HSPACE:
				setHspace(newValue);
				return;
			case HtmlPackage.IMG__ISMAP:
				setIsmap(newValue);
				return;
			case HtmlPackage.IMG__USEMAP:
				setUsemap(newValue);
				return;
			case HtmlPackage.IMG__BORDER:
				setBorder(newValue);
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
			case HtmlPackage.IMG__SRC:
				setSrc((Object)null);
				return;
			case HtmlPackage.IMG__WIDTH:
				setWidth((Object)null);
				return;
			case HtmlPackage.IMG__HEIGHT:
				setHeight((Object)null);
				return;
			case HtmlPackage.IMG__ALT:
				setAlt((Object)null);
				return;
			case HtmlPackage.IMG__ALIGN:
				setAlign((Object)null);
				return;
			case HtmlPackage.IMG__VSPACE:
				setVspace((Object)null);
				return;
			case HtmlPackage.IMG__HSPACE:
				setHspace((Object)null);
				return;
			case HtmlPackage.IMG__ISMAP:
				setIsmap((Object)null);
				return;
			case HtmlPackage.IMG__USEMAP:
				setUsemap((Object)null);
				return;
			case HtmlPackage.IMG__BORDER:
				setBorder((Object)null);
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
			case HtmlPackage.IMG__SRC:
				return src != null;
			case HtmlPackage.IMG__WIDTH:
				return width != null;
			case HtmlPackage.IMG__HEIGHT:
				return height != null;
			case HtmlPackage.IMG__ALT:
				return alt != null;
			case HtmlPackage.IMG__ALIGN:
				return align != null;
			case HtmlPackage.IMG__VSPACE:
				return vspace != null;
			case HtmlPackage.IMG__HSPACE:
				return hspace != null;
			case HtmlPackage.IMG__ISMAP:
				return ismap != null;
			case HtmlPackage.IMG__USEMAP:
				return usemap != null;
			case HtmlPackage.IMG__BORDER:
				return border != null;
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
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", alt: ");
		result.append(alt);
		result.append(", align: ");
		result.append(align);
		result.append(", vspace: ");
		result.append(vspace);
		result.append(", hspace: ");
		result.append(hspace);
		result.append(", ismap: ");
		result.append(ismap);
		result.append(", usemap: ");
		result.append(usemap);
		result.append(", border: ");
		result.append(border);
		result.append(')');
		return result.toString();
	}

} //IMGImpl
