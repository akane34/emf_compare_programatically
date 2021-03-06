package co.edu.uniandes.changesIdentifier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.transformations.m2m.DiffToModelTransformation;
import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.Path;
import edu.uoc.som.openapi.Response;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.impl.OperationImpl;
import edu.uoc.som.openapi.impl.ParameterImpl;
import edu.uoc.som.openapi.impl.PathImpl;
import edu.uoc.som.openapi.impl.ResponseImpl;
import edu.uoc.som.openapi.impl.SchemaImpl;

public class ChangesProcessor {

	/************************************ PROCESS METHODS ************************************************************/

	public static void processRelocateSameParameter(DiffToModelTransformation diffMetamodel, List<ChangeParameter> changeParameters, List<Change> changes) {
		System.out.println("-------------------- RelocateSameParameter");
		List<ChangeParameter> parameters = new ArrayList<>();
		for (ChangeParameter p : changeParameters){			
			if (p.getOldParameter() != null &&
				p.getNewParameter() != null &&
				!p.getNewParameter().getLocation().equals(p.getOldParameter().getLocation())){

				System.out.println(p.getPath() + ":" + p.getMethod() + "  p:" + p.getNewParameter().getName() + " 1:" + p.getNewParameter().getLocation() + " added");
				System.out.println(p.getPath() + ":" + p.getMethod() + "  p:" + p.getOldParameter().getName() + " 2:" + p.getOldParameter().getLocation());				
				System.out.println("\n ");
				
				if(!existInTempChangeParameterList(p,parameters))
					parameters.add(p);
			}
		}
		for (ChangeParameter p : parameters) {
			diffMetamodel.createRelocateSameParameterInstance(p, changes);
		}
	}
	
	public static void processRelocateMultipleParametersInOneParameter(DiffToModelTransformation diffMetamodel, List<ChangeParameter> changeParameters, Map<String, List<ChangeParameter>> operations, List<Change> changes) {
		System.out.println("-------------------- RelocateMultipleParametersInOneParameter");		
		for (Map.Entry<String, List<ChangeParameter>> entry : operations.entrySet())
		{			
			int countAdded = 0;
			ChangeParameter newParameter = null;
			List<ChangeParameter> deletedParameters = new ArrayList<ChangeParameter>();
			String locationAdd = "";
			String locationDelete = "";
		    for (ChangeParameter p : entry.getValue()){
		    	if (p.getDifferenceKind() == DifferenceKind.DELETE){		    		
		    		if (locationAdd.equals(""))
		    			locationAdd = p.getNewParameter().getLocation().getName();
		    		else if (!locationAdd.equals(p.getNewParameter().getLocation().getName())){		    			
		    			deletedParameters = new ArrayList<ChangeParameter>();
		    			break;
		    		}
		    		
		    		deletedParameters.add(p);
		    	}		    	
		    	else if (p.getDifferenceKind() == DifferenceKind.ADD){
		    		countAdded++;
		    		newParameter = p;
		    		locationDelete = p.getNewParameter().getLocation().getName();
		    	}		    	
		    }
		    
		    if (deletedParameters.size() >= 2 && countAdded == 1 && !locationAdd.equals(locationDelete)){
		    	System.out.println(entry.getKey() + "  p:" + newParameter.getNewParameter().getName() + " 2:" + newParameter.getNewParameter().getLocation() + " added");
		    	for (ChangeParameter p : deletedParameters){
		    		System.out.println(entry.getKey() + "  p:" + p.getNewParameter().getName() + " 1:" + p.getNewParameter().getLocation() + " deleted");
		    	}
				System.out.println("\n ");
				
    			diffMetamodel.createRelocateMultipleParametersInOneParameterInstance(newParameter, deletedParameters, changes);
    		}
		}	
	}
	
	public static void processChangeTypeParameter(DiffToModelTransformation diffMetamodel, List<ChangeParameter> deleteParameters,
			List<ChangeParameter> addParameters, List<ChangeParameter> changeParameters, List<Change> changes) {
		System.out.println("-------------------- ChangeTypeParameter");
		for (ChangeParameter dp : deleteParameters){
			for (ChangeParameter ap : addParameters){
				if (dp.getPath().equals(ap.getPath()) && dp.getNewParameter().getName().equals(ap.getNewParameter().getName())){
					if (!dp.getNewParameter().getType().getName().equals(ap.getNewParameter().getType().getName())){
						System.out.println(dp.getPath() + ":" + dp.getMethod() + "  p:" + dp.getNewParameter().getName() + " 1:" + dp.getNewParameter().getType());
						System.out.println(ap.getPath() + ":" + ap.getMethod() + "  p:" + ap.getNewParameter().getName() + " 2:" + ap.getNewParameter().getType());
						System.out.println("\n ");
						
						diffMetamodel.createChangeTypeOfParameterInstance(dp, ap, changes);
					}
				}
			}
		}
		
		for (ChangeParameter p : changeParameters){
			if (p.getOldParameter() != null &&	p.getNewParameter() != null){
				String oldSchema = p.getOldParameter().getSchema() != null ? p.getOldParameter().getSchema().getName() : null;
				String newSchema = p.getNewParameter().getSchema() != null ? p.getNewParameter().getSchema().getName() : null;				
				
				if (newSchema == null && oldSchema == null)
					continue;
				
				if ((isNullOrEmpty(newSchema) && !isNullOrEmpty(oldSchema)) ||
					(!isNullOrEmpty(newSchema) && isNullOrEmpty(oldSchema)) ||
					(!newSchema.equals(oldSchema))){
				
					ChangeParameter oldParameter = new ChangeParameter();
					oldParameter.clone(p);
					oldParameter.setNewParameter(p.getOldParameter());
					
					ChangeParameter newParameter = new ChangeParameter();
					newParameter.clone(p);
					newParameter.setNewParameter(p.getNewParameter());
					
					System.out.println(oldParameter.getPath() + ":" + oldParameter.getMethod() + "  p:" + oldParameter.getNewParameter().getName() + " 1:" + oldSchema);
					System.out.println(newParameter.getPath() + ":" + newParameter.getMethod() + "  p:" + newParameter.getNewParameter().getName() + " 2:" + newSchema);
					System.out.println("\n ");
					
					diffMetamodel.createChangeTypeOfParameterInstance(oldParameter, newParameter, changes);
				}
			}
		}
	}
	
	public static void processIncreaseNumberOfParameters(DiffToModelTransformation diffMetamodel, Map<String, List<ChangeParameter>> operations, List<ChangeParameter> deleteParameters, String oldVersion, List<Change> changes) {
		System.out.println("-------------------- IncreaseNumberOfParameters");
		int countAdded = 0;
		for (Map.Entry<String, List<ChangeParameter>> entry : operations.entrySet())
		{		    		    		    
		    for (ChangeParameter p : entry.getValue()){
		    	if (p.getDifferenceKind() == DifferenceKind.ADD){
		    		countAdded = 0;
		    		for (ChangeParameter p2 : entry.getValue()){
		    			if (p.getNewParameter().getName().equals(p2.getNewParameter().getName()) &&
		    				p.getNewParameter().getLocation() == p2.getNewParameter().getLocation() &&
		    				p2.getDifferenceKind() == DifferenceKind.ADD)
		    				countAdded++;
		    		}
		    		
		    		if (countAdded == 1 && !existInChangeParameterList(p,entry.getKey() ,deleteParameters)){
		    			diffMetamodel.createIncreaseNumberOfParametersInstance(oldVersion, p, changes);
		    			System.out.println(entry.getKey() + " " + p.getNewParameter().getName() + " Added");
		    		}
		    	}
		    }
		}				
	}

