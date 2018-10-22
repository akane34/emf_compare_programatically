/**
 */
package edu.uoc.som.openapi.impl;

import edu.uoc.som.openapi.APIKeyLocation;
import edu.uoc.som.openapi.OAuth2FlowType;
import edu.uoc.som.openapi.OpenAPIPackage;
import edu.uoc.som.openapi.SecuritySchema;
import edu.uoc.som.openapi.SecuritySchemeType;
import edu.uoc.som.openapi.SecurityScope;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.SecuritySchemaImpl#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuritySchemaImpl extends MinimalEObjectImpl.Container implements SecuritySchema {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SecuritySchemeType TYPE_EDEFAULT = SecuritySchemeType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SecuritySchemeType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final APIKeyLocation LOCATION_EDEFAULT = APIKeyLocation.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected APIKeyLocation location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected static final OAuth2FlowType FLOW_EDEFAULT = OAuth2FlowType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected OAuth2FlowType flow = FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected String authorizationUrl = AUTHORIZATION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected String tokenUrl = TOKEN_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = REFERENCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScope> scopes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIPackage.Literals.SECURITY_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchemeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SecuritySchemeType newType) {
		SecuritySchemeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_SCHEMA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_SCHEMA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIKeyLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(APIKeyLocation newLocation) {
		APIKeyLocation oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_SCHEMA__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2FlowType getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(OAuth2FlowType newFlow) {
		OAuth2FlowType oldFlow = flow;
		flow = newFlow == null ? FLOW_EDEFAULT : newFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_SCHEMA__FLOW, oldFlow, flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorizationUrl() {
		return authorizationUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizationUrl(String newAuthorizationUrl) {
		String oldAuthorizationUrl = authorizationUrl;
		authorizationUrl = newAuthorizationUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_SCHEMA__AUTHORIZATION_URL, oldAuthorizationUrl, authorizationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenUrl() {
		return tokenUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenUrl(String newTokenUrl) {
		String oldTokenUrl = tokenUrl;
		tokenUrl = newTokenUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_SCHEMA__TOKEN_URL, oldTokenUrl, tokenUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_SCHEMA__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityScope> getScopes() {
		if (scopes == null) {
			scopes = new EObjectContainmentEList<SecurityScope>(SecurityScope.class, this, OpenAPIPackage.SECURITY_SCHEMA__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityScope getSecurityScopeByName(final String name) {
		for(SecurityScope securityScope: getScopes())
			if(securityScope.getName().equals(name))
				return securityScope;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_SCHEMA__SCOPES:
				return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_SCHEMA__TYPE:
				return getType();
			case OpenAPIPackage.SECURITY_SCHEMA__DESCRIPTION:
				return getDescription();
			case OpenAPIPackage.SECURITY_SCHEMA__NAME:
				return getName();
			case OpenAPIPackage.SECURITY_SCHEMA__LOCATION:
				return getLocation();
			case OpenAPIPackage.SECURITY_SCHEMA__FLOW:
				return getFlow();
			case OpenAPIPackage.SECURITY_SCHEMA__AUTHORIZATION_URL:
				return getAuthorizationUrl();
			case OpenAPIPackage.SECURITY_SCHEMA__TOKEN_URL:
				return getTokenUrl();
			case OpenAPIPackage.SECURITY_SCHEMA__REFERENCE_NAME:
				return getReferenceName();
			case OpenAPIPackage.SECURITY_SCHEMA__SCOPES:
				return getScopes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_SCHEMA__TYPE:
				setType((SecuritySchemeType)newValue);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__NAME:
				setName((String)newValue);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__LOCATION:
				setLocation((APIKeyLocation)newValue);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__FLOW:
				setFlow((OAuth2FlowType)newValue);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__AUTHORIZATION_URL:
				setAuthorizationUrl((String)newValue);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__TOKEN_URL:
				setTokenUrl((String)newValue);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__REFERENCE_NAME:
				setReferenceName((String)newValue);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__SCOPES:
				getScopes().clear();
				getScopes().addAll((Collection<? extends SecurityScope>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__FLOW:
				setFlow(FLOW_EDEFAULT);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__AUTHORIZATION_URL:
				setAuthorizationUrl(AUTHORIZATION_URL_EDEFAULT);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__TOKEN_URL:
				setTokenUrl(TOKEN_URL_EDEFAULT);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
				return;
			case OpenAPIPackage.SECURITY_SCHEMA__SCOPES:
				getScopes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_SCHEMA__TYPE:
				return type != TYPE_EDEFAULT;
			case OpenAPIPackage.SECURITY_SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenAPIPackage.SECURITY_SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenAPIPackage.SECURITY_SCHEMA__LOCATION:
				return location != LOCATION_EDEFAULT;
			case OpenAPIPackage.SECURITY_SCHEMA__FLOW:
				return flow != FLOW_EDEFAULT;
			case OpenAPIPackage.SECURITY_SCHEMA__AUTHORIZATION_URL:
				return AUTHORIZATION_URL_EDEFAULT == null ? authorizationUrl != null : !AUTHORIZATION_URL_EDEFAULT.equals(authorizationUrl);
			case OpenAPIPackage.SECURITY_SCHEMA__TOKEN_URL:
				return TOKEN_URL_EDEFAULT == null ? tokenUrl != null : !TOKEN_URL_EDEFAULT.equals(tokenUrl);
			case OpenAPIPackage.SECURITY_SCHEMA__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
			case OpenAPIPackage.SECURITY_SCHEMA__SCOPES:
				return scopes != null && !scopes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OpenAPIPackage.SECURITY_SCHEMA___GET_SECURITY_SCOPE_BY_NAME__STRING:
				return getSecurityScopeByName((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(", flow: ");
		result.append(flow);
		result.append(", authorizationUrl: ");
		result.append(authorizationUrl);
		result.append(", tokenUrl: ");
		result.append(tokenUrl);
		result.append(", referenceName: ");
		result.append(referenceName);
		result.append(')');
		return result.toString();
	}

} //SecuritySchemaImpl
