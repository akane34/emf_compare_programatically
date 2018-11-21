/**
 */
package co.edu.uniandes.metamodel.Html.impl;

import co.edu.uniandes.metamodel.Html.BODY;
import co.edu.uniandes.metamodel.Html.BODYElement;
import co.edu.uniandes.metamodel.Html.HTML;
import co.edu.uniandes.metamodel.Html.HtmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BODY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.BODYImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.BODYImpl#getBgcolor <em>Bgcolor</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.BODYImpl#getText <em>Text</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.BODYImpl#getLink <em>Link</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.BODYImpl#getAlink <em>Alink</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.BODYImpl#getVlink <em>Vlink</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.BODYImpl#getBodyElements <em>Body Elements</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.BODYImpl#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BODYImpl extends HTMLElementImpl implements BODY {
	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected Object background;

	/**
	 * The cached value of the '{@link #getBgcolor() <em>Bgcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgcolor()
	 * @generated
	 * @ordered
	 */
	protected Object bgcolor;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Object text;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Object link;

	/**
	 * The cached value of the '{@link #getAlink() <em>Alink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlink()
	 * @generated
	 * @ordered
	 */
	protected Object alink;

	/**
	 * The cached value of the '{@link #getVlink() <em>Vlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlink()
	 * @generated
	 * @ordered
	 */
	protected Object vlink;

	/**
	 * The cached value of the '{@link #getBodyElements() <em>Body Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BODYElement> bodyElements;

	/**
	 * The cached value of the '{@link #getHtml() <em>Html</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml()
	 * @generated
	 * @ordered
	 */
	protected HTML html;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BODYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(Object newBackground) {
		Object oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.BODY__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBgcolor() {
		return bgcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgcolor(Object newBgcolor) {
		Object oldBgcolor = bgcolor;
		bgcolor = newBgcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.BODY__BGCOLOR, oldBgcolor, bgcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Object newText) {
		Object oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.BODY__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Object newLink) {
		Object oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.BODY__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAlink() {
		return alink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlink(Object newAlink) {
		Object oldAlink = alink;
		alink = newAlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.BODY__ALINK, oldAlink, alink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVlink() {
		return vlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVlink(Object newVlink) {
		Object oldVlink = vlink;
		vlink = newVlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.BODY__VLINK, oldVlink, vlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BODYElement> getBodyElements() {
		if (bodyElements == null) {
			bodyElements = new EObjectWithInverseResolvingEList<BODYElement>(BODYElement.class, this, HtmlPackage.BODY__BODY_ELEMENTS, HtmlPackage.BODY_ELEMENT__BODY);
		}
		return bodyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML getHtml() {
		if (html != null && html.eIsProxy()) {
			InternalEObject oldHtml = (InternalEObject)html;
			html = (HTML)eResolveProxy(oldHtml);
			if (html != oldHtml) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HtmlPackage.BODY__HTML, oldHtml, html));
			}
		}
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML basicGetHtml() {
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtml(HTML newHtml, NotificationChain msgs) {
		HTML oldHtml = html;
		html = newHtml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HtmlPackage.BODY__HTML, oldHtml, newHtml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtml(HTML newHtml) {
		if (newHtml != html) {
			NotificationChain msgs = null;
			if (html != null)
				msgs = ((InternalEObject)html).eInverseRemove(this, HtmlPackage.HTML__BODY, HTML.class, msgs);
			if (newHtml != null)
				msgs = ((InternalEObject)newHtml).eInverseAdd(this, HtmlPackage.HTML__BODY, HTML.class, msgs);
			msgs = basicSetHtml(newHtml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.BODY__HTML, newHtml, newHtml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.BODY__BODY_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodyElements()).basicAdd(otherEnd, msgs);
			case HtmlPackage.BODY__HTML:
				if (html != null)
					msgs = ((InternalEObject)html).eInverseRemove(this, HtmlPackage.HTML__BODY, HTML.class, msgs);
				return basicSetHtml((HTML)otherEnd, msgs);
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
			case HtmlPackage.BODY__BODY_ELEMENTS:
				return ((InternalEList<?>)getBodyElements()).basicRemove(otherEnd, msgs);
			case HtmlPackage.BODY__HTML:
				return basicSetHtml(null, msgs);
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
			case HtmlPackage.BODY__BACKGROUND:
				return getBackground();
			case HtmlPackage.BODY__BGCOLOR:
				return getBgcolor();
			case HtmlPackage.BODY__TEXT:
				return getText();
			case HtmlPackage.BODY__LINK:
				return getLink();
			case HtmlPackage.BODY__ALINK:
				return getAlink();
			case HtmlPackage.BODY__VLINK:
				return getVlink();
			case HtmlPackage.BODY__BODY_ELEMENTS:
				return getBodyElements();
			case HtmlPackage.BODY__HTML:
				if (resolve) return getHtml();
				return basicGetHtml();
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
			case HtmlPackage.BODY__BACKGROUND:
				setBackground(newValue);
				return;
			case HtmlPackage.BODY__BGCOLOR:
				setBgcolor(newValue);
				return;
			case HtmlPackage.BODY__TEXT:
				setText(newValue);
				return;
			case HtmlPackage.BODY__LINK:
				setLink(newValue);
				return;
			case HtmlPackage.BODY__ALINK:
				setAlink(newValue);
				return;
			case HtmlPackage.BODY__VLINK:
				setVlink(newValue);
				return;
			case HtmlPackage.BODY__BODY_ELEMENTS:
				getBodyElements().clear();
				getBodyElements().addAll((Collection<? extends BODYElement>)newValue);
				return;
			case HtmlPackage.BODY__HTML:
				setHtml((HTML)newValue);
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
			case HtmlPackage.BODY__BACKGROUND:
				setBackground((Object)null);
				return;
			case HtmlPackage.BODY__BGCOLOR:
				setBgcolor((Object)null);
				return;
			case HtmlPackage.BODY__TEXT:
				setText((Object)null);
				return;
			case HtmlPackage.BODY__LINK:
				setLink((Object)null);
				return;
			case HtmlPackage.BODY__ALINK:
				setAlink((Object)null);
				return;
			case HtmlPackage.BODY__VLINK:
				setVlink((Object)null);
				return;
			case HtmlPackage.BODY__BODY_ELEMENTS:
				getBodyElements().clear();
				return;
			case HtmlPackage.BODY__HTML:
				setHtml((HTML)null);
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
			case HtmlPackage.BODY__BACKGROUND:
				return background != null;
			case HtmlPackage.BODY__BGCOLOR:
				return bgcolor != null;
			case HtmlPackage.BODY__TEXT:
				return text != null;
			case HtmlPackage.BODY__LINK:
				return link != null;
			case HtmlPackage.BODY__ALINK:
				return alink != null;
			case HtmlPackage.BODY__VLINK:
				return vlink != null;
			case HtmlPackage.BODY__BODY_ELEMENTS:
				return bodyElements != null && !bodyElements.isEmpty();
			case HtmlPackage.BODY__HTML:
				return html != null;
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
		result.append(" (background: ");
		result.append(background);
		result.append(", bgcolor: ");
		result.append(bgcolor);
		result.append(", text: ");
		result.append(text);
		result.append(", link: ");
		result.append(link);
		result.append(", alink: ");
		result.append(alink);
		result.append(", vlink: ");
		result.append(vlink);
		result.append(')');
		return result.toString();
	}

} //BODYImpl
