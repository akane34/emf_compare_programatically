package co.edu.uniandes.diff;

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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.changes.ChangeBoundaryParameter;
import co.edu.uniandes.changes.ChangeContentType;
import co.edu.uniandes.changes.ChangeParameter;
import co.edu.uniandes.changes.ChangePath;
import co.edu.uniandes.changes.ChangeResponse;
import co.edu.uniandes.changes.ChangeSchema;
import co.edu.uniandes.diff.metamodel.diff.*;
import co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl;
import edu.uoc.som.openapi.JSONDataType;
import co.edu.uniandes.changes.ChangeOperation;

public class DiffMetamodel {

	private diffPackage diffPackageI;	
	private diffFactory diffFactoryI;
	private Resource resource;
	
	
	public DiffMetamodel(){
		diffPackageI = diffPackage.eINSTANCE;		
		EPackage.Registry.INSTANCE.put(diffPackageI.getNsURI(), diffPackageI);		
		
		diffPackage.eINSTANCE.eClass();
		diffPackageImpl.init();
		diffFactoryI = diffFactory.eINSTANCE;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        
        ResourceSet resSet = new ResourceSetImpl();
        resource = resSet.createResource(URI.createFileURI("C:/temp/model.xmi"));        
	}	
	
	public Diff createDiff(String oldVersion, String newVersion) {
		Diff diff = diffFactoryI.createDiff();
		diff.setOldVersion(oldVersion);
		diff.setNewVersion(newVersion);
		resource.getContents().add(diff);
		return diff;
	}
	
	public void createChangeTypeOfParameterInstance(ChangeParameter oldParameter, ChangeParameter newParameter,List<Change> changes){		
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(oldParameter.getNewParameterUri());
		oldElementReference.setValue(oldParameter.getNewParameter().getName());
		oldElementReference.setPath(oldParameter.getPath());
		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newParameter.getNewParameterUri());
		newElementReference.setValue(newParameter.getNewParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		ElementDefinition oldDefinition = diffFactoryI.createElementDefinition();
		oldDefinition.setType(ElementType.getByName(oldParameter.getNewParameter().getType().getName().toLowerCase()));		
		if (oldParameter.getNewParameter().getSchema() != null)
			oldDefinition.setSchemaName(oldParameter.getNewParameter().getSchema().getName());
		
		ElementDefinition newDefinition = diffFactoryI.createElementDefinition();
		newDefinition.setType(ElementType.getByName(newParameter.getNewParameter().getType().getName().toLowerCase()));
		if (newParameter.getNewParameter().getSchema() != null)
			newDefinition.setSchemaName(newParameter.getNewParameter().getSchema().getName());
		
		ParameterType parameterType = diffFactoryI.createParameterType();
		parameterType.setOld(oldElementReference);
		parameterType.setNew(newElementReference);
		parameterType.setChangeElement(APIElementType.METHOD_PARAMETER);
		parameterType.setOldDefinition(oldDefinition);
		parameterType.setNewDefinition(newDefinition);
								
		changes.add(parameterType);
	}	
	
	public void createRenameParameterInstance(ChangeParameter parameter, List<Change> changes){
		ElementReference oldElementReference = diffFactoryI.createElementReference();				
		oldElementReference.setEObject(parameter.getOldParameterUri());
		oldElementReference.setValue(parameter.getOldParameter().getName());
		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(parameter.getNewParameterUri());
		newElementReference.setValue(parameter.getNewParameter().getName());

		RenameParameter rename = diffFactoryI.createRenameParameter();		
		rename.setChangeElement(APIElementType.METHOD_PARAMETER);
		rename.setOld(oldElementReference);		
		rename.setNew(newElementReference);		
								
		changes.add(rename);
	}	
	
	public void createIncreaseNumberOfParametersInstance(String oldVersion, ChangeParameter newParameter, List<Change> changes){		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newParameter.getNewParameterUri());
		newElementReference.setValue(newParameter.getNewParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		Add add = diffFactoryI.createAdd();
		add.setChangeElement(APIElementType.METHOD_PARAMETER);
		add.setNew(newElementReference);
								
		changes.add(add);
	}
	
