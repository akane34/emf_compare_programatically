/**
 *
 * $Id$
 */
package co.edu.uniandes.metamodel.Html.validation;

import co.edu.uniandes.metamodel.Html.HEAD;

/**
 * A sample validator interface for {@link co.edu.uniandes.metamodel.Html.HEADElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HEADElementValidator {
	boolean validate();

	boolean validateHead(HEAD value);
}