	private static boolean existInChangeParameterList(ChangeParameter p, String keyMap ,List<ChangeParameter> changeParameters) {
		boolean exist = false;
		for(ChangeParameter changeParameter:changeParameters) {
			//the same path and parameter name
			if(p.getPath().equals(changeParameter.getPath()) && p.getNewParameter().getName().equals(changeParameter.getNewParameter().getName())){
				for(OperationWrapper operation : changeParameter.getOperations()) {
					//belongs the same method
					if(p.getMethod().equals(operation.getMethod())) {
						exist = true;
						break;
					}
				}
				if(exist) break;
			}
		}
		return exist;
	}

	public static void processDecreaseNumberOfParameters(DiffToModelTransformation diffMetamodel, Map<String, List<ChangeParameter>> operations,List<ChangeParameter> addParameters, String oldVersion, List<Change> changes) {
		System.out.println("-------------------- DecreaseNumberOfParameters");
		int countDeleted = 0;
		for (Map.Entry<String, List<ChangeParameter>> entry : operations.entrySet())
		{		    		    		    
		    for (ChangeParameter p : entry.getValue()){
		    	if (p.getDifferenceKind() == DifferenceKind.DELETE){
		    		countDeleted = 0;
		    		for (ChangeParameter p2 : entry.getValue()){
		    			if (p.getNewParameter().getName().equals(p2.getNewParameter().getName()) &&
		    				p.getNewParameter().getLocation() == p2.getNewParameter().getLocation()&&
		    				p2.getDifferenceKind() == DifferenceKind.DELETE)
		    				countDeleted++;
		    		}
		    		
		    		if (countDeleted == 1 && !existInChangeParameterList(p,entry.getKey() ,addParameters)){
		    			diffMetamodel.createDecreaseNumberOfParametersInstance(oldVersion, p, changes);
		    			System.out.println(entry.getKey() + " " + p.getNewParameter().getName() + " Deleted");
		    		}
		    	}
		    }
		}				
	}
	
	public static void processRenameParameter(DiffToModelTransformation diffMetamodel, List<ChangeParameter> changeParameters, List<Change> changes) {
		System.out.println("-------------------- RenameParameter");		
		for (ChangeParameter p : changeParameters){
			if (p.getOldParameter() != null &&
				p.getNewParameter() != null &&
				!p.getNewParameter().getName().equals(p.getOldParameter().getName())){
				
				System.out.println(p.getPath() + ":" + p.getMethod() + "  p:" + p.getOldParameter().getName() + " 1:" + p.getOldParameter().getLocation());
				System.out.println(p.getPath() + ":" + p.getMethod() + "  p:" + p.getNewParameter().getName() + " 2:" + p.getNewParameter().getLocation());
				System.out.println("\n ");
				
				diffMetamodel.createRenameParameterInstance(p, changes);
			}
		}			
	}
	
	public static void processChangeTypeOfReturnValue(DiffToModelTransformation diffMetamodel, List<ChangeResponse> deleteResponse,
			List<ChangeResponse> addResponse, List<Change> changes) {
		System.out.println("-------------------- ChangeTypeOfReturnValue");
		for (ChangeResponse dr : deleteResponse){
			for (ChangeResponse ar : addResponse){
				if (dr.getPath().equals(ar.getPath()) && dr.getResponse().getCode().equals(ar.getResponse().getCode())){
					Schema drschema = dr.getResponse().getSchema();
					Schema arschema = ar.getResponse().getSchema();
					if (drschema != null && arschema != null){
						String drschemaName = drschema.getName();
						String arschemaName = arschema.getName();
						
						if ((drschemaName != null && arschemaName == null) ||
							(arschemaName != null && drschemaName == null) ||
							(drschemaName != null && arschemaName != null && !drschemaName.equals(arschemaName)) ||
							(drschema != null && arschema != null && !drschema.getType().toString().equals(arschema.getType().toString())) ){
							
							System.out.println(dr.getPath() + "  r:" + dr.getResponse().getSchema().getName());
							System.out.println(ar.getPath() + "  r:" + ar.getResponse().getSchema().getName());
							System.out.println("\n ");
							
							diffMetamodel.createChangeTypeOfReturnValueInstance(dr, ar, changes);
						}						
					}
				}
			}
		}
	}
	
	public static co.edu.uniandes.metamodels.Diff.Diff processVersion(DiffToModelTransformation diffMetamodel, String newVersion, String oldVersion) {
		return diffMetamodel.createDiffModel(oldVersion, newVersion);
	}
	
	public static void processDeletedResponses(DiffToModelTransformation diffMetamodel, List<ChangeResponse> deleteResponse, List<ChangeResponse> addResponse, List<Change> changes) {
		for(ChangeResponse delRes: deleteResponse) {
			if(!existInList(delRes, addResponse))
				diffMetamodel.createDeleteStatusCode(delRes, changes);
		}
	}
	
	public static void processAddedResponses(DiffToModelTransformation diffMetamodel, List<ChangeResponse> addResponse, List<ChangeResponse> deletedResponse, List<Change> changes) {
		for(ChangeResponse addRes: addResponse) {
			if(!existInList(addRes, deletedResponse))
				diffMetamodel.createAddedStatusCode(addRes, changes);
		}
	}
	
	private static boolean existInList(ChangeResponse responseToValidate, List<ChangeResponse> responses) {
		boolean exist=false;
		for(ChangeResponse response: responses) {
			if(responseToValidate.getPath().equals(response.getPath()) && responseToValidate.getResponse().getCode().equals(response.getResponse().getCode())) {
				exist=true;
				break;
			}
		}
		return exist;
	}

	private static void processBoundariesParamsUpdated(DiffToModelTransformation diffMetamodel, List<ChangeBoundaryParameter> changesBoundaryParameters, List<Change> changes) {
		for(ChangeBoundaryParameter boundaryUpdated: changesBoundaryParameters) {
			switch (boundaryUpdated.getBoundary()) {
			case LOWER:
				diffMetamodel.createLowerBoundary(boundaryUpdated, changes);
				break;
				
			case UPPER:
				diffMetamodel.createUpperBoundary(boundaryUpdated, changes);
				break;
			}
			
		}
	}
	
	public static void processSchemasUpdated(DiffToModelTransformation diffMetamodel, List<ChangeSchema> schemasUpdated, List<Change> changes) {
		for(ChangeSchema schemaUpdated : schemasUpdated) {
			switch (schemaUpdated.getDifferenceKind()) {
			case ADD:
				diffMetamodel.createAddedSchemaProperty(schemaUpdated,changes);
				break;

			case DELETE:
				diffMetamodel.createDeletedSchemaProperty(schemaUpdated, changes);
				break;
			default:
				break;
			}
		}
	}
	
