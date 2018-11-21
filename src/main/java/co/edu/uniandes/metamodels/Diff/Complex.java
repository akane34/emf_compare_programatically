/**
 */
package co.edu.uniandes.metamodels.Diff;

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
 *   <li>{@link co.edu.uniandes.metamodels.Diff.Complex#getSimpleDiffs <em>Simple Diffs</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getComplex()
 * @model
 * @generated
 */
public interface Complex extends Change {
	/**
	 * Returns the value of the '<em><b>Simple Diffs</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.metamodels.Diff.Simple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Diffs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Diffs</em>' reference list.
	 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getComplex_SimpleDiffs()
	 * @model required="true"
	 * @generated
	 */
	EList<Simple> getSimpleDiffs();

} // Complex
