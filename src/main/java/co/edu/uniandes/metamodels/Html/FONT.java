/**
 */
package co.edu.uniandes.metamodels.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FONT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.FONT#getColor <em>Color</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.FONT#getFace <em>Face</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.FONT#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getFONT()
 * @model
 * @generated
 */
public interface FONT extends BODYElement {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Object)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getFONT_Color()
	 * @model unique="false" dataType="co.edu.uniandes.metamodels.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getColor();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.FONT#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Object value);

	/**
	 * Returns the value of the '<em><b>Face</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face</em>' attribute.
	 * @see #setFace(Object)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getFONT_Face()
	 * @model unique="false" dataType="co.edu.uniandes.metamodels.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getFace();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.FONT#getFace <em>Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face</em>' attribute.
	 * @see #getFace()
	 * @generated
	 */
	void setFace(Object value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Object)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getFONT_Size()
	 * @model unique="false" dataType="co.edu.uniandes.metamodels.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getSize();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.FONT#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Object value);

} // FONT
