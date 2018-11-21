/**
 */
package co.edu.uniandes.metamodel.Html.impl;

import co.edu.uniandes.metamodel.Html.AREA;
import co.edu.uniandes.metamodel.Html.HtmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AREA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.AREAImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.AREAImpl#getCoords <em>Coords</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.AREAImpl#getAhref <em>Ahref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AREAImpl extends BODYElementImpl implements AREA {
	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected Object shape;

	/**
	 * The cached value of the '{@link #getCoords() <em>Coords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoords()
	 * @generated
	 * @ordered
	 */
	protected Object coords;

	/**
	 * The cached value of the '{@link #getAhref() <em>Ahref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAhref()
	 * @generated
	 * @ordered
	 */
	protected Object ahref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AREAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(Object newShape) {
		Object oldShape = shape;
		shape = newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.AREA__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCoords() {
		return coords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoords(Object newCoords) {
		Object oldCoords = coords;
		coords = newCoords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.AREA__COORDS, oldCoords, coords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAhref() {
		return ahref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAhref(Object newAhref) {
		Object oldAhref = ahref;
		ahref = newAhref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.AREA__AHREF, oldAhref, ahref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.AREA__SHAPE:
				return getShape();
			case HtmlPackage.AREA__COORDS:
				return getCoords();
			case HtmlPackage.AREA__AHREF:
				return getAhref();
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
			case HtmlPackage.AREA__SHAPE:
				setShape(newValue);
				return;
			case HtmlPackage.AREA__COORDS:
				setCoords(newValue);
				return;
			case HtmlPackage.AREA__AHREF:
				setAhref(newValue);
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
			case HtmlPackage.AREA__SHAPE:
				setShape((Object)null);
				return;
			case HtmlPackage.AREA__COORDS:
				setCoords((Object)null);
				return;
			case HtmlPackage.AREA__AHREF:
				setAhref((Object)null);
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
			case HtmlPackage.AREA__SHAPE:
				return shape != null;
			case HtmlPackage.AREA__COORDS:
				return coords != null;
			case HtmlPackage.AREA__AHREF:
				return ahref != null;
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
		result.append(" (shape: ");
		result.append(shape);
		result.append(", coords: ");
		result.append(coords);
		result.append(", ahref: ");
		result.append(ahref);
		result.append(')');
		return result.toString();
	}

} //AREAImpl
