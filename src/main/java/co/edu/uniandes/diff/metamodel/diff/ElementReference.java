/**
 */
package co.edu.uniandes.diff.metamodel.diff;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getEObject <em>EObject</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getXpath <em>Xpath</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getElementReference()
 * @model
 * @generated
 */
public interface ElementReference extends EObject {
	/**
	 * Returns the value of the '<em><b>EObject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject</em>' attribute.
	 * @see #setEObject(Object)
	 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getElementReference_EObject()
	 * @model
	 * @generated
	 */
	Object getEObject();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getEObject <em>EObject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' attribute.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(Object value);

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(BigInteger)
	 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getElementReference_LineNumber()
	 * @model
	 * @generated
	 */
	BigInteger getLineNumber();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath</em>' attribute.
	 * @see #setXpath(String)
	 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getElementReference_Xpath()
	 * @model required="true"
	 * @generated
	 */
	String getXpath();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getXpath <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' attribute.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(String value);

} // ElementReference
