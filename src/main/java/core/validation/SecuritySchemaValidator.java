/**
 *
 * $Id$
 */
package core.validation;

import core.APIKeyLocation;
import core.OAuth2FlowType;
import core.SecuritySchemeType;
import core.SecurityScope;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link core.SecuritySchema}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SecuritySchemaValidator {
	boolean validate();

	boolean validateType(SecuritySchemeType value);
	boolean validateDescription(String value);
	boolean validateName(String value);
	boolean validateLocation(APIKeyLocation value);
	boolean validateFlow(OAuth2FlowType value);
	boolean validateAuthorizationUrl(String value);
	boolean validateTokenUrl(String value);
	boolean validateGlobalName(String value);
	boolean validateScopes(EList<SecurityScope> value);
}