	public static void processContentTypesUpdates(DiffToModelTransformation diffMetamodel, List<ChangeContentType> contentTypesUpdated, EList<Change> changes) {
		for(ChangeContentType contentTypeUpdated : contentTypesUpdated) {
			if (contentTypeUpdated.getAttr().getName().equals("produces") &&
				!contentTypeUpdated.getOldValueProduces().equals(contentTypeUpdated.getNewValueProduces()) &&
				contentTypeUpdated.getKind() == DifferenceKind.ADD) {
				diffMetamodel.createProduceUpdate(contentTypeUpdated, changes);
			}else if (contentTypeUpdated.getAttr().getName().equals("consumes") &&
					!contentTypeUpdated.getOldValueConsumes().equals(contentTypeUpdated.getNewValueConsumes()) &&
					contentTypeUpdated.getKind() == DifferenceKind.ADD) {
				diffMetamodel.createConsumeTypeUpdate(contentTypeUpdated, changes);
			}
		}		
	}
	
	public static void processUnsupportRequestMethods(DiffToModelTransformation diffMetamodel, List<ChangeOperation> deleteOperations, List<Change> changes) {
		System.out.println("-------------------- UnsupportRequestMethods");
		for (ChangeOperation co : deleteOperations){						
			System.out.println(co.getPath() + "  v2:" + co.getMethod() + " unsupported");			
			System.out.println("\n ");
						
			diffMetamodel.createUnsupportRequestMethodInstance(co, changes);			
		}
	}
	
	public static void processChangeDefaultValueOfParameter(DiffToModelTransformation diffMetamodel, List<ChangeParameter> changeParameters, List<Change> changes) {
		System.out.println("-------------------- ChangeDefaultValueOfParameter");	
		List<ChangeParameter> parametersChangeDefault = new ArrayList<>();
		for (ChangeParameter p : changeParameters){
			if (p.getOldParameter() != null &&	p.getNewParameter() != null){				
				String newDefault = p.getNewParameter().getDefault();
				String oldDefault = p.getOldParameter().getDefault();
				
				if (newDefault == null && oldDefault == null)
					continue;
				
				if ((isNullOrEmpty(newDefault) && !isNullOrEmpty(oldDefault)) ||
					(!isNullOrEmpty(newDefault) && isNullOrEmpty(oldDefault)) ||
					(!newDefault.equals(oldDefault))){
				
					System.out.println(p.getPath() + ":" + p.getMethod() + "  p:" + p.getOldParameter().getDefault() + " 1:" + p.getOldParameter().getLocation());
					System.out.println(p.getPath() + ":" + p.getMethod() + "  p:" + p.getNewParameter().getDefault() + " 2:" + p.getNewParameter().getLocation());
					System.out.println("\n ");
					
					if(!existInTempChangeParameterList(p,parametersChangeDefault))
						parametersChangeDefault.add(p);
				}
			}
		}
		
		for(ChangeParameter p: parametersChangeDefault) {
			diffMetamodel.createChangeDefaultValueOfParameterInstance(p, changes);
		}
	}	
	
	private static boolean existInTempChangeParameterList(ChangeParameter parameter,List<ChangeParameter> parameters) {
		boolean exist = false;
		for(ChangeParameter defaultParamter: parameters) {
			if(defaultParamter.getPath().equals(parameter.getPath()) && defaultParamter.getNewParameter().getName().equals(parameter.getNewParameter().getName())) {
				for(OperationWrapper operation : defaultParamter.getOperations()) {
					//belongs the same method
					if(defaultParamter.getMethod().equals(operation.getMethod())) {
						exist = true;
						break;
					}
				}
				if(exist) break;
			}
		}
		return exist;
	}
	
	public static void processChangeBoundariesOfParameter(DiffToModelTransformation diffMetamodel, List<ChangeParameter> changeParameters, List<Change> changes) {
		System.out.println("-------------------- ChangeDefaultValueOfParameter");	
		List<ChangeBoundaryParameter> parameters = new ArrayList<ChangeBoundaryParameter>();
		for (ChangeParameter p : changeParameters){
			if (p.getOldParameter() != null &&	p.getNewParameter() != null){				
				processChangeMaxValueParam(diffMetamodel,changes,p,parameters);
				processChangeMinValueParam(diffMetamodel,changes,p,parameters);
			}
		}
		
		processBoundariesParamsUpdated(diffMetamodel, parameters, changes);
	}	

	private static void processChangeMaxValueParam(DiffToModelTransformation diffMetamodel, List<Change> changes, ChangeParameter parameter,List<ChangeBoundaryParameter> parameters) {
	
		Double oldMax = parameter.getOldParameter().getMaximum();
		Double newMax = parameter.getNewParameter().getMaximum();
		
		if(oldMax==newMax)
			return; 
		
		ChangeBoundaryParameter changeBoundaryParam = new ChangeBoundaryParameter();
		changeBoundaryParam.setOldParam(parameter.getOldParameter());
		changeBoundaryParam.setOldUri(EcoreUtil.getURI(parameter.getOldParameter()).toString());
		changeBoundaryParam.setPath(parameter.getPath());
		
		changeBoundaryParam.setNewParam(parameter.getNewParameter());
		changeBoundaryParam.setNewUri(EcoreUtil.getURI(parameter.getNewParameter()).toString());
		changeBoundaryParam.setBoundary(Boundary.UPPER);				
		if(!existChangeBoundaryParameter(parameter, parameters, Boundary.UPPER)) {
			parameters.add(changeBoundaryParam);
		}
	}

	private static void processChangeMinValueParam(DiffToModelTransformation diffMetamodel, List<Change> changes, ChangeParameter parameter,List<ChangeBoundaryParameter> parameters) {
		
		Double oldMin = parameter.getOldParameter().getMinimum();
		Double newMin = parameter.getNewParameter().getMinimum();
		
		if(oldMin==newMin)
			return; 
		
		ChangeBoundaryParameter changeBoundaryParam = new ChangeBoundaryParameter();
		changeBoundaryParam.setOldParam(parameter.getOldParameter());
		changeBoundaryParam.setOldUri(EcoreUtil.getURI(parameter.getOldParameter()).toString());
		changeBoundaryParam.setPath(parameter.getPath());
		
		changeBoundaryParam.setNewParam(parameter.getNewParameter());
		changeBoundaryParam.setNewUri(EcoreUtil.getURI(parameter.getNewParameter()).toString());
		changeBoundaryParam.setBoundary(Boundary.LOWER);				
		if(!existChangeBoundaryParameter(parameter, parameters, Boundary.LOWER)) {
			parameters.add(changeBoundaryParam);
		}
	}
	
	private static boolean existChangeBoundaryParameter(ChangeParameter parameter,List<ChangeBoundaryParameter> parameters, Boundary boundary) {
		boolean exist = false;
		for(ChangeBoundaryParameter boundaryParamter: parameters) {
			if(boundaryParamter.getPath().equals(parameter.getPath()) && boundaryParamter.getNewParam().getName().equals(parameter.getNewParameter().getName()) && boundary.equals(boundaryParamter.getBoundary())) {
				exist=true;
				break;
			}
		}
		return exist;
	}
	
