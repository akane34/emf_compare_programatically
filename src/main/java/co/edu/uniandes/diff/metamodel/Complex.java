/**
 */
package co.edu.uniandes.diff.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.Complex#getSimpleDiffs <em>Simple Diffs</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getComplex()
 * @model
 * @generated
 */
public interface Complex extends Change {
	/**
	 * Returns the value of the '<em><b>Simple Diffs</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.diff.metamodel.Simple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Diffs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Diffs</em>' reference list.
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getComplex_SimpleDiffs()
	 * @model lower="2"
	 * @generated
	 */
	EList<Simple> getSimpleDiffs();

} // Complex
