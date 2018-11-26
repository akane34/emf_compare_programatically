/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPTION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.OPTION#getSelected <em>Selected</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.OPTION#getOptionValue <em>Option Value</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getOPTION()
 * @model
 * @generated
 */
public interface OPTION extends EObject {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(Object)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getOPTION_Selected()
	 * @model unique="false" dataType="co.edu.uniandes.metamodels.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getSelected();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.OPTION#getSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(Object value);

	/**
	 * Returns the value of the '<em><b>Option Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Value</em>' attribute.
	 * @see #setOptionValue(Object)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getOPTION_OptionValue()
	 * @model unique="false" dataType="co.edu.uniandes.metamodels.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getOptionValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.OPTION#getOptionValue <em>Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Value</em>' attribute.
	 * @see #getOptionValue()
	 * @generated
	 */
	void setOptionValue(Object value);

} // OPTION