	public static void processDeletePaths(DiffToModelTransformation diffMetamodel, List<ChangePath> deletePaths, List<Change> changes) {
		System.out.println("-------------------- DeletePaths");
		
		for (ChangePath path : deletePaths){
			System.out.println(path.getPath() + "  deleted");			
			System.out.println("\n ");
			
			diffMetamodel.createDeletedPathInstance(path, changes);			
		}
	}
	
	public static void processModifyReturnSchemaType(DiffToModelTransformation diffMetamodel, List<ChangeSchema> addAndDeletedSchemas, List<ChangeSchema> changedSchemas, List<ChangePath> deletePaths, EList<Change> changes, ResourceSet minorVersionModel, ResourceSet mayorVersionModel) {
		System.out.println("-------------------- ModifyReturnSchemaType");
		Map<String, List<ModifyReturnSchema>> modifyResponses = new HashMap<String, List<ModifyReturnSchema>>();
		boolean schemaFound=false;
		
		for (ChangeSchema addAndDeletedSchema : addAndDeletedSchemas){			
			SchemaImpl schema = (SchemaImpl)minorVersionModel.getEObject(addAndDeletedSchema.getUri(), true);
		    Collection<Setting> schemasUsages = getUsages(schema);
		    Collection<String> schemaIds = new ArrayList<String>();
		    Collection<String> responsesId = new ArrayList<String>();
		    
		    Collection<ResponseImpl> responses = getResponsesRecursively(schemasUsages, schemaIds, responsesId);	
		    if(responses.isEmpty())
		    	continue;
		    
		    for (ResponseImpl response : responses)
		    {	
		    	schemaFound=false;
		    	for (ChangeSchema changeSchema : changedSchemas){			    		
		    		String uriResponseSchema = EcoreUtil.getURI(response.getSchema()).toString();
		    		String uriChangeSchema = EcoreUtil.getURI(changeSchema.getSchema()).toString();
		    		
		    		if (uriResponseSchema.equals(uriChangeSchema)){
		    			schemaFound= true;
		    			Collection<OperationImpl> operations = new ArrayList<OperationImpl>();	
		    			
		    			for(Setting setting : getUsages(response)){
		    				EObject object = setting.getEObject();
		    		    	if (object instanceof OperationImpl && !operations.contains((OperationImpl)object)){
		    		    		operations.add((OperationImpl)object);
		    		    		
		    		    		if(!pathWasDeleted(deletePaths, object)) {
		    		    			Path path = (PathImpl)((OperationImpl)object).eContainer();
			    		    		String relativePath = path.getRelativePath();
			    		    		addToModifiedResponses(modifyResponses, addAndDeletedSchema, response, object, path, relativePath);
		    		    		}
		    		    	}
		    			}			    			
		    		}
		    	}
		    	//kind ADD means, the schema was removed from the old version	
		    	if(!schemaFound && addAndDeletedSchema.getDifferenceKind().equals(DifferenceKind.ADD)) {
	    			Collection<OperationImpl> operations = new ArrayList<OperationImpl>();
		    		for(Setting setting : getUsages(response)){
	    				EObject object = setting.getEObject();
	    		    	if (object instanceof OperationImpl && !operations.contains((OperationImpl)object)){
	    		    		operations.add((OperationImpl)object);
	    		    		
	    		    		if(!pathWasDeleted(deletePaths, object)) {
	    		    			Path path = (PathImpl)((OperationImpl)object).eContainer();
		    		    		String relativePath = path.getRelativePath();
	    		    			addToModifiedResponses(modifyResponses, addAndDeletedSchema, response, object, path, relativePath);
	    		    		}
	    		    	}
	    			}		
		    	}
		    }
		    
		}
		
		for (Map.Entry<String, List<ModifyReturnSchema>> entry : modifyResponses.entrySet())
		{		    		    	
			Response response = null;
			String path = entry.getKey();
			System.out.println("\n Path: " + path);
		    for (ModifyReturnSchema p : entry.getValue()){
		    	response = p.getResponse();		    	
		    	System.out.println("\t Response: " + p.getResponse().getCode() + " schema:" + p.getSchema().getName() + " uri: " + EcoreUtil.getURI(p.getSchema()).toString());		    	
		    }
    	    
		    if(response.getSchema() != null)
		    	diffMetamodel.createModifyReturnSchemaTypeInstance(path, response, changes);
		}
		
	}

	public static void processModifyParameterSchemaType(DiffToModelTransformation diffMetamodel, List<ChangeSchema> addAndDeletedSchemas, List<ChangeSchema> changedSchemas, List<ChangePath> deletePaths, List<Change> changes, ResourceSet minorVersionModel, ResourceSet mayorVersionModel) {
		System.out.println("-------------------- ModifyParameterSchemaType");
		Map<String, List<ModifyParameterSchema>> modifyParameters = new HashMap<String, List<ModifyParameterSchema>>();
		boolean schemaFound=false;
		
		for (ChangeSchema addAndDeletedSchema : addAndDeletedSchemas){			
			SchemaImpl schema = (SchemaImpl)mayorVersionModel.getEObject(addAndDeletedSchema.getUri(), true);
		    Collection<Setting> schemasUsages = getUsages(schema);
		    Collection<String> schemaIds = new ArrayList<String>();
		    Collection<String> parameterIds = new ArrayList<String>();
		    
		    Collection<ParameterImpl> parameters = getParametersRecursively(schemasUsages, schemaIds, parameterIds);	
		    if(parameters.isEmpty())
		    	continue;
		    
		    for (ParameterImpl parameter : parameters)
		    {	
		    	schemaFound=false;
		    	for (ChangeSchema changeSchema : changedSchemas){			    		
		    		String uriParamSchema = EcoreUtil.getURI(parameter.getSchema()).toString();
		    		String uriChangeSchema = EcoreUtil.getURI(changeSchema.getSchema()).toString();
		    		
		    		if (uriParamSchema.equals(uriChangeSchema)){
		    			schemaFound= true;
		    			Collection<OperationImpl> operations = new ArrayList<OperationImpl>();
		    			
		    			for(Setting setting : getUsages(parameter)){
		    				EObject object = setting.getEObject();
		    		    	if (object instanceof OperationImpl && !operations.contains((OperationImpl)object)){
		    		    		operations.add((OperationImpl)object);
		    		    		
		    		    		if(!pathWasDeleted(deletePaths, object)) {
		    		    			Path path = (PathImpl)((OperationImpl)object).eContainer();
			    		    		String relativePath = path.getRelativePath();
		    		    			addToModifiedParams(modifyParameters, addAndDeletedSchema, parameter, object, path, relativePath);
		    		    		}
		    		    	}
		    			}			    			
		    		}
		    	}
		    	//kind ADD means, the schema was removed from the old version	
		    	if(!schemaFound && addAndDeletedSchema.getDifferenceKind().equals(DifferenceKind.ADD)) {
	    			Collection<OperationImpl> operations = new ArrayList<OperationImpl>();
		    		for(Setting setting : getUsages(parameter)){
	    				EObject object = setting.getEObject();
	    		    	if (object instanceof OperationImpl && !operations.contains((OperationImpl)object)){
	    		    		operations.add((OperationImpl)object);
	    		    		
	    		    		if(!pathWasDeleted(deletePaths, object)) {
	    		    			Path path = (PathImpl)((OperationImpl)object).eContainer();
		    		    		String relativePath = path.getRelativePath();
	    		    			addToModifiedParams(modifyParameters, addAndDeletedSchema, parameter, object, path, relativePath);
	    		    		}
	    		    	}
	    			}		
		    	}
		    }
		    
		}
		
		for (Map.Entry<String, List<ModifyParameterSchema>> entry : modifyParameters.entrySet())
		{		    		    	
			Parameter parameter = null;
			String path = entry.getKey();
			System.out.println("\n Path: " + path);
		    for (ModifyParameterSchema p : entry.getValue()){
		    	parameter = p.getParameter();		    	
		    	System.out.println("\t Parameter: " + p.getParameter().getName() + " schema:" + p.getSchema().getName() + " uri: " + EcoreUtil.getURI(p.getSchema()).toString());		    	
		    }
    	    
		    diffMetamodel.createModifyParameterSchemaTypeInstance(path, parameter, entry.getValue(), changes);
		}	
	}

