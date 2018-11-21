/**
 */
package co.edu.uniandes.metamodel.Html;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.ListElement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getListElement()
 * @model abstract="true"
 * @generated
 */
public interface ListElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getListElement_Type()
	 * @model unique="false" dataType="co.edu.uniandes.metamodel.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Html.ListElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

} // ListElement
