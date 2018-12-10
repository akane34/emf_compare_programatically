package co.edu.uniandes.transformations.m2m;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.metamodels.Diff.Add;
import co.edu.uniandes.metamodels.Diff.AddParameter;
import co.edu.uniandes.metamodels.Diff.AddRestriction;
import co.edu.uniandes.metamodels.Diff.AddStatusCode;
import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.metamodels.Diff.ConsumeType;
import co.edu.uniandes.metamodels.Diff.DefaultValue;
import co.edu.uniandes.metamodels.Diff.Delete;
import co.edu.uniandes.metamodels.Diff.DeletePath;
import co.edu.uniandes.metamodels.Diff.ExposeData;
import co.edu.uniandes.metamodels.Diff.LowerBondary;
import co.edu.uniandes.metamodels.Diff.ModifyParameterSchemaType;
import co.edu.uniandes.metamodels.Diff.MultipleParametersInOne;
import co.edu.uniandes.metamodels.Diff.ParameterType;
import co.edu.uniandes.metamodels.Diff.ProduceType;
import co.edu.uniandes.metamodels.Diff.RemoveParameter;
import co.edu.uniandes.metamodels.Diff.RemoveRestriction;
import co.edu.uniandes.metamodels.Diff.RemoveStatusCode;
import co.edu.uniandes.metamodels.Diff.RenameParameter;
import co.edu.uniandes.metamodels.Diff.ReturnType;
import co.edu.uniandes.metamodels.Diff.SameParameter;
import co.edu.uniandes.metamodels.Diff.Simple;
import co.edu.uniandes.metamodels.Diff.UnsupportRequestMethod;
import co.edu.uniandes.metamodels.Diff.UpperBondary;
import co.edu.uniandes.metamodels.Diff.impl.DiffImpl;
import co.edu.uniandes.metamodels.Html.BODY;
import co.edu.uniandes.metamodels.Html.HTML;
import co.edu.uniandes.metamodels.Html.HtmlFactory;
import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.TABLE;
import co.edu.uniandes.metamodels.Html.TD;
import co.edu.uniandes.metamodels.Html.TR;
import co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl;
import edu.uoc.som.openapi.Parameter;

public class HtmlToModelTransformation {
	
	private HtmlPackage htmlPackage;	
	private HtmlFactory htmlFactory;
	private Resource xmiResource;
	private ResourceSet resourceSet;
	
	public HtmlToModelTransformation(String outputFilePath){		
		htmlPackage = HtmlPackage.eINSTANCE;		
		EPackage.Registry.INSTANCE.put(htmlPackage.getNsURI(), htmlPackage);		
		
		HtmlPackage.eINSTANCE.eClass();
		HtmlPackageImpl.init();
		htmlFactory = HtmlFactory.eINSTANCE;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        
        resourceSet = new ResourceSetImpl();
        xmiResource = resourceSet.createResource(URI.createFileURI(outputFilePath));        
	}	
	