	public void createDecreaseNumberOfParametersInstance(String oldVersion, ChangeParameter newParameter,List<Change> changes){		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newParameter.getNewParameterUri());
		newElementReference.setValue(newParameter.getNewParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		Delete delete = diffFactoryI.createDelete();
		delete.setChangeElement(APIElementType.METHOD_PARAMETER);
		delete.setNew(newElementReference);
				
		changes.add(delete);
		
	}
	
	public void createChangeFormatOfReturnValueInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createExposeDataInstance(List<ChangeContentType> deleted, List<ChangeContentType> added, List<Change> changes){
		
	}
		
	public void createChangeTypeOfReturnValueInstance(ChangeResponse oldResponse, ChangeResponse newResponse, List<Change> changes){
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setValue(oldResponse.getResponse().getSchema().getName());		
		oldElementReference.setEObject(oldResponse.getUri());
		oldElementReference.setPath(oldResponse.getPath());
		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newResponse.getUri());
		newElementReference.setValue(newResponse.getResponse().getSchema().getName());
		newElementReference.setPath(newResponse.getPath());
		
		ElementDefinition oldDefinition = diffFactoryI.createElementDefinition();			
		String schemaName = "";		
		if (oldResponse.getResponse().getSchema() != null)
			schemaName = oldResponse.getResponse().getSchema().getName();
		oldDefinition.setSchemaName(schemaName);
		
		ElementDefinition newDefinition = diffFactoryI.createElementDefinition();
		schemaName = "";		
		if (newResponse.getResponse().getSchema() != null)
			schemaName = newResponse.getResponse().getSchema().getName();
		newDefinition.setSchemaName(schemaName);
		
		ReturnType returnType = diffFactoryI.createReturnType();
		returnType.setOld(oldElementReference);
		returnType.setNew(newElementReference);
		returnType.setChangeElement(APIElementType.RETURN_TYPE);
		returnType.setOldDefinition(oldDefinition);
		returnType.setNewDefinition(newDefinition);
								
