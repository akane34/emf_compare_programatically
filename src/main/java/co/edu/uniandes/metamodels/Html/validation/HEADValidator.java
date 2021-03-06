/**
 *
 * $Id$
 */
package co.edu.uniandes.metamodels.Html.validation;

import co.edu.uniandes.metamodels.Html.HEADElement;
import co.edu.uniandes.metamodels.Html.HTML;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link co.edu.uniandes.metamodels.Html.HEAD}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HEADValidator {
	boolean validate();

	boolean validateHeadElements(EList<HEADElement> value);
	boolean validateHtml(HTML value);
}
