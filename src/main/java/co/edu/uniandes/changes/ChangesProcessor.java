package co.edu.uniandes.changes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import co.edu.uniandes.diff.DiffMetamodel;
import co.edu.uniandes.diff.metamodel.diff.Change;
import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.impl.OperationImpl;
import edu.uoc.som.openapi.impl.ParameterImpl;
import edu.uoc.som.openapi.impl.PathImpl;
import edu.uoc.som.openapi.impl.ResponseImpl;

public class ChangesProcessor {

	/************************************ PROCESS METHODS ************************************************************/
	
	public static void processRelocateParameter(DiffMetamodel diffMetamodel, List<ChangeParameter> deleteParameters,
			List<ChangeParameter> addParameters, List<Change> changes) {
		System.out.println("-------------------- processRelocateParameter");
		for (ChangeParameter dp : deleteParameters){
			for (ChangeParameter ap : addParameters){
				if (dp.getPath().equals(ap.getPath()) && dp.getNewParameter().getName().equals(ap.getNewParameter().getName())){
					if (!dp.getNewParameter().getLocation().equals(ap.getNewParameter().getLocation())){
						System.out.println(dp.getPath() + "  p:" + dp.getNewParameter().getName() + " 1:" + dp.getNewParameter().getLocation());
						System.out.println(ap.getPath() + "  p:" + ap.getNewParameter().getName() + " 2:" + ap.getNewParameter().getLocation());
						System.out.println("\n ");
						
						diffMetamodel.createRelocateParameterInstance(dp, ap, changes);
					}
				}
			}
		}
	}
	
	public static void processChangeTypeParameter(DiffMetamodel diffMetamodel, List<ChangeParameter> deleteParameters,
			List<ChangeParameter> addParameters, List<Change> changes) {
		System.out.println("-------------------- processChangeTypeParameter");
		for (ChangeParameter dp : deleteParameters){
			for (ChangeParameter ap : addParameters){
				if (dp.getPath().equals(ap.getPath()) && dp.getNewParameter().getName().equals(ap.getNewParameter().getName())){
					if (!dp.getNewParameter().getType().getName().equals(ap.getNewParameter().getType().getName())){
						System.out.println(dp.getPath() + "  p:" + dp.getNewParameter().getName() + " 1:" + dp.getNewParameter().getType());
						System.out.println(ap.getPath() + "  p:" + ap.getNewParameter().getName() + " 2:" + ap.getNewParameter().getType());
						System.out.println("\n ");
						
						diffMetamodel.createChangeTypeOfParameterInstance(dp, ap, changes);
					}
				}
			}
		}
	}
	
	public static void processIncreaseNumberOfParameters(DiffMetamodel diffMetamodel, Map<String, List<ChangeParameter>> operations, String oldVersion, List<Change> changes) {
		System.out.println("-------------------- processIncreaseNumberOfParameters");
		int countAdded = 0;
		for (Map.Entry<String, List<ChangeParameter>> entry : operations.entrySet())
		{		    		    		    
		    for (ChangeParameter p : entry.getValue()){
		    	if (p.getDifferenceKind() == DifferenceKind.ADD){
		    		countAdded = 0;
		    		for (ChangeParameter p2 : entry.getValue()){
		    			if (p.getNewParameter().getName().equals(p2.getNewParameter().getName()) &&
		    				p.getNewParameter().getLocation() == p2.getNewParameter().getLocation())
		    				countAdded++;
		    		}
		    		
		    		if (countAdded == 1){
		    			diffMetamodel.createIncreaseNumberOfParametersInstance(oldVersion, p, changes);
		    			System.out.println(entry.getKey() + " " + p.getNewParameter().getName() + " Added");
		    		}
		    	}
		    }
		}				
	}

	public static void processDecreaseNumberOfParameters(DiffMetamodel diffMetamodel, Map<String, List<ChangeParameter>> operations, String oldVersion, List<Change> changes) {
		System.out.println("-------------------- processDecreaseNumberOfParameters");
		int countDeleted = 0;
		for (Map.Entry<String, List<ChangeParameter>> entry : operations.entrySet())
		{		    		    		    
		    for (ChangeParameter p : entry.getValue()){
		    	if (p.getDifferenceKind() == DifferenceKind.DELETE){
		    		countDeleted = 0;
		    		for (ChangeParameter p2 : entry.getValue()){
		    			if (p.getNewParameter().getName().equals(p2.getNewParameter().getName()) &&
		    				p.getNewParameter().getLocation() == p2.getNewParameter().getLocation())
		    				countDeleted++;
		    		}
		    		
		    		if (countDeleted == 1){
		    			diffMetamodel.createDecreaseNumberOfParametersInstance(oldVersion, p, changes);
		    			System.out.println(entry.getKey() + " " + p.getNewParameter().getName() + " Deleted");
		    		}
		    	}
		    }
		}				
	}
	
