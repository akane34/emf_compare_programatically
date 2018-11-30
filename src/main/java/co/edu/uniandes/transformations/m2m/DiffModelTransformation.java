package co.edu.uniandes.transformations.m2m;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.changesIdentifier.ChangeBoundaryParameter;
import co.edu.uniandes.changesIdentifier.ChangeContentType;
import co.edu.uniandes.changesIdentifier.ChangeOperation;
import co.edu.uniandes.changesIdentifier.ChangeParameter;
import co.edu.uniandes.changesIdentifier.ChangePath;
import co.edu.uniandes.changesIdentifier.ChangeResponse;
import co.edu.uniandes.changesIdentifier.ChangeSchema;
import co.edu.uniandes.changesIdentifier.ModifyParameterSchema;
import co.edu.uniandes.metamodels.Diff.*;
import co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl;
import edu.uoc.som.openapi.JSONDataType;
import edu.uoc.som.openapi.Parameter;

public class DiffModelTransformation {

	private DiffPackage diffPackage;	
	private DiffFactory diffFactory;
	private Resource xmiResource;
	
	public DiffModelTransformation(String outputFilePath){
		diffPackage = DiffPackage.eINSTANCE;		
		EPackage.Registry.INSTANCE.put(diffPackage.getNsURI(), diffPackage);		
		
		DiffPackage.eINSTANCE.eClass();
		DiffPackageImpl.init();
		diffFactory = DiffFactory.eINSTANCE;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        
        ResourceSet resSet = new ResourceSetImpl();
        xmiResource = resSet.createResource(URI.createFileURI(outputFilePath));        
	}	
	
	public Diff createDiffModel(String oldVersion, String newVersion) {
		Diff diff = diffFactory.createDiff();
		diff.setOldVersion(oldVersion);
		diff.setNewVersion(newVersion);
		xmiResource.getContents().add(diff);
		return diff;
	}	
	
