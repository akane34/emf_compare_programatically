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
import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.metamodels.Diff.Delete;
import co.edu.uniandes.metamodels.Diff.DeletePath;
import co.edu.uniandes.metamodels.Diff.DiffFactory;
import co.edu.uniandes.metamodels.Diff.DiffPackage;
import co.edu.uniandes.metamodels.Diff.MultipleParametersInOne;
import co.edu.uniandes.metamodels.Diff.RemoveParameter;
import co.edu.uniandes.metamodels.Diff.RenameParameter;
import co.edu.uniandes.metamodels.Diff.SameParameter;
import co.edu.uniandes.metamodels.Diff.Simple;
import co.edu.uniandes.metamodels.Diff.UnsupportRequestMethod;
import co.edu.uniandes.metamodels.Diff.impl.DiffImpl;
import co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl;
import co.edu.uniandes.metamodels.Html.BODY;
import co.edu.uniandes.metamodels.Html.HTML;
import co.edu.uniandes.metamodels.Html.HtmlFactory;
import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.TABLE;
import co.edu.uniandes.metamodels.Html.TD;
import co.edu.uniandes.metamodels.Html.TR;
import co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl;

public class HtmlModelTransformation {
	
	private DiffPackage diffPackage;	
	private DiffFactory diffFactory;
	private HtmlPackage htmlPackage;	
	private HtmlFactory htmlFactory;
	private Resource xmiResource;
	private ResourceSet resourceSet;
	
	public HtmlModelTransformation(String outputFilePath){
		diffPackage = DiffPackage.eINSTANCE;		
		EPackage.Registry.INSTANCE.put(diffPackage.getNsURI(), diffPackage);		
		
		DiffPackage.eINSTANCE.eClass();
		DiffPackageImpl.init();
		diffFactory = DiffFactory.eINSTANCE;
		
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
			StringBuilder value = new StringBuilder();
			for (Change change : changes){				
				if (change instanceof MultipleParametersInOne){
					createMultipleParameterInOne(tableMultipleParametersInOne, change);
				}
				if (change instanceof SameParameter){
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
				if (change instanceof AddParameter){
					createAddParameter(tableAddParameter, value, change);
				}
				if (change instanceof UnsupportRequestMethod){
					createUnsupportRequestMethod(tableSameParameter, change);
				}
				if (change instanceof DeletePath){
					DeletePath c = (DeletePath)change;
					
					String path = "";
					
					TD td1 = htmlFactory.createTD();					
					td1.setTitle("Deleted path");
					td1.setValue(c.getOld().getValue());
					
					TR tr = htmlFactory.createTR();					
					tr.setTitle(path);
					tr.getTds().add(td1);					
					
					tableDeletePath.getTrs().add(tr);					
					
					xmiResource.getContents().add(td1);					
					xmiResource.getContents().add(tr);
				}				
				if (change instanceof RemoveParameter){
					createRemoveParameter(tableRemoveParameter, value, change);
				}
				else if (change instanceof RenameParameter){
					createRenameParameter(tableRenameParameter, change);
				}			
			}
			
			tableMultipleParametersInOne.setTitle("Relocate Multiple Parameters In One - " + tableMultipleParametersInOne.getTrs().size());			
			tableSameParameter.setTitle("Relocate Same Parameter - " + tableSameParameter.getTrs().size());			
			tableAddParameter.setTitle("Add Parameter - " + tableAddParameter.getTrs().size());			
			tableUnsupportRequestMethod.setTitle("Unsupport Request Method - " + tableUnsupportRequestMethod.getTrs().size());			
			tableDeletePath.setTitle("Delete Path - " + tableDeletePath.getTrs().size());			
			tableRemoveParameter.setTitle("Remove Parameter - " + tableRemoveParameter.getTrs().size());			
			tableModifyParameterSchemaType.setTitle("Modify Parameter Schema Type - " + tableModifyParameterSchemaType.getTrs().size());			
			tableUpperBondary.setTitle("Upper Bondary - " + tableUpperBondary.getTrs().size());			
			tableLowerBondary.setTitle("Lower Bondary - " + tableLowerBondary.getTrs().size());			
			tableDefaultValue.setTitle("Default Value - " + tableDefaultValue.getTrs().size());			
			tableRenameParameter.setTitle("Rename Parameter - " + tableRenameParameter.getTrs().size());			
			tableConsumeType.setTitle("Consume Type - " + tableConsumeType.getTrs().size());			
			tableProduceType.setTitle("Produce Type - " + tableProduceType.getTrs().size());
			tableAddStatusCode.setTitle("Add Status Code - " + tableAddStatusCode.getTrs().size());
			tableRemoveStatusCode.setTitle("Remove Status Code - " + tableRemoveStatusCode.getTrs().size());
			tableExposeData.setTitle("Expose Data - " + tableExposeData.getTrs().size());
			tableRemoveRestriction.setTitle("Remove Restriction - " + tableRemoveRestriction.getTrs().size());
			tableAddRestriction.setTitle("Add Restriction - " + tableAddRestriction.getTrs().size());
			tableReturnType.setTitle("Return Type - " + tableReturnType.getTrs().size());
			
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

	private void createUnsupportRequestMethod(TABLE tableSameParameter, Change change) {
		UnsupportRequestMethod c = (UnsupportRequestMethod)change;
		
		String path = "";
		
		TD td1 = htmlFactory.createTD();					
		td1.setTitle("Method");
		td1.setValue(c.getOld().getMethod());
		
		TD td2 = htmlFactory.createTD();					
		td2.setTitle("Description");
		td2.setValue(c.getOld().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(path);
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		
		tableSameParameter.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);
		xmiResource.getContents().add(td2);
		xmiResource.getContents().add(tr);
	}

	private void createAddParameter(TABLE tableAddParameter, StringBuilder value, Change change) {
		AddParameter c = (AddParameter)change;					
		
		TD td1 = htmlFactory.createTD();										
		td1.setTitle(value.toString());
		td1.setValue("New parameter: " + c.getNew().getValue());
		
		TR tr = htmlFactory.createTR();					
		tr.setTitle(c.getNew().getPath() + ":" + c.getNew().getMethod());
		tr.getTds().add(td1);
		
		tableAddParameter.getTrs().add(tr);					
		
		xmiResource.getContents().add(td1);					
		xmiResource.getContents().add(tr);
	}

	private void createRemoveParameter(TABLE tableRemoveParameter, StringBuilder value, Change change) {
		RemoveParameter c = (RemoveParameter)change;					
		
		TD td1 = htmlFactory.createTD();										
		td1.setTitle(value.toString());
		td1.setValue("Old parameter: " + c.getOld().getValue());
		
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