	public static void processRenameParameter(DiffMetamodel diffMetamodel, List<ChangeParameter> changeParameters, List<Change> changes) {
		System.out.println("-------------------- processRenameParameter");		
		for (ChangeParameter p : changeParameters){
			if (p.getOldParameter() != null &&
				p.getNewParameter() != null &&
				!p.getNewParameter().getName().equals(p.getOldParameter().getName())){
				
				System.out.println(p.getPath() + "  p:" + p.getOldParameter().getName() + " 1:" + p.getOldParameter().getLocation());
				System.out.println(p.getPath() + "  p:" + p.getNewParameter().getName() + " 2:" + p.getNewParameter().getLocation());
				System.out.println("\n ");
				
				diffMetamodel.createRenameParameterInstance(p, changes);
			}
		}			
	}
	
	public static void processChangeTypeOfReturnValue(DiffMetamodel diffMetamodel, List<ChangeResponse> deleteResponse,
			List<ChangeResponse> addResponse, List<Change> changes) {
		System.out.println("-------------------- processChangeTypeOfReturnValue");
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
							(drschemaName != null && arschemaName != null && !drschemaName.equals(arschemaName))){
						
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
	
	public static co.edu.uniandes.diff.metamodel.diff.Diff processVersion(DiffMetamodel diffMetamodel, String newVersion, String oldVersion) {
		return diffMetamodel.createDiff(oldVersion, newVersion);
	}
	
	public static void processDeletedResponses(DiffMetamodel diffMetamodel, List<ChangeResponse> deleteResponse,List<Change> changes) {
		for(ChangeResponse delRes: deleteResponse) {
			diffMetamodel.createDeleteStatusCode(delRes, changes);
		}
	}
	
	public static void processAddedResponses(DiffMetamodel diffMetamodel, List<ChangeResponse> addResponse, List<Change> changes) {
		for(ChangeResponse addRes: addResponse) {
			diffMetamodel.createAddedStatusCode(addRes, changes);
		}
	}
	
	public static void processBoundariesParamsUpdated(DiffMetamodel diffMetamodel, List<ChangeBoundaryParameter> changesBoundaryParameters, List<Change> changes) {
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
	
	public static void processSchemasUpdated(DiffMetamodel diffMetamodel, List<ChangeSchema> schemasUpdated, List<Change> changes) {
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
	
	public static void processContentTypesUpdaes(DiffMetamodel diffMetamodel, List<ChangeContentType> contentTypesUpdated, EList<Change> changes) {
		for(ChangeContentType contentTypeUpdated : contentTypesUpdated) {
			if (contentTypeUpdated.getAttr().getName().equals("produces")) {
				diffMetamodel.createReturnTypeUpdate(contentTypeUpdated, changes);
			}else if (contentTypeUpdated.getAttr().getName().equals("consumes")) {
				diffMetamodel.createConsumeTypeUpdate(contentTypeUpdated, changes);
			}
		}		
	}
	
	public static void processDeleteMethods(DiffMetamodel diffMetamodel, List<ChangeOperation> deleteOperations, List<Change> changes) {
		System.out.println("-------------------- processDeleteMethods");
		for (ChangeOperation co : deleteOperations){						
			System.out.println(co.getPath() + "  v2:" + co.getOldOperation().getDescription() + " deleted");			
			System.out.println("\n ");
						
			diffMetamodel.createDeleteMethodInstance(co, changes);			
		}
	}

	/************************************ GET METHODS ************************************************************/
	
	public static void getAddedParameters(List<ChangeParameter> addParameters, Map<String, List<ChangeParameter>> operations, Diff diff, String newVersion) {		
		if (((ReferenceChange)diff).getValue() instanceof ParameterImpl && diff.getKind() == DifferenceKind.ADD){
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
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight() instanceof ParameterImpl){						
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
				
				changeParameters.add(param);						
			}			
		}
	}

	public static void getDeletedParameters(List<ChangeParameter> deleteParameters, Map<String, List<ChangeParameter>> operations, Diff diff, String oldVersion) {
		if (((ReferenceChange)diff).getValue() instanceof ParameterImpl && diff.getKind() == DifferenceKind.DELETE){
			ParameterImpl parameter = (ParameterImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getRight().eContainer();
							
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
			
			if (diff.getMatch().getLeft() != null && diff.getMatch().getLeft() instanceof PathImpl){						
				PathImpl newPath = (PathImpl)diff.getMatch().getRight();
				PathImpl oldPath = (PathImpl)diff.getMatch().getLeft();				
				
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
				
				deleteOperations.add(operation);
			}
		}
	}
	
	public static void getChangeBoundaryParameters(List<ChangeBoundaryParameter> changesBoundaryParameters,  Diff diff) {
		EAttributeImpl att = null;
		if (((AttributeChange)diff).getAttribute() instanceof EAttributeImpl && diff.getKind() == DifferenceKind.CHANGE){
			att = (EAttributeImpl)((AttributeChange)diff).getAttribute();
		}
		EObject left = ((AttributeChange)diff).getMatch().getLeft();
		EObject right = ((AttributeChange)diff).getMatch().getRight();
		if (left != null && left instanceof ParameterImpl && right != null && right instanceof ParameterImpl && att != null) {
			ChangeBoundaryParameter changeBoundaryParam = new ChangeBoundaryParameter();
			changeBoundaryParam.setOldParam((ParameterImpl)left);
			changeBoundaryParam.setOldUri(EcoreUtil.getURI((ParameterImpl)left).toString());
			
			changeBoundaryParam.setNewParam((ParameterImpl)right);
			changeBoundaryParam.setNewUri(EcoreUtil.getURI((ParameterImpl)right).toString());
			
			if(att.getName().equals("maximum")) {
				changeBoundaryParam.setBoundary(Boundary.UPPER);
				changesBoundaryParameters.add(changeBoundaryParam);
			}
			else if(att.getName().equals("minimum")) {
				changeBoundaryParam.setBoundary(Boundary.LOWER);
				changesBoundaryParameters.add(changeBoundaryParam);
			}
			
			
		}
		
	}
	
	public static void getAddedResponse(List<ChangeResponse> addResponses, Diff diff, String newVersion) {		
		if (((ReferenceChange)diff).getValue() instanceof ResponseImpl && diff.getKind() == DifferenceKind.ADD){
			ResponseImpl response = (ResponseImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getRight().eContainer();
								
				ChangeResponse param = new ChangeResponse();
				param.setResponse(response);
				param.setVersion(newVersion);
				param.setDifferenceKind(DifferenceKind.ADD);
				param.setPath(path.getRelativePath());				
				param.setUri(EcoreUtil.getURI(response).toString());
				setOperation(path, param);			
				
				addResponses.add(param);
			}
		}
	}	
	
	public static void getDeletedResponse(List<ChangeResponse> deleteResponse, Diff diff, String oldVersion) {
		if (((ReferenceChange)diff).getValue() instanceof ResponseImpl && diff.getKind() == DifferenceKind.DELETE){
			ResponseImpl response = (ResponseImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getRight().eContainer();
							
				ChangeResponse param = new ChangeResponse();
				param.setResponse(response);
				param.setVersion(oldVersion);
				param.setDifferenceKind(DifferenceKind.DELETE);
				param.setPath(path.getRelativePath());				
				param.setUri(EcoreUtil.getURI(response).toString());
				setOperation(path, param);						
				
				deleteResponse.add(param);				
			}
		}
	}
	
	public static void getChangesSchema(List<ChangeSchema> addedSchemas, Diff diff) {
		Schema schemaAdded;
		if ( ((ReferenceChange)diff).getValue() instanceof Schema && (diff.getKind() == DifferenceKind.ADD || diff.getKind() == DifferenceKind.DELETE)){
			schemaAdded = (Schema)(((ReferenceChange)diff).getValue());
	
			EObject left = diff.getMatch().getLeft();
			EObject right = diff.getMatch().getRight();
			
			if(left instanceof Schema && right instanceof Schema  && ((Schema)left).getName().equals(((Schema)right).getName())) {
				ChangeSchema updated = new ChangeSchema();
				
				updated.setSchema(schemaAdded);
				updated.setUri(EcoreUtil.getURI((Schema)right).toString());
				updated.setDifferenceKind(diff.getKind());
				addedSchemas.add(updated);
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
					change.setUri(EcoreUtil.getURI(right).toString());
					change.setKind(diff.getKind());
					change.setValue(((AttributeChange)diff).getValue().toString());
					contentTypesUpdated.add(change);
				 }
					 
			 }
		 }
		}
	}
	/************************************ PRIVATE METHODS ************************************************************/
	
	private static void addOperations(Map<String, List<ChangeParameter>> operations, PathImpl path,
			ChangeParameter param) {
		List<ChangeParameter> params = operations.get(path.getRelativePath());
		if (params == null)
			params = new ArrayList<ChangeParameter>();										
		
		params.add(param);
		operations.put(path.getRelativePath(), params);
	}	
	
	private static void setOperation(PathImpl path, ChangeParameter param) {
		Operation getOperation = path.getGet();
		Operation deleteOperation = path.getDelete();
		Operation pathcOperation = path.getPatch();
		Operation postOperation = path.getPost();
		Operation putOperation = path.getPut();					
		
		if (getOperation != null){							
			param.setOperation(getOperation);											
		}
		else if (deleteOperation != null){							
			param.setOperation(deleteOperation);					
		}
		else if (pathcOperation != null){							
			param.setOperation(pathcOperation);					
		}
		else if (postOperation != null){							
			param.setOperation(postOperation);					
		}
		else if (putOperation != null){							
			param.setOperation(putOperation);					
		}
	}
	
	private static void setOperation(PathImpl path, ChangeResponse param) {
		Operation getOperation = path.getGet();
		Operation deleteOperation = path.getDelete();
		Operation pathcOperation = path.getPatch();
		Operation postOperation = path.getPost();
		Operation putOperation = path.getPut();					
		
		if (getOperation != null){							
			param.setOperation(getOperation);											
		}
		else if (deleteOperation != null){							
			param.setOperation(deleteOperation);					
		}
		else if (pathcOperation != null){							
			param.setOperation(pathcOperation);					
		}
		else if (postOperation != null){							
			param.setOperation(postOperation);					
		}
		else if (putOperation != null){							
			param.setOperation(putOperation);					
		}
	}

}
