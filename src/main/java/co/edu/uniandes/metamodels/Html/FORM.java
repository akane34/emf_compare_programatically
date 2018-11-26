/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FORM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.FORM#getAction <em>Action</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.FORM#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getFORM()
 * @model
 * @generated
 */
public interface FORM extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(Object)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getFORM_Action()
	 * @model unique="false" dataType="co.edu.uniandes.metamodels.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getAction();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.FORM#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Object value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(Object)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getFORM_Method()
	 * @model unique="false" dataType="co.edu.uniandes.metamodels.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getMethod();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.FORM#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Object value);

} // FORM
