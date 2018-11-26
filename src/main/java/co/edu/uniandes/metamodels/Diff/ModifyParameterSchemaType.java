/**
 */
package co.edu.uniandes.metamodels.Diff;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Parameter Schema Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.ModifyParameterSchemaType#getSchemas <em>Schemas</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getModifyParameterSchemaType()
 * @model
 * @generated
 */
public interface ModifyParameterSchemaType extends Modify {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.metamodels.Diff.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' reference list.
	 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getModifyParameterSchemaType_Schemas()
	 * @model required="true"
	 * @generated
	 */
	EList<Schema> getSchemas();

} // ModifyParameterSchemaType
