/**
 */
package co.edu.uniandes.metamodel.Html.impl;

import co.edu.uniandes.metamodel.Html.HtmlPackage;
import co.edu.uniandes.metamodel.Html.INPUT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INPUT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.INPUTImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.INPUTImpl#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.INPUTImpl#getSize <em>Size</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.INPUTImpl#getChecked <em>Checked</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.INPUTImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.INPUTImpl#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.INPUTImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.INPUTImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INPUTImpl extends MinimalEObjectImpl.Container implements INPUT {
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
	 * The cached value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxlength()
	 * @generated
	 * @ordered
	 */
	protected Object maxlength;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Object size;

	/**
	 * The cached value of the '{@link #getChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecked()
	 * @generated
	 * @ordered
	 */
	protected Object checked;

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
	 * The cached value of the '{@link #getInputValue() <em>Input Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue()
	 * @generated
	 * @ordered
	 */
	protected Object inputValue;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INPUTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxlength() {
		return maxlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxlength(Object newMaxlength) {
		Object oldMaxlength = maxlength;
		maxlength = newMaxlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__MAXLENGTH, oldMaxlength, maxlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Object newSize) {
		Object oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getChecked() {
		return checked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecked(Object newChecked) {
		Object oldChecked = checked;
		checked = newChecked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__CHECKED, oldChecked, checked));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInputValue() {
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputValue(Object newInputValue) {
		Object oldInputValue = inputValue;
		inputValue = newInputValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__INPUT_VALUE, oldInputValue, inputValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.INPUT__ALIGN:
				return getAlign();
			case HtmlPackage.INPUT__MAXLENGTH:
				return getMaxlength();
			case HtmlPackage.INPUT__SIZE:
				return getSize();
			case HtmlPackage.INPUT__CHECKED:
				return getChecked();
			case HtmlPackage.INPUT__SRC:
				return getSrc();
			case HtmlPackage.INPUT__INPUT_VALUE:
				return getInputValue();
			case HtmlPackage.INPUT__NAME:
				return getName();
			case HtmlPackage.INPUT__TYPE:
				return getType();
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
			case HtmlPackage.INPUT__ALIGN:
				setAlign(newValue);
				return;
			case HtmlPackage.INPUT__MAXLENGTH:
				setMaxlength(newValue);
				return;
			case HtmlPackage.INPUT__SIZE:
				setSize(newValue);
				return;
			case HtmlPackage.INPUT__CHECKED:
				setChecked(newValue);
				return;
			case HtmlPackage.INPUT__SRC:
				setSrc(newValue);
				return;
			case HtmlPackage.INPUT__INPUT_VALUE:
				setInputValue(newValue);
				return;
			case HtmlPackage.INPUT__NAME:
				setName(newValue);
				return;
			case HtmlPackage.INPUT__TYPE:
				setType(newValue);
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
			case HtmlPackage.INPUT__ALIGN:
				setAlign((Object)null);
				return;
			case HtmlPackage.INPUT__MAXLENGTH:
				setMaxlength((Object)null);
				return;
			case HtmlPackage.INPUT__SIZE:
				setSize((Object)null);
				return;
			case HtmlPackage.INPUT__CHECKED:
				setChecked((Object)null);
				return;
			case HtmlPackage.INPUT__SRC:
				setSrc((Object)null);
				return;
			case HtmlPackage.INPUT__INPUT_VALUE:
				setInputValue((Object)null);
				return;
			case HtmlPackage.INPUT__NAME:
				setName((Object)null);
				return;
			case HtmlPackage.INPUT__TYPE:
				setType((Object)null);
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
			case HtmlPackage.INPUT__ALIGN:
				return align != null;
			case HtmlPackage.INPUT__MAXLENGTH:
				return maxlength != null;
			case HtmlPackage.INPUT__SIZE:
				return size != null;
			case HtmlPackage.INPUT__CHECKED:
				return checked != null;
			case HtmlPackage.INPUT__SRC:
				return src != null;
			case HtmlPackage.INPUT__INPUT_VALUE:
				return inputValue != null;
			case HtmlPackage.INPUT__NAME:
				return name != null;
			case HtmlPackage.INPUT__TYPE:
				return type != null;
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
		result.append(" (align: ");
		result.append(align);
		result.append(", maxlength: ");
		result.append(maxlength);
		result.append(", size: ");
		result.append(size);
		result.append(", checked: ");
		result.append(checked);
		result.append(", src: ");
		result.append(src);
		result.append(", inputValue: ");
		result.append(inputValue);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //INPUTImpl
