/**
 */
package co.edu.uniandes.metamodel.Html;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PARAM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodel.Html.PARAM#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Html.PARAM#getParamValue <em>Param Value</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getPARAM()
 * @model
 * @generated
 */
public interface PARAM extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getPARAM_Name()
	 * @model unique="false" dataType="co.edu.uniandes.metamodel.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Html.PARAM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Param Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Value</em>' attribute.
	 * @see #setParamValue(Object)
	 * @see co.edu.uniandes.metamodel.Html.HtmlPackage#getPARAM_ParamValue()
	 * @model unique="false" dataType="co.edu.uniandes.metamodel.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getParamValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Html.PARAM#getParamValue <em>Param Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Value</em>' attribute.
	 * @see #getParamValue()
	 * @generated
	 */
	void setParamValue(Object value);

} // PARAM