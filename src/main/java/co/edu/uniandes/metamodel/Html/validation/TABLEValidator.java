/**
 *
 * $Id$
 */
package co.edu.uniandes.metamodel.Html.validation;

import co.edu.uniandes.metamodel.Html.TR;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link co.edu.uniandes.metamodel.Html.TABLE}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TABLEValidator {
	boolean validate();

	boolean validateBorder(Object value);
	boolean validateWidth(Object value);
	boolean validateCellspacing(Object value);
	boolean validateCellpadding(Object value);
	boolean validateTrs(EList<TR> value);
}