		changes.add(returnType);
	}
	
	public void createUnsupportRequestMethodInstance(ChangeOperation operation, List<Change> changes){
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(operation.getOldOperationUri());
		oldElementReference.setValue(operation.getOldOperation().getFullPath());		
		oldElementReference.setPath(operation.getPath());

		Delete delete = diffFactoryI.createDelete();
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
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(parameter.getOldParameterUri());
		oldElementReference.setValue(parameter.getOldParameter().getName());		
		oldElementReference.setPath(parameter.getPath());
		
		Delete delete = diffFactoryI.createDelete();
		delete.setChangeElement(APIElementType.METHOD_PARAMETER);
		delete.setOld(oldElementReference);
		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(parameter.getNewParameterUri());
		newElementReference.setValue(parameter.getNewParameter().getName());		
		newElementReference.setPath(parameter.getPath());
		
		Add add = diffFactoryI.createAdd();	
		add.setChangeElement(APIElementType.METHOD_PARAMETER);
		add.setNew(newElementReference);		
				
		ParameterLocation oldLocationP = ParameterLocation.getByName(parameter.getOldParameter().getLocation().getName().toLowerCase());
		ParameterLocation newLocationP = ParameterLocation.getByName(parameter.getNewParameter().getLocation().getName().toLowerCase());
		
		SameParameter relocate = diffFactoryI.createSameParameter();
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
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newParameter.getNewParameterUri());
		newElementReference.setValue(newParameter.getNewParameter().getName());		
		newElementReference.setPath(newParameter.getPath());
		
		Add add = diffFactoryI.createAdd();	
		add.setChangeElement(APIElementType.METHOD_PARAMETER);
		add.setNew(newElementReference);		
				
		ParameterLocation oldLocationP = ParameterLocation.getByName(oldParameters.get(0).getNewParameter().getLocation().getName().toLowerCase());
		ParameterLocation newLocationP = ParameterLocation.getByName(newParameter.getNewParameter().getLocation().getName().toLowerCase());
		
		MultipleParametersInOne relocate = diffFactoryI.createMultipleParametersInOne();
		relocate.setChangeElement(APIElementType.METHOD_PARAMETER);
		relocate.setNewLocation(newLocationP);
		relocate.setOldLocation(oldLocationP);		
		relocate.getSimpleDiffs().add(add);		
		
		for (ChangeParameter p : oldParameters){
			ElementReference oldElementReference = diffFactoryI.createElementReference();
			oldElementReference.setEObject(p.getNewParameterUri());
			oldElementReference.setValue(p.getNewParameter().getName());		
			oldElementReference.setPath(p.getPath());
			
			Delete delete = diffFactoryI.createDelete();
			delete.setChangeElement(APIElementType.METHOD_PARAMETER);
			delete.setOld(oldElementReference);
			
			relocate.getSimpleDiffs().add(delete);
			
			changes.add(delete);
		}
		changes.add(add);
		changes.add(relocate);        
	}
	
	public void createChangeDefaultValueOfParameterInstance(ChangeParameter parameter, List<Change> changes){
		ElementReference oldElementReference = diffFactoryI.createElementReference();				
		oldElementReference.setEObject(parameter.getOldParameterUri());
		oldElementReference.setValue(parameter.getOldParameter().getDefault());
		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(parameter.getNewParameterUri());
		newElementReference.setValue(parameter.getNewParameter().getDefault());

		DefaultValue defaultValue = diffFactoryI.createDefaultValue();		
		defaultValue.setChangeElement(APIElementType.METHOD_PARAMETER);
		defaultValue.setOld(oldElementReference);
		defaultValue.setNew(newElementReference);
								
		changes.add(defaultValue);
	}
	
	public void saveInstance() {
		try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public void createDeleteStatusCode(ChangeResponse delRes, List<Change> changes) {
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(delRes.getUri());
		oldElementReference.setValue(delRes.getResponse().getCode());
		oldElementReference.setPath(delRes.getPath());
		
		RemoveStatusCode delete = diffFactoryI.createRemoveStatusCode();
		delete.setChangeElement(APIElementType.STATUS_CODE);
		delete.setOld(oldElementReference);
		
		changes.add(delete);
		
	}

	public void createAddedStatusCode(ChangeResponse addRes, List<Change> changes) {
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(addRes.getUri());
		newElementReference.setValue(addRes.getResponse().getCode());
		newElementReference.setPath(addRes.getPath());
		
		AddStatusCode add = diffFactoryI.createAddStatusCode();
		add.setChangeElement(APIElementType.STATUS_CODE);
		add.setNew(newElementReference);
		
		changes.add(add);
	}

	public void createLowerBoundary(ChangeBoundaryParameter boundaryUpdated, List<Change> changes) {
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(boundaryUpdated.getNewUri());
		newElementReference.setValue(boundaryUpdated.getNewParam().getMinimum().toString());
		
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(boundaryUpdated.getOldUri());
		oldElementReference.setValue(boundaryUpdated.getOldParam().getMinimum().toString());
		
		LowerBondary lowerBoundary = diffFactoryI.createLowerBondary();
		lowerBoundary.setChangeElement(APIElementType.METHOD_PARAMETER);
		lowerBoundary.setNew(newElementReference);
		lowerBoundary.setOld(oldElementReference);
		changes.add(lowerBoundary);
	}

	public void createUpperBoundary(ChangeBoundaryParameter boundaryUpdated, List<Change> changes) {
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(boundaryUpdated.getNewUri());
		newElementReference.setValue(boundaryUpdated.getNewParam().getMaximum().toString());
		
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(boundaryUpdated.getOldUri());
		oldElementReference.setValue(boundaryUpdated.getOldParam().getMaximum().toString());
		
		UpperBondary upperBoundary = diffFactoryI.createUpperBondary();
		upperBoundary.setChangeElement(APIElementType.METHOD_PARAMETER);
		upperBoundary.setNew(newElementReference);
		upperBoundary.setOld(oldElementReference);
		changes.add(upperBoundary);
		
	}

	public void createAddedSchemaProperty(ChangeSchema schemaUpdated, List<Change> changes) {
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(schemaUpdated.getUri());
		
		ElementDefinition element = diffFactoryI.createElementDefinition();
		element.setSchemaName(schemaUpdated.getSchema().getName());
		element.setType(getType(schemaUpdated.getSchema().getType()));
		
		ReturnType returnType = diffFactoryI.createReturnType();
		
		returnType.setChangeElement(APIElementType.CLASS);
		returnType.setNewDefinition(element);
		returnType.setNew(newElementReference);
		changes.add(returnType);
	}
	
	public void createDeletedSchemaProperty(ChangeSchema schemaUpdated, List<Change> changes) {
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(schemaUpdated.getUri());
		
		ElementDefinition element = diffFactoryI.createElementDefinition();
		element.setSchemaName(schemaUpdated.getSchema().getName());
		element.setType(getType(schemaUpdated.getSchema().getType()));
		
		ReturnType returnType = diffFactoryI.createReturnType();
		
		returnType.setChangeElement(APIElementType.CLASS);
		returnType.setOldDefinition(element);
		returnType.setOld(oldElementReference);
		changes.add(returnType);
	}

	public void createProduceUpdate(ChangeContentType contentTypeUpdated, EList<Change> changes) {
		
		ElementReference elementReference = diffFactoryI.createElementReference();
		elementReference.setEObject(contentTypeUpdated.getUri());
		elementReference.setPath(contentTypeUpdated.getPath());
		elementReference.setValue(contentTypeUpdated.getValue());
		ProduceType produceType = diffFactoryI.createProduceType();
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
		ElementReference elementReference = diffFactoryI.createElementReference();
		elementReference.setEObject(contentTypeUpdated.getUri());
		elementReference.setPath(contentTypeUpdated.getPath());
		elementReference.setValue(contentTypeUpdated.getValue());
		ConsumeType consumeType = diffFactoryI.createConsumeType();
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
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(path.getOldPathUri());
		oldElementReference.setValue(path.getOldPath().getRelativePath());		
		oldElementReference.setPath(path.getPath());

		Delete delete = diffFactoryI.createDelete();
		delete.setChangeElement(APIElementType.INTERFACE);
		delete.setOld(oldElementReference);
						
		changes.add(delete);      
	}

	public void createModifyParameterSchemaTypeInstance(ChangeParameter parameter, List<Change> changes){
		ElementReference oldElementReference = diffFactoryI.createElementReference();				
		oldElementReference.setEObject(parameter.getOldParameterUri());
		oldElementReference.setValue(parameter.getOldParameter().getSchema().getName());
		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(parameter.getNewParameterUri());
		newElementReference.setValue(parameter.getNewParameter().getSchema().getName());

		DefaultValue defaultValue = diffFactoryI.createDefaultValue();		
		defaultValue.setChangeElement(APIElementType.METHOD_PARAMETER);
		defaultValue.setOld(oldElementReference);
		defaultValue.setNew(newElementReference);
								
		changes.add(defaultValue);
	}
	
	public void createRemoveRestrictedAccessToTheAPIInstance(ChangeResponse addRes, List<Change> changes) {
		
	}
	
	public void createAddRestriction(ChangeResponse changeResponse, EList<Change> changes) {
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(changeResponse.getUri());
		newElementReference.setValue(changeResponse.getResponse().getCode());
		newElementReference.setPath(changeResponse.getPath());
		
		Add add = diffFactoryI.createAdd();
		add.setChangeElement(APIElementType.RETURN_TYPE);
		add.setNew(newElementReference);
		
		AddRestriction addRestriction = diffFactoryI.createAddRestriction();
		addRestriction.setChangeElement(APIElementType.RETURN_TYPE);
		addRestriction.getSimpleDiffs().add(add);
		
		changes.add(add);
		changes.add(addRestriction);
	}
	
	/******************************************* P R I V A T E      M E T H O D S ***********************************/
	
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
