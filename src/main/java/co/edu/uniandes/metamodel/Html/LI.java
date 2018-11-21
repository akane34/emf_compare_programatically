/**
 */
package co.edu.uniandes.metamodel.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.LI#getLiValue <em>Li Value</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getLI()
 * @model
 * @generated
 */
public interface LI extends ListElement {
	/**
	 * Returns the value of the '<em><b>Li Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Li Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Li Value</em>' attribute.
	 * @see #setLiValue(Object)
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getLI_LiValue()
	 * @model unique="false" dataType="co.edu.uniandes.metamodel.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getLiValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Html.LI#getLiValue <em>Li Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Li Value</em>' attribute.
	 * @see #getLiValue()
	 * @generated
	 */
	void setLiValue(Object value);

} // LI