	public ResourceSet transformation(ResourceSet outputModel, ResourceSet minorVersionModel, ResourceSet mayorVersionModel) {		
		BODY body = htmlFactory.createBODY();		
		
		DiffImpl diffRoot = getDiffRoot(outputModel);
		if (diffRoot != null){
			TABLE tableChangeTypeParameter = htmlFactory.createTABLE();			
			tableChangeTypeParameter.setId(UUID.randomUUID().toString());
			
			TABLE tableMultipleParametersInOne = htmlFactory.createTABLE();			
			tableMultipleParametersInOne.setId(UUID.randomUUID().toString());
			
			TABLE tableSameParameter = htmlFactory.createTABLE();
			tableSameParameter.setId(UUID.randomUUID().toString());
			
			TABLE tableAddParameter = htmlFactory.createTABLE();
			tableAddParameter.setId(UUID.randomUUID().toString());
			
			TABLE tableUnsupportRequestMethod = htmlFactory.createTABLE();
			tableUnsupportRequestMethod.setId(UUID.randomUUID().toString());
			
			TABLE tableDeletePath = htmlFactory.createTABLE();
			tableDeletePath.setId(UUID.randomUUID().toString());
			
			TABLE tableRemoveParameter = htmlFactory.createTABLE();
			tableRemoveParameter.setId(UUID.randomUUID().toString());
			
			TABLE tableModifyParameterSchemaType = htmlFactory.createTABLE();
			tableModifyParameterSchemaType.setId(UUID.randomUUID().toString());
			
			TABLE tableUpperBondary = htmlFactory.createTABLE();
			tableUpperBondary.setId(UUID.randomUUID().toString());
			
			TABLE tableLowerBondary = htmlFactory.createTABLE();
			tableLowerBondary.setId(UUID.randomUUID().toString());
			
			TABLE tableDefaultValue = htmlFactory.createTABLE();
			tableDefaultValue.setId(UUID.randomUUID().toString());
			
			TABLE tableRenameParameter = htmlFactory.createTABLE();
			tableRenameParameter.setId(UUID.randomUUID().toString());
 			
			TABLE tableConsumeType = htmlFactory.createTABLE();
			tableConsumeType.setId(UUID.randomUUID().toString());
			
			TABLE tableProduceType = htmlFactory.createTABLE();
			tableProduceType.setId(UUID.randomUUID().toString());
			
			TABLE tableAddStatusCode = htmlFactory.createTABLE();
			tableAddStatusCode.setId(UUID.randomUUID().toString());
			
			TABLE tableRemoveStatusCode = htmlFactory.createTABLE();
			tableRemoveStatusCode.setId(UUID.randomUUID().toString());
			
			TABLE tableExposeData = htmlFactory.createTABLE();
			tableExposeData.setId(UUID.randomUUID().toString());
			
			TABLE tableRemoveRestriction = htmlFactory.createTABLE();
			tableRemoveRestriction.setId(UUID.randomUUID().toString());
			
			TABLE tableAddRestriction = htmlFactory.createTABLE();
			tableAddRestriction.setId(UUID.randomUUID().toString());			
			
			TABLE tableReturnType = htmlFactory.createTABLE();
			tableReturnType.setId(UUID.randomUUID().toString());			
			
			EList<Change> changes =	diffRoot.getChange();			
			for (Change change : changes){				
				if (change instanceof ParameterType){
					createChangeTypeParameter(mayorVersionModel, tableChangeTypeParameter, change);
				}
				else if (change instanceof MultipleParametersInOne){
					createMultipleParameterInOne(tableMultipleParametersInOne, change);
				}
				else if (change instanceof SameParameter){
					createSameParameter(tableSameParameter, change);
				}
				else if (change instanceof AddParameter){
					createAddParameter(tableAddParameter, change);
				}
				else if (change instanceof UnsupportRequestMethod){
					createUnsupportRequestMethod(tableUnsupportRequestMethod, change);
				}
				else if (change instanceof DeletePath){
					createDeletePath(tableDeletePath, change);
				}				
				else if (change instanceof RemoveParameter){
					createRemoveParameter(tableRemoveParameter, change);
				}
				else if (change instanceof ModifyParameterSchemaType){
					createModifyParameterSchemaType(tableModifyParameterSchemaType, change);
				}
				else if (change instanceof UpperBondary){
					createUpperBondary(mayorVersionModel, tableUpperBondary, change);
				}
				else if (change instanceof LowerBondary){
					createLowerBondary(mayorVersionModel, tableLowerBondary, change);
				}
				else if (change instanceof DefaultValue){
					createDefaultValue(mayorVersionModel, tableDefaultValue, change);
				}
				else if (change instanceof RenameParameter){
					createRenameParameter(tableRenameParameter, change);
				}
				else if (change instanceof ConsumeType){
					createConsumeType(tableConsumeType, change);
				}
				else if (change instanceof ProduceType){
					createProduceType(tableProduceType, change);
				}
				else if (change instanceof AddStatusCode){
					createAddStatusCode(tableAddStatusCode, change);
				}
				else if (change instanceof RemoveStatusCode){
					createRemoveStatusCode(tableRemoveStatusCode, change);
				}
				else if (change instanceof ExposeData){
					createExposeData(tableExposeData, change);
				}
				else if (change instanceof RemoveRestriction){
					createRemoveRestriction(tableRemoveRestriction, change);
				}
				else if (change instanceof AddRestriction){
					createAddRestriction(tableAddRestriction, change);
				}				
				else if (change instanceof ReturnType){
					createReturnType(tableReturnType, change);
				}
			}
			
			tableChangeTypeParameter.setTitle("Change Type of Parameter - " + tableChangeTypeParameter.getTrs().size());
			tableMultipleParametersInOne.setTitle("Relocate Multiple Parameters In One - " + tableMultipleParametersInOne.getTrs().size());			
			tableSameParameter.setTitle("Relocate Same Parameter - " + tableSameParameter.getTrs().size());			
			tableAddParameter.setTitle("Increase Number of Parameters - " + tableAddParameter.getTrs().size());			
			tableUnsupportRequestMethod.setTitle("Unsupport Request Method - " + tableUnsupportRequestMethod.getTrs().size());			
			tableDeletePath.setTitle("Delete Path - " + tableDeletePath.getTrs().size());			
			tableRemoveParameter.setTitle("Decrease Number of Parameters - " + tableRemoveParameter.getTrs().size());			
			tableModifyParameterSchemaType.setTitle("Modify Parameter Schema Type - " + tableModifyParameterSchemaType.getTrs().size());			
			tableUpperBondary.setTitle("Change Upper Bound of Parameter - " + tableUpperBondary.getTrs().size());			
			tableLowerBondary.setTitle("Change lower Bound of Parameter - " + tableLowerBondary.getTrs().size());			
			tableDefaultValue.setTitle("Change Default Value of Parameter - " + tableDefaultValue.getTrs().size());			
			tableRenameParameter.setTitle("Rename Parameter - " + tableRenameParameter.getTrs().size());			
			tableConsumeType.setTitle("Modify Content Type Consume - " + tableConsumeType.getTrs().size());			
			tableProduceType.setTitle("Modify Content Type Produce - " + tableProduceType.getTrs().size());
			tableAddStatusCode.setTitle("Add Status Code - " + tableAddStatusCode.getTrs().size());
			tableRemoveStatusCode.setTitle("Remove Status Code - " + tableRemoveStatusCode.getTrs().size());
			tableExposeData.setTitle("Expose Data - " + tableExposeData.getTrs().size());
			tableRemoveRestriction.setTitle("Remove restricted access to the API  - " + tableRemoveRestriction.getTrs().size());
			tableAddRestriction.setTitle("Add restricted access to the API - " + tableAddRestriction.getTrs().size());
			tableReturnType.setTitle("Change Type of Return Value (class) - " + tableReturnType.getTrs().size());
			
			body.getBodyElements().add(tableRenameParameter);
			body.getBodyElements().add(tableMultipleParametersInOne);			
 			body.getBodyElements().add(tableSameParameter);			
 			body.getBodyElements().add(tableAddParameter);									
 			body.getBodyElements().add(tableUnsupportRequestMethod);			
 			body.getBodyElements().add(tableDeletePath);			
 			body.getBodyElements().add(tableRemoveParameter);			
 			body.getBodyElements().add(tableModifyParameterSchemaType);						
 			body.getBodyElements().add(tableUpperBondary);			
 			body.getBodyElements().add(tableLowerBondary);
 			body.getBodyElements().add(tableDefaultValue);			
 			body.getBodyElements().add(tableRenameParameter);			
 			body.getBodyElements().add(tableConsumeType);			
 			body.getBodyElements().add(tableProduceType);			
 			body.getBodyElements().add(tableAddStatusCode);			
 			body.getBodyElements().add(tableRemoveStatusCode);			
 			body.getBodyElements().add(tableExposeData);			
 			body.getBodyElements().add(tableRemoveRestriction);			
 			body.getBodyElements().add(tableAddRestriction);				
 			body.getBodyElements().add(tableReturnType); 			
 			
 			xmiResource.getContents().add(tableChangeTypeParameter);
 			xmiResource.getContents().add(tableRenameParameter);
 			xmiResource.getContents().add(tableMultipleParametersInOne);
 			xmiResource.getContents().add(tableSameParameter);
 			xmiResource.getContents().add(tableAddParameter);
 			xmiResource.getContents().add(tableUnsupportRequestMethod);
 			xmiResource.getContents().add(tableDeletePath);
 			xmiResource.getContents().add(tableRemoveParameter);
 			xmiResource.getContents().add(tableModifyParameterSchemaType);
 			xmiResource.getContents().add(tableUpperBondary);
 			xmiResource.getContents().add(tableLowerBondary);
 			xmiResource.getContents().add(tableDefaultValue);
 			xmiResource.getContents().add(tableRenameParameter);
 			xmiResource.getContents().add(tableConsumeType);
 			xmiResource.getContents().add(tableProduceType);
 			xmiResource.getContents().add(tableProduceType);
 			xmiResource.getContents().add(tableAddStatusCode);
 			xmiResource.getContents().add(tableRemoveStatusCode);
 			xmiResource.getContents().add(tableExposeData);
 			xmiResource.getContents().add(tableRemoveRestriction);
 			xmiResource.getContents().add(tableAddRestriction);
 			xmiResource.getContents().add(tableReturnType);			
			
			xmiResource.getContents().add(tableRenameParameter);
		}	
		
		HTML html = htmlFactory.createHTML();
		html.setBody(body);		
		
		xmiResource.getContents().add(html);
		xmiResource.getContents().add(body);
		saveInstance();		
		
		return resourceSet;
	}
	