	private static boolean pathWasDeleted(List<ChangePath> deletePaths,EObject object) {
		
		Path path = (PathImpl)((OperationImpl)object).eContainer();
		String relativePath = path.getRelativePath();
		
		boolean isDeleted = false;
		for (ChangePath oper : deletePaths){			    		    			
			if (relativePath.equals(oper.getPath())){
				isDeleted = true;
				break;
			}
		}

		return isDeleted;
	}
	private static void addToModifiedParams(Map<String, List<ModifyParameterSchema>> modifyParameters,
			ChangeSchema addAndDeletedSchema, ParameterImpl parameter, EObject object, Path path, String relativePath) {
		ModifyParameterSchema m = new ModifyParameterSchema();
		m.setParameter(parameter);
		m.setPath(path);
		m.setSchema(addAndDeletedSchema.getSchema());
		m.setOperation((OperationImpl)object);
		
		if (modifyParameters.get(relativePath) == null){
			List<ModifyParameterSchema> list = new ArrayList<ModifyParameterSchema>();			    		    			
			list.add(m);			    		    			
			
			modifyParameters.put(relativePath, list);
		}
		else{
			if(!modifyParameters.get(relativePath).contains(m))
				modifyParameters.get(relativePath).add(m);
		}
	}		
	
	private static void addToModifiedResponses(Map<String, List<ModifyReturnSchema>> modifyResponses, ChangeSchema addAndDeletedSchema, ResponseImpl response, EObject object, Path path, String relativePath) {
		ModifyReturnSchema m = new ModifyReturnSchema();
		m.setResponse(response);
		m.setPath(path);
		m.setSchema(addAndDeletedSchema.getSchema());
		m.setOperation((OperationImpl)object);
			
		if (modifyResponses.get(relativePath) == null){
			List<ModifyReturnSchema> list = new ArrayList<ModifyReturnSchema>();			    		    			
			list.add(m);			    		    			
			
			modifyResponses.put(relativePath, list);
		}
		else{
			if(!modifyResponses.get(relativePath).contains(m))
				modifyResponses.get(relativePath).add(m);
		}
	}
	
	public static void processExposeData(DiffToModelTransformation diffMetamodel, List<ChangeContentType> contentTypesUpdated, List<Change> changes) {
		System.out.println("-------------------- ExposeData");	
		
		Map<String, List<ChangeContentType>> operations = new HashMap<String, List<ChangeContentType>>();
		for (ChangeContentType content : contentTypesUpdated){
			if ("produces".equals(content.getAttr().getName())){
				List<ChangeContentType> contentType = operations.get(content.getPath());
				if (contentType == null)
					contentType = new ArrayList<ChangeContentType>();										
				
				contentType.add(content);
				operations.put(content.getPath(), contentType);	
			}
		}		
		
		if (operations.size() > 0){
			List<ChangeContentType> deleted = new ArrayList<ChangeContentType>();
			List<ChangeContentType> added = new ArrayList<ChangeContentType>();			
			for (Map.Entry<String, List<ChangeContentType>> entry : operations.entrySet())
			{			
			    for (ChangeContentType p : entry.getValue()){
			    	if (p.getKind() == DifferenceKind.DELETE){		
			    		added.add(p);			    		
			    		System.out.println(entry.getKey() + " " + p.getNewValueProduces() + " Added");		    		
			    	}
			    	if (p.getKind() == DifferenceKind.ADD){			    		
			    		deleted.add(p);
			    		System.out.println(entry.getKey() + " " + p.getOldValueProduces() + " Deleted");		    		
			    	}		    	
			    }
			}
			
			diffMetamodel.createExposeDataInstance(deleted, added, changes);
			System.out.println("\n ");
		}
	}	
	
	public static void processAddRestrictedAccess(DiffToModelTransformation diffMetamodel, List<ChangeResponse> addResponses, EList<Change> changes) {
		for(ChangeResponse changeResponse :  addResponses) {
			if(changeResponse.getResponse().getCode().equals("403") || changeResponse.getResponse().getCode().equals("401")) {
				diffMetamodel.createAddRestriction(changeResponse,changes);
			}
		}
	}
	
	public static void processRemoveRestrictedAccessToTheAPI(DiffToModelTransformation diffMetamodel, List<ChangeResponse> removeResponses, List<Change> changes) {
		System.out.println("-------------------- RemoveRestrictedAccessToTheAPI");	
		for(ChangeResponse removeRes: removeResponses) {
			if (removeRes.getDifferenceKind() == DifferenceKind.DELETE &&
				("401".equals(removeRes.getResponse().getCode()) ||
				 "403".equals(removeRes.getResponse().getCode()))){
				
				System.out.println(removeRes.getPath() + " " + removeRes.getResponse().getCode() + " Remove");		  
				System.out.println("\n ");
				diffMetamodel.createRemoveRestrictedAccessToTheAPIInstance(removeRes, changes);
			}
		}
	}

	/************************************ GET METHODS ************************************************************/
	
	public static void getAddedParameters(List<ChangeParameter> addParameters, Map<String, List<ChangeParameter>> operations, Diff diff, String newVersion) {		
		if (((ReferenceChange)diff).getValue() instanceof ParameterImpl && diff.getKind() == DifferenceKind.DELETE){
			ParameterImpl parameter = (ParameterImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getRight().eContainer();
								
				ChangeParameter param = new ChangeParameter();
				param.setNewParameter(parameter);
				param.setVersion(newVersion);
				param.setDifferenceKind(DifferenceKind.ADD);
				param.setPath(path.getRelativePath());				
				param.setNewParameterUri(EcoreUtil.getURI(parameter).toString());
				
				setOperation(path, param);
				
				addOperations(operations, path, param);
				
				addParameters.add(param);
			}
		}
	}

