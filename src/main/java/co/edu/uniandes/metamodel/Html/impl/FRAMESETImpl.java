/**
 */
package co.edu.uniandes.metamodel.Html.impl;

import co.edu.uniandes.metamodel.Html.FRAMESET;
import co.edu.uniandes.metamodel.Html.HtmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FRAMESET</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMESETImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMESETImpl#getCols <em>Cols</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMESETImpl#getFramespacing <em>Framespacing</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMESETImpl#getFrameborder <em>Frameborder</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.impl.FRAMESETImpl#getBorder <em>Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FRAMESETImpl extends MinimalEObjectImpl.Container implements FRAMESET {
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected Object rows;

	/**
	 * The cached value of the '{@link #getCols() <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected Object cols;

	/**
	 * The cached value of the '{@link #getFramespacing() <em>Framespacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramespacing()
	 * @generated
	 * @ordered
	 */
	protected Object framespacing;

	/**
	 * The cached value of the '{@link #getFrameborder() <em>Frameborder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameborder()
	 * @generated
	 * @ordered
	 */
	protected Object frameborder;

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
	protected FRAMESETImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.FRAMESET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(Object newRows) {
		Object oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCols() {
		return cols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCols(Object newCols) {
		Object oldCols = cols;
		cols = newCols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__COLS, oldCols, cols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFramespacing() {
		return framespacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFramespacing(Object newFramespacing) {
		Object oldFramespacing = framespacing;
		framespacing = newFramespacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__FRAMESPACING, oldFramespacing, framespacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFrameborder() {
		return frameborder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameborder(Object newFrameborder) {
		Object oldFrameborder = frameborder;
		frameborder = newFrameborder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__FRAMEBORDER, oldFrameborder, frameborder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.FRAMESET__ROWS:
				return getRows();
			case HtmlPackage.FRAMESET__COLS:
				return getCols();
			case HtmlPackage.FRAMESET__FRAMESPACING:
				return getFramespacing();
			case HtmlPackage.FRAMESET__FRAMEBORDER:
				return getFrameborder();
			case HtmlPackage.FRAMESET__BORDER:
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
			case HtmlPackage.FRAMESET__ROWS:
				setRows(newValue);
				return;
			case HtmlPackage.FRAMESET__COLS:
				setCols(newValue);
				return;
			case HtmlPackage.FRAMESET__FRAMESPACING:
				setFramespacing(newValue);
				return;
			case HtmlPackage.FRAMESET__FRAMEBORDER:
				setFrameborder(newValue);
				return;
			case HtmlPackage.FRAMESET__BORDER:
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
			case HtmlPackage.FRAMESET__ROWS:
				setRows((Object)null);
				return;
			case HtmlPackage.FRAMESET__COLS:
				setCols((Object)null);
				return;
			case HtmlPackage.FRAMESET__FRAMESPACING:
				setFramespacing((Object)null);
				return;
			case HtmlPackage.FRAMESET__FRAMEBORDER:
				setFrameborder((Object)null);
				return;
			case HtmlPackage.FRAMESET__BORDER:
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
			case HtmlPackage.FRAMESET__ROWS:
				return rows != null;
			case HtmlPackage.FRAMESET__COLS:
				return cols != null;
			case HtmlPackage.FRAMESET__FRAMESPACING:
				return framespacing != null;
			case HtmlPackage.FRAMESET__FRAMEBORDER:
				return frameborder != null;
			case HtmlPackage.FRAMESET__BORDER:
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
		result.append(" (rows: ");
		result.append(rows);
		result.append(", cols: ");
		result.append(cols);
		result.append(", framespacing: ");
		result.append(framespacing);
		result.append(", frameborder: ");
		result.append(frameborder);
		result.append(", border: ");
		result.append(border);
		result.append(')');
		return result.toString();
	}

} //FRAMESETImpl