	private void createChangeTypeParameter(ResourceSet mayorVersionModel, TABLE tableChangeTypeParameter, Change change) {
		ParameterType c = (ParameterType)change;
		
		URI uri = URI.createURI(c.getOld().getEObject());
		Parameter parameter = (Parameter)mayorVersionModel.getEObject(uri, true);
		
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Parameter");
		td1.setValue(parameter.getName());
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("Old type");
		td2.setValue(c.getOld().getValue());
		
		TD td3 = htmlFactory.createTD();					
		td3.setTitle("New type");
		td3.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath());
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		tr.getTds().add(td3);
		
		tableChangeTypeParameter.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(td3);					
		xmiResource.getContents().add(tr);
	}
	
	private void createReturnType(TABLE tableReturnType, Change change) {		
		ReturnType c = (ReturnType)change;
		String path = "";
		
		TD td1 = htmlFactory.createTD();
		td1.setTitle("Old");
		if (c.getOld() != null){			
			td1.setValue(c.getOld().getValue());
			path = c.getOld().getPath();
		}else
			td1.setValue("null");
		
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("New");
		if (c.getNew() != null){
			td2.setValue(c.getNew().getValue());
			path = c.getNew().getPath();
		}else
			td2.setValue("null");
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(path);		
		tr.getTds().add(td1);
		tr.getTds().add(td2);		
		
		tableReturnType.getTrs().add(tr);
		
		
		xmiResource.getContents().add(td1);		
		xmiResource.getContents().add(td2);							
		xmiResource.getContents().add(tr);		
	}
	
	private void createAddRestriction(TABLE tableAddRestriction, Change change) {
		StringBuilder value;
		AddRestriction c = (AddRestriction)change;
		
		String path = "";
						
		TD td1 = htmlFactory.createTD();					
		value = new StringBuilder("");
		for (Simple simple : c.getSimpleDiffs()){
			if (simple instanceof Add){
				path = ((Add)simple).getNew().getPath() + ":" + ((Add)simple).getNew().getMethod();;
				value.append(((Add)simple).getNew().getValue());
				value.append(" ");
			}
		}
		td1.setTitle("Add");
		td1.setValue(value.toString());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(path);		
		tr.getTds().add(td1);
		
		tableAddRestriction.getTrs().add(tr);					
				
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(tr);		
	}
	
	private void createRemoveRestriction(TABLE tableRemoveRestriction, Change change) {
		StringBuilder value;
		RemoveRestriction c = (RemoveRestriction)change;
		
		String path = "";
		
		TD td1 = htmlFactory.createTD();					
		value = new StringBuilder("");
		for (Simple simple : c.getSimpleDiffs()){
			if (simple instanceof Delete){
				path = ((Delete)simple).getOld().getPath() + ":" + ((Delete)simple).getOld().getMethod();;
				value.append(((Delete)simple).getOld().getValue());
				value.append(" ");
			}
		}
		td1.setTitle("Remove");
		td1.setValue(value.toString());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(path);
		tr.getTds().add(td1);
		
		tableRemoveRestriction.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(tr);		
	}
	
	private void createExposeData(TABLE tableExposeData, Change change) {
		StringBuilder value;
		ExposeData c = (ExposeData)change;
		
		String path = "";
		
		TD td1 = htmlFactory.createTD();					
		value = new StringBuilder("");
		for (Simple simple : c.getSimpleDiffs()){
			if (simple instanceof Delete){
				path = ((Delete)simple).getOld().getPath();
				value.append(((Delete)simple).getOld().getValue());
				value.append(" ");
			}
		}
		td1.setTitle("Old Response");
		td1.setValue(value.toString());
		
		TD td2 = htmlFactory.createTD();					
		value = new StringBuilder("");
		for (Simple simple : c.getSimpleDiffs()){
			if (simple instanceof Add){
				path = ((Add)simple).getNew().getPath();
				value.append(((Add)simple).getNew().getValue());
				value.append(" ");
			}
		}
		td2.setTitle("New Response");
		td2.setValue(value.toString());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(path);
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		
		tableExposeData.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(tr);		
	}
	
	private void createRemoveStatusCode(TABLE tableRemoveStatusCode, Change change) {
		RemoveStatusCode c = (RemoveStatusCode)change;
				
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Removed");
		td1.setValue(c.getOld().getValue());
						
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getOld().getPath() + ":" + c.getOld().getMethod());
		tr.getTds().add(td1);		
		
		tableRemoveStatusCode.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);									
		xmiResource.getContents().add(tr);
	}
	
	private void createAddStatusCode(TABLE tableAddStatusCode, Change change) {
		AddStatusCode c = (AddStatusCode)change;
				
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Added");
		td1.setValue(c.getNew().getValue());
						
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath() + ":" + c.getNew().getMethod());
		tr.getTds().add(td1);		
		
		tableAddStatusCode.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);									
		xmiResource.getContents().add(tr);
	}
	
	private void createProduceType(TABLE tableProduceType, Change change) {
		ProduceType c = (ProduceType)change;
				
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Old");
		td1.setValue(c.getOld().getValue());
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("New");
		td2.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath());
		tr.getTds().add(td1);
		tr.getTds().add(td2);		
		
		tableProduceType.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);							
		xmiResource.getContents().add(tr);
	}
	
	private void createConsumeType(TABLE tableConsumeType, Change change) {
		ConsumeType c = (ConsumeType)change;		
		
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Old");
		td1.setValue(c.getOld().getValue());
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("New");
		td2.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath());
		tr.getTds().add(td1);
		tr.getTds().add(td2);		
		
		tableConsumeType.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);							
		xmiResource.getContents().add(tr);
	}
	
	private void createSameParameter(TABLE tableSameParameter, Change change) {
		StringBuilder value;
		SameParameter c = (SameParameter)change;
		
		String path = "";
		
		TD td1 = htmlFactory.createTD();					
		value = new StringBuilder("Parameter: ");
		for (Simple simple : c.getSimpleDiffs()){
			if (simple instanceof Delete){
				path = ((Delete)simple).getOld().getPath() + ":" + ((Delete)simple).getOld().getMethod();;
				value.append(((Delete)simple).getOld().getValue());							
			}
		}
		td1.setTitle(value.toString());
		td1.setValue("Old location: " + c.getOldLocation().getName() + "<br>New location: " + c.getNewLocation().getName());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(path);
		tr.getTds().add(td1);					
		
		tableSameParameter.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);					
		xmiResource.getContents().add(tr);		
	}

	private void createDefaultValue(ResourceSet mayorVersionModel, TABLE tableDefaultValue, Change change) {
		DefaultValue c = (DefaultValue)change;
		
		URI uri = URI.createURI(c.getOld().getEObject());
		Parameter parameter = (Parameter)mayorVersionModel.getEObject(uri, true);
		
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Parameter");
		td1.setValue(parameter.getName());
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("Old default value");
		td2.setValue(c.getOld().getValue());
		
		TD td3 = htmlFactory.createTD();					
		td3.setTitle("New default value");
		td3.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath());
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		tr.getTds().add(td3);
		
		tableDefaultValue.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(td3);					
		xmiResource.getContents().add(tr);
	}

	private void createLowerBondary(ResourceSet mayorVersionModel, TABLE tableLowerBondary, Change change) {
		LowerBondary c = (LowerBondary)change;
		
		URI uri = URI.createURI(c.getOld().getEObject());
		Parameter parameter = (Parameter)mayorVersionModel.getEObject(uri, true);
		
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Parameter");
		td1.setValue(parameter.getName());
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("Old value");
		td2.setValue(c.getOld().getValue());
		
		TD td3 = htmlFactory.createTD();					
		td3.setTitle("New value");
		td3.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath());
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		tr.getTds().add(td3);
		
		tableLowerBondary.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(td3);					
		xmiResource.getContents().add(tr);
	}

	private void createUpperBondary(ResourceSet mayorVersionModel, TABLE tableUpperBondary, Change change) {
		UpperBondary c = (UpperBondary)change;
		
		URI uri = URI.createURI(c.getOld().getEObject());
		Parameter parameter = (Parameter)mayorVersionModel.getEObject(uri, true);
		
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Parameter");
		td1.setValue(parameter.getName());
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("Old value");
		td2.setValue(c.getOld().getValue());
		
		TD td3 = htmlFactory.createTD();					
		td3.setTitle("New value");
		td3.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath());
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		tr.getTds().add(td3);
		
		tableUpperBondary.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(td3);					
		xmiResource.getContents().add(tr);
	}

	private void createModifyParameterSchemaType(TABLE tableModifyParameterSchemaType, Change change) {
		ModifyParameterSchemaType c = (ModifyParameterSchemaType)change;
		
		TD td1 = htmlFactory.createTD();					
		
		td1.setTitle("Parameter");
		td1.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath());
		tr.getTds().add(td1);					
		
		tableModifyParameterSchemaType.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);					
		xmiResource.getContents().add(tr);
	}

	private void createDeletePath(TABLE tableDeletePath, Change change) {
		DeletePath c = (DeletePath)change;
		
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Deleted path");
		td1.setValue(c.getOld().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getOld().getValue());
		tr.getTds().add(td1);					
		
		tableDeletePath.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);					
		xmiResource.getContents().add(tr);
	}

	private void createUnsupportRequestMethod(TABLE tableUnsupportRequestMethod, Change change) {
		UnsupportRequestMethod c = (UnsupportRequestMethod)change;
	
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Method");
		td1.setValue(c.getOld().getMethod());
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("Description");
		td2.setValue(c.getOld().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getOld().getPath());
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		
		tableUnsupportRequestMethod.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(tr);
	}

	private void createAddParameter(TABLE tableAddParameter, Change change) {
		AddParameter c = (AddParameter)change;					
		
		TD td1 = htmlFactory.createTD();										
		td1.setTitle("New parameter");
		td1.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath() + ":" + c.getNew().getMethod());
		tr.getTds().add(td1);
		
		tableAddParameter.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);					
		xmiResource.getContents().add(tr);
	}

	private void createRemoveParameter(TABLE tableRemoveParameter, Change change) {
		RemoveParameter c = (RemoveParameter)change;					
		
		TD td1 = htmlFactory.createTD();										
		td1.setTitle("Old parameter");
		td1.setValue(c.getOld().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getOld().getPath() + ":" + c.getOld().getMethod());
		tr.getTds().add(td1);
		
		tableRemoveParameter.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);					
		xmiResource.getContents().add(tr);
	}

	private void createRenameParameter(TABLE tableRenameParameter, Change change) {
		RenameParameter c = (RenameParameter)change;
		
		TD td1 = htmlFactory.createTD();
		td1.setTitle("Old parameter");
		td1.setValue(c.getOld().getValue());
		
		TD td2 = htmlFactory.createTD();
		td2.setTitle("New parameter");
		td2.setValue(c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();
		tr.setTitle(c.getNew().getPath() + ":" + c.getNew().getMethod());
		tr.getTds().add(td1);
		tr.getTds().add(td2);
							
		tableRenameParameter.getTrs().add(tr);	
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(tr);
	}

	private void createMultipleParameterInOne(TABLE tableMultipleParametersInOne, Change change) {
		StringBuilder value;
		MultipleParametersInOne c = (MultipleParametersInOne)change;
		
		String path = "";
		
		TD td1 = htmlFactory.createTD();
		td1.setTitle("Old location: " + c.getOldLocation().getName());
		value = new StringBuilder("Parameters: ");
		for (Simple simple : c.getSimpleDiffs()){
			if (simple instanceof Delete){
				path = ((Delete)simple).getOld().getPath() + ":" + ((Delete)simple).getOld().getMethod();
				value.append(((Delete)simple).getOld().getValue());
				value.append(" ");
			}
		}
		td1.setValue(value.toString());
		
		TD td2 = htmlFactory.createTD();
		td2.setTitle("New location: " + c.getNewLocation().getName());
		value = new StringBuilder("Parameter: ");
		for (Simple simple : c.getSimpleDiffs()){
			if (simple instanceof Add){
				path = ((Add)simple).getNew().getPath() + ":" + ((Add)simple).getNew().getMethod();
				value.append(((Add)simple).getNew().getValue());
				value.append(" ");
			}
		}
		td2.setValue(value.toString());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(path);
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		
		tableMultipleParametersInOne.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(tr);
	}

	private DiffImpl getDiffRoot(ResourceSet outputModel) {
		DiffImpl diffRoot = null;
		EList<Resource> resources = outputModel.getResources();
		if (resources != null && resources.size() > 0){
			EList<EObject> contents = resources.get(0).getContents();
			if (contents != null && contents.size() > 0){
				if (contents.get(0) instanceof DiffImpl){
					diffRoot = (DiffImpl) contents.get(0);
				}
			}			
		}
		
		return diffRoot;
	}	
	
	private void saveInstance() {
		try {
            xmiResource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