	public void createChangeTypeOfParameterInstance(ChangeParameter oldParameter, ChangeParameter newParameter,List<Change> changes){		
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(oldParameter.getNewParameterUri());
		oldElementReference.setValue(oldParameter.getNewParameter().getName());
		oldElementReference.setPath(oldParameter.getPath());
		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(newParameter.getNewParameterUri());
		newElementReference.setValue(newParameter.getNewParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		ParameterType parameterType = diffFactory.createParameterType();
		parameterType.setOld(oldElementReference);
		parameterType.setNew(newElementReference);
		parameterType.setChangeElement(APIElementType.METHOD_PARAMETER);		
								
		changes.add(parameterType);
	}	
	
	public void createRenameParameterInstance(ChangeParameter parameter, List<Change> changes){
		ElementReference oldElementReference = diffFactory.createElementReference();				
		oldElementReference.setEObject(parameter.getOldParameterUri());
		oldElementReference.setValue(parameter.getOldParameter().getName());
		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(parameter.getNewParameterUri());
		newElementReference.setValue(parameter.getNewParameter().getName());

		RenameParameter rename = diffFactory.createRenameParameter();		
		rename.setChangeElement(APIElementType.METHOD_PARAMETER);
		rename.setOld(oldElementReference);		
		rename.setNew(newElementReference);		
								
		changes.add(rename);
	}	
	
	public void createIncreaseNumberOfParametersInstance(String oldVersion, ChangeParameter newParameter, List<Change> changes){		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(newParameter.getNewParameterUri());
		newElementReference.setValue(newParameter.getNewParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		AddParameter add = diffFactory.createAddParameter();
		add.setChangeElement(APIElementType.METHOD_PARAMETER);
		add.setNew(newElementReference);
								
		changes.add(add);
	}
	
	public void createDecreaseNumberOfParametersInstance(String oldVersion, ChangeParameter newParameter,List<Change> changes){		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(newParameter.getNewParameterUri());
		newElementReference.setValue(newParameter.getNewParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		RemoveParameter delete = diffFactory.createRemoveParameter();
		delete.setChangeElement(APIElementType.METHOD_PARAMETER);
		delete.setNew(newElementReference);
				
		changes.add(delete);
		
	}
	
	public void createChangeFormatOfReturnValueInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createExposeDataInstance(List<ChangeContentType> deleted, List<ChangeContentType> added, List<Change> changes){		
		ExposeData exposeData = diffFactory.createExposeData();
		exposeData.setChangeElement(APIElementType.PATH);		
		
		for (ChangeContentType contentType : deleted){
			ElementReference oldElementReference = diffFactory.createElementReference();
			oldElementReference.setValue(contentType.getValue());		
			oldElementReference.setEObject(contentType.getUri());
			oldElementReference.setPath(contentType.getPath());
			
			Delete delete = diffFactory.createDelete();
			delete.setChangeElement(APIElementType.CONTENT_TYPE);
			delete.setOld(oldElementReference);
			
			exposeData.getSimpleDiffs().add(delete);
			changes.add(delete);
		}
		
		for (ChangeContentType contentType : added){
			ElementReference newElementReference = diffFactory.createElementReference();
			newElementReference.setValue(contentType.getValue());		
			newElementReference.setEObject(contentType.getUri());
			newElementReference.setPath(contentType.getPath());
			
			Add add = diffFactory.createAdd();
			add.setChangeElement(APIElementType.CONTENT_TYPE);
			add.setOld(newElementReference);
			
			exposeData.getSimpleDiffs().add(add);
			changes.add(add);
		}	
		
		changes.add(exposeData);
	}
		
	public void createChangeTypeOfReturnValueInstance(ChangeResponse oldResponse, ChangeResponse newResponse, List<Change> changes){
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setValue(oldResponse.getResponse().getSchema().getName());		
		oldElementReference.setEObject(oldResponse.getUri());
		oldElementReference.setPath(oldResponse.getPath());
		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(newResponse.getUri());
		newElementReference.setValue(newResponse.getResponse().getSchema().getName());
		newElementReference.setPath(newResponse.getPath());
						
		ReturnType returnType = diffFactory.createReturnType();
		returnType.setOld(oldElementReference);
		returnType.setNew(newElementReference);
		returnType.setChangeElement(APIElementType.RETURN_TYPE);		
								
		changes.add(returnType);
	}
	
	public void createUnsupportRequestMethodInstance(ChangeOperation operation, List<Change> changes){
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(operation.getOldOperationUri());
		oldElementReference.setValue(operation.getOldOperation().getFullPath());		
		oldElementReference.setPath(operation.getPath());

		UnsupportRequestMethod delete = diffFactory.createUnsupportRequestMethod();
		delete.setChangeElement(APIElementType.METHOD);
		delete.setOld(oldElementReference);		
						
		changes.add(delete);      
	}
	
	public void createRenameMethodInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createCombineMethodsInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createSplitMethodInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createRelocateSameParameterInstance(ChangeParameter parameter, List<Change> changes){		
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(parameter.getOldParameterUri());
		oldElementReference.setValue(parameter.getOldParameter().getName());		
		oldElementReference.setPath(parameter.getPath());
		
		Delete delete = diffFactory.createDelete();
		delete.setChangeElement(APIElementType.METHOD_PARAMETER);
		delete.setOld(oldElementReference);
		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(parameter.getNewParameterUri());
		newElementReference.setValue(parameter.getNewParameter().getName());		
		newElementReference.setPath(parameter.getPath());
		
		Add add = diffFactory.createAdd();	
		add.setChangeElement(APIElementType.METHOD_PARAMETER);
		add.setNew(newElementReference);		
				
		ParameterLocation oldLocationP = ParameterLocation.getByName(parameter.getOldParameter().getLocation().getName().toLowerCase());
		ParameterLocation newLocationP = ParameterLocation.getByName(parameter.getNewParameter().getLocation().getName().toLowerCase());
		
		SameParameter relocate = diffFactory.createSameParameter();
		relocate.setChangeElement(APIElementType.METHOD_PARAMETER);
		relocate.setNewLocation(newLocationP);
		relocate.setOldLocation(oldLocationP);		
		relocate.getSimpleDiffs().add(add);		
		relocate.getSimpleDiffs().add(delete);	
			
		changes.add(delete);		
		changes.add(add);
		changes.add(relocate);        
	}
	
	public void createRelocateMultipleParametersInOneParameterInstance(ChangeParameter newParameter, List<ChangeParameter> oldParameters, List<Change> changes){		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(newParameter.getNewParameterUri());
		newElementReference.setValue(newParameter.getNewParameter().getName());		
		newElementReference.setPath(newParameter.getPath());
		
		Add add = diffFactory.createAdd();	
		add.setChangeElement(APIElementType.METHOD_PARAMETER);
		add.setNew(newElementReference);		
				
		ParameterLocation oldLocationP = ParameterLocation.getByName(oldParameters.get(0).getNewParameter().getLocation().getName().toLowerCase());
		ParameterLocation newLocationP = ParameterLocation.getByName(newParameter.getNewParameter().getLocation().getName().toLowerCase());
		
		MultipleParametersInOne relocate = diffFactory.createMultipleParametersInOne();
		relocate.setChangeElement(APIElementType.METHOD_PARAMETER);
		relocate.setNewLocation(newLocationP);
		relocate.setOldLocation(oldLocationP);		
		relocate.getSimpleDiffs().add(add);		
		
		for (ChangeParameter p : oldParameters){
			ElementReference oldElementReference = diffFactory.createElementReference();
			oldElementReference.setEObject(p.getNewParameterUri());
			oldElementReference.setValue(p.getNewParameter().getName());		
			oldElementReference.setPath(p.getPath());
			
			Delete delete = diffFactory.createDelete();
			delete.setChangeElement(APIElementType.METHOD_PARAMETER);
			delete.setOld(oldElementReference);
			
			relocate.getSimpleDiffs().add(delete);
			
			changes.add(delete);
		}
		changes.add(add);
		changes.add(relocate);        
	}
	
	public void createChangeDefaultValueOfParameterInstance(ChangeParameter parameter, List<Change> changes){
		ElementReference oldElementReference = diffFactory.createElementReference();				
		oldElementReference.setEObject(parameter.getOldParameterUri());
		oldElementReference.setValue(parameter.getOldParameter().getDefault());
		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(parameter.getNewParameterUri());
		newElementReference.setValue(parameter.getNewParameter().getDefault());

		DefaultValue defaultValue = diffFactory.createDefaultValue();		
		defaultValue.setChangeElement(APIElementType.METHOD_PARAMETER);
		defaultValue.setOld(oldElementReference);
		defaultValue.setNew(newElementReference);
								
		changes.add(defaultValue);
	}
	
	public void saveInstance() {
		try {
            xmiResource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public void createDeleteStatusCode(ChangeResponse delRes, List<Change> changes) {
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(delRes.getUri());
		oldElementReference.setValue(delRes.getResponse().getCode());
		oldElementReference.setPath(delRes.getPath());
		
		RemoveStatusCode delete = diffFactory.createRemoveStatusCode();
		delete.setChangeElement(APIElementType.STATUS_CODE);
		delete.setOld(oldElementReference);
		
		changes.add(delete);
		
	}

	public void createAddedStatusCode(ChangeResponse addRes, List<Change> changes) {
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(addRes.getUri());
		newElementReference.setValue(addRes.getResponse().getCode());
		newElementReference.setPath(addRes.getPath());
		
		AddStatusCode add = diffFactory.createAddStatusCode();
		add.setChangeElement(APIElementType.STATUS_CODE);
		add.setNew(newElementReference);
		
		changes.add(add);
	}

	public void createLowerBoundary(ChangeBoundaryParameter boundaryUpdated, List<Change> changes) {
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(boundaryUpdated.getNewUri());
		newElementReference.setValue(boundaryUpdated.getNewParam().getMinimum().toString());
		
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(boundaryUpdated.getOldUri());
		oldElementReference.setValue(boundaryUpdated.getOldParam().getMinimum().toString());
		
		LowerBondary lowerBoundary = diffFactory.createLowerBondary();
		lowerBoundary.setChangeElement(APIElementType.METHOD_PARAMETER);
		lowerBoundary.setNew(newElementReference);
		lowerBoundary.setOld(oldElementReference);
		changes.add(lowerBoundary);
	}

	public void createUpperBoundary(ChangeBoundaryParameter boundaryUpdated, List<Change> changes) {
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(boundaryUpdated.getNewUri());
		newElementReference.setValue(boundaryUpdated.getNewParam().getMaximum().toString());
		
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(boundaryUpdated.getOldUri());
		oldElementReference.setValue(boundaryUpdated.getOldParam().getMaximum().toString());
		
		UpperBondary upperBoundary = diffFactory.createUpperBondary();
		upperBoundary.setChangeElement(APIElementType.METHOD_PARAMETER);
		upperBoundary.setNew(newElementReference);
		upperBoundary.setOld(oldElementReference);
		changes.add(upperBoundary);
		
	}

	public void createAddedSchemaProperty(ChangeSchema schemaUpdated, List<Change> changes) {
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(schemaUpdated.getUri().toString());
		newElementReference.setValue(schemaUpdated.getSchema().getName());
		
		ReturnType returnType = diffFactory.createReturnType();
		
		returnType.setChangeElement(APIElementType.CLASS);		
		returnType.setNew(newElementReference);
		changes.add(returnType);
	}
	
	public void createDeletedSchemaProperty(ChangeSchema schemaUpdated, List<Change> changes) {
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(schemaUpdated.getUri().toString());
		oldElementReference.setValue(schemaUpdated.getSchema().getName());
		
		ReturnType returnType = diffFactory.createReturnType();
		
		returnType.setChangeElement(APIElementType.CLASS);		
		returnType.setOld(oldElementReference);
		changes.add(returnType);
	}

	public void createProduceUpdate(ChangeContentType contentTypeUpdated, EList<Change> changes) {
		
		ElementReference elementReference = diffFactory.createElementReference();
		elementReference.setEObject(contentTypeUpdated.getUri());
		elementReference.setPath(contentTypeUpdated.getPath());
		elementReference.setValue(contentTypeUpdated.getValue());
		ProduceType produceType = diffFactory.createProduceType();
		produceType.setChangeElement(APIElementType.CONTENT_TYPE);
		
		switch (contentTypeUpdated.getKind()) {
		case ADD:
			produceType.setNew(elementReference);
			break;
		case DELETE:
			produceType.setOld(elementReference);
			break;
		default:
			break;
		}
		changes.add(produceType);
	}
	
	public void createConsumeTypeUpdate(ChangeContentType contentTypeUpdated, EList<Change> changes) {
		ElementReference elementReference = diffFactory.createElementReference();
		elementReference.setEObject(contentTypeUpdated.getUri());
		elementReference.setPath(contentTypeUpdated.getPath());
		elementReference.setValue(contentTypeUpdated.getValue());
		ConsumeType consumeType = diffFactory.createConsumeType();
		consumeType.setChangeElement(APIElementType.CONTENT_TYPE);
		
		switch (contentTypeUpdated.getKind()) {
		case ADD:
			consumeType.setNew(elementReference);
			break;
		case DELETE:
			consumeType.setOld(elementReference);
			break;
		default:
			break;
		}
		changes.add(consumeType);
		
	}
	
	public void createDeletedPathInstance(ChangePath path, List<Change> changes){
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(path.getOldPathUri());
		oldElementReference.setValue(path.getOldPath().getRelativePath());		
		oldElementReference.setPath(path.getPath());

		DeletePath delete = diffFactory.createDeletePath();
		delete.setChangeElement(APIElementType.INTERFACE);
		delete.setOld(oldElementReference);
						
		changes.add(delete);      
	}

	public void createModifyParameterSchemaTypeInstance(String path, Parameter parameter, List<ModifyParameterSchema> parameterSchemas, List<Change> changes){		
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(EcoreUtil.getURI(parameter).toString());
		newElementReference.setValue(parameter.getName());
		newElementReference.setPath(path);
		
		ModifyParameterSchemaType modifyParameter = diffFactory.createModifyParameterSchemaType();		
		modifyParameter.setChangeElement(APIElementType.METHOD_PARAMETER);		
		modifyParameter.setNew(newElementReference);
		
		for (ModifyParameterSchema m : parameterSchemas){
			Schema s = diffFactory.createSchema();
			s.setName(m.getSchema().getName());
			s.setUri(EcoreUtil.getURI(m.getSchema()).toString());
			
			xmiResource.getContents().add(s);
			modifyParameter.getSchemas().add(s);
		}
		
		changes.add(modifyParameter);
	}
	
	public void createRemoveRestrictedAccessToTheAPIInstance(ChangeResponse changeResponse, List<Change> changes) {
		ElementReference oldElementReference = diffFactory.createElementReference();
		oldElementReference.setEObject(changeResponse.getUri());
		oldElementReference.setValue(changeResponse.getResponse().getCode());
		oldElementReference.setPath(changeResponse.getPath());
		
		Delete delete = diffFactory.createDelete();
		delete.setChangeElement(APIElementType.STATUS_CODE);
		delete.setNew(oldElementReference);
		
		RemoveRestriction removeRestriction = diffFactory.createRemoveRestriction();
		removeRestriction.setChangeElement(APIElementType.STATUS_CODE);
		removeRestriction.getSimpleDiffs().add(delete);
		
		changes.add(delete);
		changes.add(removeRestriction);
	}
	
	public void createAddRestriction(ChangeResponse changeResponse, EList<Change> changes) {
		ElementReference newElementReference = diffFactory.createElementReference();
		newElementReference.setEObject(changeResponse.getUri());
		newElementReference.setValue(changeResponse.getResponse().getCode());
		newElementReference.setPath(changeResponse.getPath());
		
		Add add = diffFactory.createAdd();
		add.setChangeElement(APIElementType.STATUS_CODE);
		add.setNew(newElementReference);
		
		AddRestriction addRestriction = diffFactory.createAddRestriction();
		addRestriction.setChangeElement(APIElementType.STATUS_CODE);
		addRestriction.getSimpleDiffs().add(add);
		
		changes.add(add);
		changes.add(addRestriction);
	}
	
	/******************************************* P R I V A T E      M E T H O D S ***********************************/
	
	@SuppressWarnings("unused")
	private ElementType getType(JSONDataType type) {
		ElementType elementType = ElementType.UNSPECIFIED;
		switch (type) {
		case ARRAY:
			elementType = ElementType.ARRAY;
			break;
		case BOOLEAN:
			elementType = ElementType.BOOLEAN;
			break;
		case FILE:
			elementType = ElementType.FILE;
			break;
		case INTEGER:
			elementType = ElementType.INTEGER;
			break;
		case NULL:
			elementType = ElementType.NULL;
			break;
		case NUMBER:
			elementType = ElementType.NUMBER;
			break;
		case OBJECT:
			elementType = ElementType.OBJECT;
			break;
		case STRING:
			elementType = ElementType.STRING;
			break;
		default:
			break;		
		}
		return elementType;
	}

	
}