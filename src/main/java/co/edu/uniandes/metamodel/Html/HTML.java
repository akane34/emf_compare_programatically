/**
 */
package co.edu.uniandes.metamodel.Html;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.HTML#getHead <em>Head</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.HTML#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getHTML()
 * @model
 * @generated
 */
public interface HTML extends EObject {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodel.Html.HEAD#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' reference.
	 * @see #setHead(HEAD)
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getHTML_Head()
	 * @see co.edu.uniandes.metamodel.Html.HEAD#getHtml
	 * @model opposite="html" ordered="false"
	 * @generated
	 */
	HEAD getHead();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Html.HTML#getHead <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(HEAD value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodel.Html.BODY#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(BODY)
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getHTML_Body()
	 * @see co.edu.uniandes.metamodel.Html.BODY#getHtml
	 * @model opposite="html" ordered="false"
	 * @generated
	 */
	BODY getBody();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Html.HTML#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BODY value);

} // HTML