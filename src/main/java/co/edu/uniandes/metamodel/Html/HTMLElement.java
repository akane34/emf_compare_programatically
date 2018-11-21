/**
 */
package co.edu.uniandes.metamodel.Html;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.HTMLElement#getValue <em>Value</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.HTMLElement#getChildren <em>Children</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.HTMLElement#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getHTMLElement()
 * @model
 * @generated
 */
public interface HTMLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getHTMLElement_Value()
	 * @model unique="false" dataType="co.edu.uniandes.metamodel.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Html.HTMLElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.metamodel.Html.HTMLElement}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodel.Html.HTMLElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getHTMLElement_Children()
	 * @see co.edu.uniandes.metamodel.Html.HTMLElement#getParent
	 * @model opposite="parent" containment="true" ordered="false"
	 * @generated
	 */
	EList<HTMLElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodel.Html.HTMLElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(HTMLElement)
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getHTMLElement_Parent()
	 * @see co.edu.uniandes.metamodel.Html.HTMLElement#getChildren
	 * @model opposite="children" required="true" transient="false" ordered="false"
	 * @generated
	 */
	HTMLElement getParent();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Html.HTMLElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(HTMLElement value);

} // HTMLElement
