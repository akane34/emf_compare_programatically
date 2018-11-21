/**
 *
 * $Id$
 */
package co.edu.uniandes.metamodel.Html.validation;


/**
 * A sample validator interface for {@link co.edu.uniandes.metamodel.Html.EMBED}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EMBEDValidator {
	boolean validate();

	boolean validateSrc(Object value);
	boolean validateWidth(Object value);
	boolean validateHeight(Object value);
	boolean validateAlign(Object value);
	boolean validateVspace(Object value);
	boolean validateHspace(Object value);
	boolean validateBorder(Object value);
}