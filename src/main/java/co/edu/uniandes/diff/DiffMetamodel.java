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

import co.edu.uniandes.changes.ChangeParameter;
import co.edu.uniandes.changes.ChangeResponse;
import co.edu.uniandes.diff.metamodel.diff.*;
import co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl;

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
		oldElementReference.setEObject(oldParameter.getUri());
		oldElementReference.setValue(oldParameter.getParameter().getName());
		oldElementReference.setPath(oldParameter.getPath());
		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newParameter.getUri());
		newElementReference.setValue(newParameter.getParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		ElementDefinition oldDefinition = diffFactoryI.createElementDefinition();
		oldDefinition.setType(ElementType.getByName(oldParameter.getParameter().getType().getName().toLowerCase()));		
		if (oldParameter.getParameter().getSchema() != null)
			oldDefinition.setSchemaName(oldParameter.getParameter().getSchema().getName());
		
		ElementDefinition newDefinition = diffFactoryI.createElementDefinition();
		newDefinition.setType(ElementType.getByName(newParameter.getParameter().getType().getName().toLowerCase()));
		if (newParameter.getParameter().getSchema() != null)
			newDefinition.setSchemaName(newParameter.getParameter().getSchema().getName());
		
		ParameterType parameterType = diffFactoryI.createParameterType();
		parameterType.setOld(oldElementReference);
		parameterType.setNew(newElementReference);
		parameterType.setChangeElement(APIElementType.METHOD_PARAMETER);
		parameterType.setOldDefinition(oldDefinition);
		parameterType.setNewDefinition(newDefinition);
								
		changes.add(parameterType);
	}	
	
	public void createRenameParameterInstance(String oldVersion, String newVersion){		       
	}	
	
	public void createIncreaseNumberOfParametersInstance(String oldVersion, ChangeParameter newParameter, List<Change> changes){		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newParameter.getUri());
		newElementReference.setValue(newParameter.getParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		Add add = diffFactoryI.createAdd();
		add.setChangeElement(APIElementType.METHOD_PARAMETER);
		add.setNew(newElementReference);
								
		changes.add(add);
	}
	
	public void createDecreaseNumberOfParametersInstance(String oldVersion, ChangeParameter newParameter,List<Change> changes){		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newParameter.getUri());
		newElementReference.setValue(newParameter.getParameter().getName());
		newElementReference.setPath(newParameter.getPath());
		
		Delete delete = diffFactoryI.createDelete();
		delete.setChangeElement(APIElementType.METHOD_PARAMETER);
		delete.setNew(newElementReference);
				
		changes.add(delete);
		
	}
	
	public void createChangeFormatOfReturnValueInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createExposeDataInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
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
	
	public void createDeleteMethodInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createRenameMethodInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createCombineMethodsInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createSplitMethodInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createRelocateParameterInstance(ChangeParameter oldParameter, ChangeParameter newParameter, List<Change> changes){		
		ElementReference oldElementReference = diffFactoryI.createElementReference();
		oldElementReference.setEObject(oldParameter.getUri());
		oldElementReference.setValue(oldParameter.getParameter().getName());
		oldElementReference.setPath(oldParameter.getPath());
		Delete delete = diffFactoryI.createDelete();
		delete.setChangeElement(APIElementType.METHOD_PARAMETER);
		delete.setOld(oldElementReference);
		
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(newParameter.getUri());
		newElementReference.setValue(newParameter.getParameter().getName());	
		newElementReference.setPath(newParameter.getPath());
		Add add = diffFactoryI.createAdd();	
		add.setChangeElement(APIElementType.METHOD_PARAMETER);
		add.setNew(newElementReference);		
				
		ParameterLocation oldLocationP = ParameterLocation.getByName(oldParameter.getParameter().getLocation().getName().toLowerCase());
		ParameterLocation newLocationP = ParameterLocation.getByName(newParameter.getParameter().getLocation().getName().toLowerCase());
		
		RelocateParameter relocate = diffFactoryI.createRelocateParameter();
		relocate.setChangeElement(APIElementType.METHOD_PARAMETER);
		relocate.setNewLocation(newLocationP);
		relocate.setOldLocation(oldLocationP);
		relocate.getSimpleDiffs().add(delete);
		relocate.getSimpleDiffs().add(add);		
						
		changes.add(relocate);        
	}
	
	public void createChangeDefaultValueOfParameterInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createChangeUpperBoundOfParameterInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createRestricAccessToAPIInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
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
		
		Delete delete = diffFactoryI.createDelete();
		delete.setChangeElement(APIElementType.RETURN_TYPE);
		delete.setOld(oldElementReference);
		
		changes.add(delete);
		
	}

	public void createAddedStatusCode(ChangeResponse addRes, List<Change> changes) {
		ElementReference newElementReference = diffFactoryI.createElementReference();
		newElementReference.setEObject(addRes.getUri());
		newElementReference.setValue(addRes.getResponse().getCode());
		newElementReference.setPath(addRes.getPath());
		
		Add add = diffFactoryI.createAdd();
		add.setChangeElement(APIElementType.RETURN_TYPE);
		add.setNew(newElementReference);
		
		changes.add(add);
	}
	
	/******************************************* P R I V A T E      M E T H O D S ***********************************/
}
