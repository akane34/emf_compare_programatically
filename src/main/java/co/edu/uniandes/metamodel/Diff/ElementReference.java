/**
 */
package co.edu.uniandes.metamodel.Diff;

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
 *   <li>{@link co.edu.uniandes.metamodel.Diff.ElementReference#getEObject <em>EObject</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Diff.ElementReference#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Diff.ElementReference#getValue <em>Value</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodel.Diff.ElementReference#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodel.Diff.DiffPackage#getElementReference()
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
	 * @see #setEObject(String)
	 * @see co.edu.uniandes.metamodel.Diff.DiffPackage#getElementReference_EObject()
	 * @model
	 * @generated
	 */
	String getEObject();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Diff.ElementReference#getEObject <em>EObject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' attribute.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(String value);

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
	 * @see co.edu.uniandes.metamodel.Diff.DiffPackage#getElementReference_LineNumber()
	 * @model
	 * @generated
	 */
	BigInteger getLineNumber();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Diff.ElementReference#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see co.edu.uniandes.metamodel.Diff.DiffPackage#getElementReference_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Diff.ElementReference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see co.edu.uniandes.metamodel.Diff.DiffPackage#getElementReference_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodel.Diff.ElementReference#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // ElementReference