	public static void getChangedParameters(List<ChangeParameter> changeParameters, Diff diff, String oldVersion, String newVersion) {
		if (diff.getKind() == DifferenceKind.CHANGE){			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight() instanceof ParameterImpl &&
				diff.getMatch().getLeft() != null && diff.getMatch().getLeft() instanceof ParameterImpl ){						
				Parameter oldParameter = (Parameter)diff.getMatch().getLeft();
				Parameter newParameter = (Parameter)diff.getMatch().getRight();
				
				ChangeParameter param = new ChangeParameter();
				param.setOldParameter(oldParameter);
				param.setNewParameter(newParameter);
				param.setVersion(newVersion);
				param.setDifferenceKind(DifferenceKind.CHANGE);
				param.setPath(null);				
				param.setNewParameterUri(EcoreUtil.getURI(newParameter).toString());
				
				if (oldParameter != null)
					param.setOldParameterUri(EcoreUtil.getURI(oldParameter).toString());
				PathImpl pathNewParam=null;
				PathImpl pathOldParam=null;			
				for(Setting setting : getUsages(newParameter)){
    				EObject object = setting.getEObject();
    		    	if (object instanceof OperationImpl){
    		    		pathNewParam = ((PathImpl)((OperationImpl)object).eContainer());    		    		
    		    		break;
    		    	}
    		    }	
				for(Setting setting : getUsages(oldParameter)){
    				EObject object = setting.getEObject();
    		    	if (object instanceof OperationImpl){
    		    		pathOldParam = ((PathImpl)((OperationImpl)object).eContainer());    		    		
    		    		break;
    		    	}
    		    }
				if(pathOldParam!=null && pathNewParam!= null && pathNewParam.getRelativePath().equals(pathOldParam.getRelativePath())) {
					param.setPath(pathNewParam.getRelativePath());
		    		setOperation(pathNewParam, param);
					
					changeParameters.add(param);						
				}
			}			
		}
	}

	public static void getDeletedParameters(List<ChangeParameter> deleteParameters, Map<String, List<ChangeParameter>> operations, Diff diff, String oldVersion) {
		if (((ReferenceChange)diff).getValue() instanceof ParameterImpl && diff.getKind() == DifferenceKind.ADD){
			ParameterImpl parameter = (ParameterImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getLeft() != null && diff.getMatch().getLeft().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getLeft().eContainer();
							
				ChangeParameter param = new ChangeParameter();
				param.setNewParameter(parameter);
				param.setVersion(oldVersion);
				param.setDifferenceKind(DifferenceKind.DELETE);
				param.setPath(path.getRelativePath());				
				param.setNewParameterUri(EcoreUtil.getURI(parameter).toString());
				setOperation(path, param);	
				
				addOperations(operations, path, param);		
				
				deleteParameters.add(param);				
			}
		}
	}

	public static void getDeletedOperations(List<ChangeOperation> deleteOperations, Diff diff, String newVersion) {
		if (((ReferenceChange)diff).getValue() instanceof OperationImpl && 
			diff.getKind() == DifferenceKind.ADD &&
			diff.getSource() == DifferenceSource.LEFT){
			Operation oldOperation = (Operation)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getLeft() != null && diff.getMatch().getLeft() instanceof PathImpl && diff.getMatch().getRight() != null && diff.getMatch().getRight() instanceof PathImpl){						
				PathImpl newPath = (PathImpl)diff.getMatch().getRight();
				PathImpl oldPath = (PathImpl)diff.getMatch().getLeft();				
				
				if (!newPath.getRelativePath().equals(oldPath.getRelativePath())) return;
				
				ChangeOperation operation = new ChangeOperation();
				operation.setVersion(newVersion);
				operation.setDifferenceKind(DifferenceKind.DELETE);
				operation.setPath(oldPath.getRelativePath());
				operation.setOldOperation(oldOperation);				
				operation.setOldOperationUri(EcoreUtil.getURI(oldOperation).toString());
				operation.setNewOperation(null);				
				operation.setNewOperationUri("");		
				operation.setOldPath(oldPath);
				operation.setNewPath(newPath);
				
				if(oldPath.getGet() != null && EcoreUtil.getURI(oldOperation).equals(EcoreUtil.getURI(oldPath.getGet())))
					operation.setMethod("Get");
				else if(oldPath.getDelete() != null && EcoreUtil.getURI(oldOperation).equals(EcoreUtil.getURI(oldPath.getDelete())))
					operation.setMethod("Delete");
				else if(oldPath.getPatch() != null && EcoreUtil.getURI(oldOperation).equals(EcoreUtil.getURI(oldPath.getPatch())))
					operation.setMethod("Patch");
				else if(oldPath.getPost() != null && EcoreUtil.getURI(oldOperation).equals(EcoreUtil.getURI(oldPath.getPost())))
					operation.setMethod("Post");
				else if(oldPath.getPut() != null && EcoreUtil.getURI(oldOperation).equals(EcoreUtil.getURI(oldPath.getPut())))
					operation.setMethod("Put");
				else if(oldPath.getOptions() != null && EcoreUtil.getURI(oldOperation).equals(EcoreUtil.getURI(oldPath.getOptions())))
					operation.setMethod("Options");
				
				deleteOperations.add(operation);
			}
		}
	}
	
	public static void getChangedOperations(List<ChangeOperation> changeOperations, Diff diff, String oldVersion, String newVersion) {
		if (diff.getKind() == DifferenceKind.CHANGE){			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight() instanceof OperationImpl){						
				Operation oldOperation = (Operation)diff.getMatch().getLeft();
				Operation newOperation = (Operation)diff.getMatch().getRight();
				
				Path path = (PathImpl)(newOperation).eContainer();				
				
				ChangeOperation operation = new ChangeOperation();
				operation.setOldOperation(oldOperation);
				operation.setNewOperation(newOperation);
				operation.setVersion(newVersion);
				operation.setDifferenceKind(DifferenceKind.CHANGE);
				operation.setPath(path.getRelativePath());				
				operation.setNewOperationUri(EcoreUtil.getURI(newOperation).toString());
				
				if (oldOperation != null)
					operation.setOldOperationUri(EcoreUtil.getURI(oldOperation).toString());
				
				if(path.getGet() != null && EcoreUtil.getURI(newOperation).equals(EcoreUtil.getURI(path.getGet())))
					operation.setMethod("Get");
				else if(path.getDelete() != null && EcoreUtil.getURI(newOperation).equals(EcoreUtil.getURI(path.getDelete())))
					operation.setMethod("Delete");
				else if(path.getPatch() != null && EcoreUtil.getURI(newOperation).equals(EcoreUtil.getURI(path.getPatch())))
					operation.setMethod("Patch");
				else if(path.getPost() != null && EcoreUtil.getURI(newOperation).equals(EcoreUtil.getURI(path.getPost())))
					operation.setMethod("Post");
				else if(path.getPut() != null && EcoreUtil.getURI(newOperation).equals(EcoreUtil.getURI(path.getPut())))
					operation.setMethod("Put");
				else if(path.getOptions() != null && EcoreUtil.getURI(newOperation).equals(EcoreUtil.getURI(path.getOptions())))
					operation.setMethod("Options");
				
				changeOperations.add(operation);						
			}			
		}
	}

	
	public static void getAddedResponse(List<ChangeResponse> addResponses, Diff diff, String newVersion) {		
		if (((ReferenceChange)diff).getValue() instanceof ResponseImpl && diff.getKind() == DifferenceKind.DELETE){
			ResponseImpl response = (ResponseImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getRight().eContainer();
				
				ChangeResponse changeResponse = new ChangeResponse();
				changeResponse.setResponse(response);
				changeResponse.setVersion(newVersion);
				changeResponse.setDifferenceKind(DifferenceKind.ADD);
				changeResponse.setPath(path.getRelativePath());				
				changeResponse.setUri(EcoreUtil.getURI(response).toString());
				setOperation(path, changeResponse);			
				
				addResponses.add(changeResponse);
			}
		}
	}	
	public static void getDeletedResponse(List<ChangeResponse> deleteResponse, Diff diff, String oldVersion) {
		if (((ReferenceChange)diff).getValue() instanceof ResponseImpl && diff.getKind() == DifferenceKind.ADD){
			ResponseImpl response = (ResponseImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getLeft() != null && diff.getMatch().getLeft().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getLeft().eContainer();
				
				ChangeResponse changeResponse = new ChangeResponse();
				changeResponse.setResponse(response);
				changeResponse.setVersion(oldVersion);
				changeResponse.setDifferenceKind(DifferenceKind.DELETE);
				changeResponse.setPath(path.getRelativePath());				
				changeResponse.setUri(EcoreUtil.getURI(response).toString());
				setOperation(path, changeResponse);						
				
				deleteResponse.add(changeResponse);				
			}
		}
	}
	
	
	public static void getSchemaChanges(List<ChangeSchema> addAndDeletedSchemas, List<ChangeSchema> changeSchemas, Diff diff) {
		Schema schemaUpdated;
		if ( ((ReferenceChange)diff).getValue() instanceof Schema && (diff.getKind() == DifferenceKind.ADD || diff.getKind() == DifferenceKind.DELETE || diff.getKind() == DifferenceKind.CHANGE)){
			schemaUpdated = (Schema)(((ReferenceChange)diff).getValue());
	
			EObject left = diff.getMatch().getLeft();
			EObject right = diff.getMatch().getRight();
			
			if(left instanceof Schema && right instanceof Schema  && ((Schema)left).getName() !=null && ((Schema)right).getName() != null && ((Schema)left).getName().equals(((Schema)right).getName())) {
				ChangeSchema updated = new ChangeSchema();
				
				updated.setSchema(schemaUpdated);
				updated.setUri(EcoreUtil.getURI(schemaUpdated));
				updated.setDifferenceKind(diff.getKind());
				updated.setDiff(diff);
				addAndDeletedSchemas.add(updated);
				if (diff.getKind() == DifferenceKind.CHANGE) {
					System.out.println("schema update: "+updated.getSchema().getName()+ " -> " +updated.getUri());
					changeSchemas.add(updated);
				}else
					System.out.println("schema add/delete: "+updated.getSchema().getName() + " -> " +updated.getUri() );
				
			}
		}
	}
	
	public static void getContentTypesUpdated(List<ChangeContentType> contentTypesUpdated, Diff diff) {
		EAttribute att = null;
		if (((AttributeChange)diff).getAttribute() instanceof EAttributeImpl && (diff.getKind() == DifferenceKind.DELETE || diff.getKind() == DifferenceKind.ADD)){
			att = (EAttributeImpl)((AttributeChange)diff).getAttribute();
		EObject left = (((AttributeChange)diff).getMatch().getLeft());
		EObject right = (((AttributeChange)diff).getMatch().getRight());
		 if (left instanceof OperationImpl && right instanceof OperationImpl) {
			 PathImpl pathRight = (PathImpl)(right.eContainer());
			 PathImpl pathLeft = (PathImpl)(left.eContainer());
			 if(pathRight.getRelativePath().equals(pathLeft.getRelativePath())){
				 if(att.getName().equals("produces") || att.getName().equals("consumes")) {
					ChangeContentType change = new ChangeContentType();
					change.setAttr(att);
					change.setPath(pathRight.getRelativePath());
					change.setOldUri(EcoreUtil.getURI(left).toString());
					change.setNewUri(EcoreUtil.getURI(right).toString());
					change.setKind(diff.getKind());					
					change.setPathObject(pathRight);
					
					String oldProduceAll = "";
					for (String produce : ((Operation)left).getProduces()){
						oldProduceAll += produce + " ";
					}
					change.setOldValueProduces(oldProduceAll);
					
					String newProduceAll = "";
					for (String produce : ((Operation)right).getProduces()){
						newProduceAll += produce + " ";
					}
					change.setNewValueProduces(newProduceAll);
					
					String oldConsumesAll = "";
					for (String consumes : ((Operation)left).getConsumes()){
						oldConsumesAll += consumes + " ";
					}
					change.setOldValueConsumes(oldConsumesAll);
					
					String newConsumesAll = "";
					for (String consumes : ((Operation)right).getConsumes()){
						newConsumesAll += consumes + " ";
					}
					change.setNewValueConsumes(newConsumesAll);
					
					contentTypesUpdated.add(change);
				 }					 
			 }
		 }
		}
	}
	
	
	public static void getDeletedPaths(List<ChangePath> deletePaths, Diff diff, String oldVersion, String newVersion) {
		if (((ReferenceChange)diff).getValue() instanceof PathImpl && (diff.getKind() == DifferenceKind.ADD  || diff.getKind() == DifferenceKind.MOVE || diff.getKind() == DifferenceKind.CHANGE)){
			PathImpl oldPath = (PathImpl)((ReferenceChange)diff).getValue();
							
			ChangePath path = new ChangePath();			
			path.setVersion(newVersion);
			path.setDifferenceKind(DifferenceKind.DELETE);
			path.setPath(oldPath.getRelativePath());				
			path.setOldPathUri(EcoreUtil.getURI(oldPath).toString());
			path.setOldPath(oldPath);			
			path.setNewPath(null);
			path.setNewPathUri(null);
		
			deletePaths.add(path);			
		}
	}				
	
	/************************************ PRIVATE METHODS ************************************************************/
	
	private static void addOperations(Map<String, List<ChangeParameter>> operations, PathImpl path,
			ChangeParameter param) {
		
		for(OperationWrapper wrapper : param.getOperations()){
			List<ChangeParameter> params = operations.get(path.getRelativePath() + ":" + wrapper.getMethod());
			if (params == null)
				params = new ArrayList<ChangeParameter>();			
			params.add(param);
			operations.put(path.getRelativePath() + ":" + wrapper.getMethod(), params);
		}
	}	
	
	private static void setOperation(PathImpl path, ChangeParameter param) {
		Operation getOperation = path.getGet();
		Operation deleteOperation = path.getDelete();
		Operation pathcOperation = path.getPatch();
		Operation postOperation = path.getPost();
		Operation putOperation = path.getPut();
		Operation optionsOperation = path.getOptions();
		
		if (getOperation != null && paramBelongsToOperation(param,getOperation)){				
			OperationWrapper wrapper = new OperationWrapper();
			wrapper.setOperation(getOperation);
			wrapper.setMethod("Get");
			param.setMethod("Get");
			
			param.getOperations().add(wrapper);											
		}
		if (deleteOperation != null && paramBelongsToOperation(param,deleteOperation)){	
			OperationWrapper wrapper = new OperationWrapper();
			wrapper.setOperation(deleteOperation);
			wrapper.setMethod("Delete");			
			param.setMethod("Delete");
			
			param.getOperations().add(wrapper);					
		}
		if (pathcOperation != null && paramBelongsToOperation(param,pathcOperation)){		
			OperationWrapper wrapper = new OperationWrapper();
			wrapper.setOperation(pathcOperation);
			wrapper.setMethod("Patch");
			param.setMethod("Patch");
			
			param.getOperations().add(wrapper);					
		}
		if (postOperation != null && paramBelongsToOperation(param,postOperation)){	
			OperationWrapper wrapper = new OperationWrapper();
			wrapper.setOperation(postOperation);
			wrapper.setMethod("Post");
			param.setMethod("Post");
			
			param.getOperations().add(wrapper);					
		}
		if (putOperation != null && paramBelongsToOperation(param,putOperation)){	
			OperationWrapper wrapper = new OperationWrapper();
			wrapper.setOperation(putOperation);
			wrapper.setMethod("Put");
			param.setMethod("Put");
			
			param.getOperations().add(wrapper);					
		}
		if (optionsOperation != null && paramBelongsToOperation(param,optionsOperation)){	
			OperationWrapper wrapper = new OperationWrapper();
			wrapper.setOperation(optionsOperation);
			wrapper.setMethod("Options");
			param.setMethod("Options");
			
			param.getOperations().add(wrapper);					
		}
	}	
	
	private static boolean paramBelongsToOperation(ChangeParameter param, Operation operation) {
		boolean belongsTo = false;
		for(Parameter p: operation.getParameters()) {
			if(EcoreUtil.getURI(p).toString().equals(param.getNewParameterUri()) || EcoreUtil.getURI(p).toString().equals(param.getOldParameterUri())){
					belongsTo = true;
					break;
			}
		}
		return belongsTo;
	}

	private static void setOperation(PathImpl path, ChangeResponse changeResponse) {
		Operation getOperation = path.getGet();
		Operation deleteOperation = path.getDelete();
		Operation pathcOperation = path.getPatch();
		Operation postOperation = path.getPost();
		Operation putOperation = path.getPut();		
		Operation optionsOperation = path.getOptions();
		
		if (getOperation != null && responseBelongsToOperation(changeResponse,getOperation)){							
			changeResponse.setOperation(getOperation);	
			changeResponse.setMethod("Get");
		}
		else if (deleteOperation != null && responseBelongsToOperation(changeResponse,deleteOperation)){							
			changeResponse.setOperation(deleteOperation);	
			changeResponse.setMethod("Delete");
		}
		else if (pathcOperation != null && responseBelongsToOperation(changeResponse,pathcOperation)){							
			changeResponse.setOperation(pathcOperation);		
			changeResponse.setMethod("Pathc");
		}
		else if (postOperation != null && responseBelongsToOperation(changeResponse,postOperation)){							
			changeResponse.setOperation(postOperation);
			changeResponse.setMethod("Post");
		}
		else if (putOperation != null && responseBelongsToOperation(changeResponse,putOperation)){							
			changeResponse.setOperation(putOperation);
			changeResponse.setMethod("Put");
		}
		else if (optionsOperation != null && responseBelongsToOperation(changeResponse,optionsOperation)){							
			changeResponse.setOperation(optionsOperation);
			changeResponse.setMethod("Options");
		}
	}
	

	private static boolean responseBelongsToOperation(ChangeResponse changeResponse, Operation operation) {
		boolean belongsTo = false;
		for(Response response: operation.getResponses()) {
			if(EcoreUtil.getURI(response).toString().equals(changeResponse.getUri())){
					belongsTo = true;
					break;
			}
		}
		return belongsTo;
	}

	private static boolean isNullOrEmpty(String value){
		return value == null || value.trim().isEmpty();
	}	
	
	private static Collection<Setting> getUsages(EObject eobject) {
		EObject rootEObject = EcoreUtil.getRootContainer(eobject);
	    Resource resource = rootEObject.eResource();
		Collection<Setting> usages;
		if (resource == null)		    
		  usages = UsageCrossReferencer.find(eobject, rootEObject);		    
		else
		{
		  ResourceSet resourceSet = resource.getResourceSet();
		  if (resourceSet == null)		      
		    usages = UsageCrossReferencer.find(eobject, resource);		      
		  else		      
		    usages = UsageCrossReferencer.find(eobject, resourceSet);		    
		 
		}
		return usages;
	}
	
	private static Collection<ParameterImpl> getParametersRecursively(Collection<Setting> usages, Collection<String> schemaIds, Collection<String> parameterIds){
		Collection<ParameterImpl> parameters = new ArrayList<ParameterImpl>();
		for (Setting usage : usages)
	    {			
	    	EObject parent = usage.getEObject();
	    	if (parent instanceof SchemaImpl && !schemaIds.contains(EcoreUtil.getURI((SchemaImpl)parent).toString())){
	    		schemaIds.add(EcoreUtil.getURI((SchemaImpl)parent).toString());	    		
	    		parameters.addAll(getParametersRecursively(getUsages(parent), schemaIds, parameterIds));	    				    		
	    	}
	    	else if (parent instanceof ParameterImpl && !parameterIds.contains(EcoreUtil.getURI((ParameterImpl)parent).toString())){
	    		parameterIds.add(EcoreUtil.getURI((ParameterImpl)parent).toString());	  
	    		parameters.add((ParameterImpl)parent);
	    	}
	    }
		
		return parameters;
	}

	private static Collection<ResponseImpl> getResponsesRecursively(Collection<Setting> usages, Collection<String> schemaIds, Collection<String> responsesIds){
		Collection<ResponseImpl> responses = new ArrayList<ResponseImpl>();
		for (Setting usage : usages)
	    {			
	    	EObject parent = usage.getEObject();
	    	if (parent instanceof SchemaImpl && !schemaIds.contains(EcoreUtil.getURI((SchemaImpl)parent).toString())){
	    		schemaIds.add(EcoreUtil.getURI((SchemaImpl)parent).toString());	    		
	    		responses.addAll(getResponsesRecursively(getUsages(parent), schemaIds, responsesIds));	    				    		
	    	}
	    	else if (parent instanceof ResponseImpl && !responsesIds.contains(EcoreUtil.getURI((ResponseImpl)parent).toString())){
	    		responsesIds.add(EcoreUtil.getURI((ResponseImpl)parent).toString());	  
	    		responses.add((ResponseImpl)parent);
	    	}
	    }
		
		return responses;
	}
	
}
