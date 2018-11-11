package co.edu.uniandes.changes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.util.EcoreUtil;

import co.edu.uniandes.diff.DiffMetamodel;
import co.edu.uniandes.diff.metamodel.diff.Change;
import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.impl.ParameterImpl;
import edu.uoc.som.openapi.impl.PathImpl;
import edu.uoc.som.openapi.impl.ResponseImpl;

public class ChangesProcessor {

	/************************************ PROCESS METHODS ************************************************************/
	
	public static void processRelocateParameter(DiffMetamodel diffMetamodel, List<ChangeParameter> deleteParameters,
			List<ChangeParameter> addParameters, List<Change> changes) {		
		for (ChangeParameter dp : deleteParameters){
			for (ChangeParameter ap : addParameters){
				if (dp.getPath().equals(ap.getPath()) && dp.getParameter().getName().equals(ap.getParameter().getName())){
					if (!dp.getParameter().getLocation().equals(ap.getParameter().getLocation())){
						System.out.println(dp.getPath() + "  p:" + dp.getParameter().getName() + " 1:" + dp.getParameter().getLocation());
						System.out.println(ap.getPath() + "  p:" + ap.getParameter().getName() + " 2:" + ap.getParameter().getLocation());
						System.out.println("\n ");
						
						diffMetamodel.createRelocateParameterInstance(dp, ap, changes);
					}
				}
			}
		}
	}
	
	public static void processChangeTypeParameter(DiffMetamodel diffMetamodel, List<ChangeParameter> deleteParameters,
			List<ChangeParameter> addParameters, List<Change> changes) {
		for (ChangeParameter dp : deleteParameters){
			for (ChangeParameter ap : addParameters){
				if (dp.getPath().equals(ap.getPath()) && dp.getParameter().getName().equals(ap.getParameter().getName())){
					if (!dp.getParameter().getType().getName().equals(ap.getParameter().getType().getName())){
						System.out.println(dp.getPath() + "  p:" + dp.getParameter().getName() + " 1:" + dp.getParameter().getLocation());
						System.out.println(ap.getPath() + "  p:" + ap.getParameter().getName() + " 2:" + ap.getParameter().getLocation());
						System.out.println("\n ");
						
						diffMetamodel.createChangeTypeOfParameterInstance(dp, ap, changes);
					}
				}
			}
		}
	}
	
	public static void processIncreaseNumberOfParameters(DiffMetamodel diffMetamodel, Map<String, List<ChangeParameter>> operations, String oldVersion, List<Change> changes) {
		int countAdded = 0;
		for (Map.Entry<String, List<ChangeParameter>> entry : operations.entrySet())
		{		    		    		    
		    for (ChangeParameter p : entry.getValue()){
		    	if (p.getDifferenceKind() == DifferenceKind.ADD){
		    		countAdded = 0;
		    		for (ChangeParameter p2 : entry.getValue()){
		    			if (p.getParameter().getName().equals(p2.getParameter().getName()) &&
		    				p.getParameter().getLocation() == p2.getParameter().getLocation())
		    				countAdded++;
		    		}
		    		
		    		if (countAdded == 1){
		    			diffMetamodel.createIncreaseNumberOfParametersInstance(oldVersion, p, changes);
		    			System.out.println(entry.getKey() + " " + p.getParameter().getName() + " Added");
		    		}
		    	}
		    }
		}				
	}

	public static void processDecreaseNumberOfParameters(DiffMetamodel diffMetamodel, Map<String, List<ChangeParameter>> operations, String oldVersion, List<Change> changes) {
		int countDeleted = 0;
		for (Map.Entry<String, List<ChangeParameter>> entry : operations.entrySet())
		{		    		    		    
		    for (ChangeParameter p : entry.getValue()){
		    	if (p.getDifferenceKind() == DifferenceKind.DELETE){
		    		countDeleted = 0;
		    		for (ChangeParameter p2 : entry.getValue()){
		    			if (p.getParameter().getName().equals(p2.getParameter().getName()) &&
		    				p.getParameter().getLocation() == p2.getParameter().getLocation())
		    				countDeleted++;
		    		}
		    		
		    		if (countDeleted == 1){
		    			diffMetamodel.createDecreaseNumberOfParametersInstance(oldVersion, p, changes);
		    			System.out.println(entry.getKey() + " " + p.getParameter().getName() + " Deleted");
		    		}
		    	}
		    }
		}				
	}
	
	public static void processRenameParameter(DiffMetamodel diffMetamodel, List<ChangeParameter> changeParameters,
			List<ChangeParameter> addParameters,List<Change> changes) {
		for (ChangeParameter dp : changeParameters){
			for (ChangeParameter ap : addParameters){
				if (dp.getPath().equals(ap.getPath()) && dp.getParameter().getName().equals(ap.getParameter().getName())){
					if (!dp.getParameter().getType().getName().equals(ap.getParameter().getType().getName())){
						System.out.println(dp.getPath() + "  p:" + dp.getParameter().getName() + " 1:" + dp.getParameter().getLocation());
						System.out.println(ap.getPath() + "  p:" + ap.getParameter().getName() + " 2:" + ap.getParameter().getLocation());
						System.out.println("\n ");
						
						diffMetamodel.createChangeTypeOfParameterInstance(dp, ap, changes);
					}
				}
			}
		}
	}
	
	public static void processChangeTypeOfReturnValue(DiffMetamodel diffMetamodel, List<ChangeResponse> deleteResponse,
			List<ChangeResponse> addResponse, List<Change> changes) {
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
	
	public static void processDeleteResponses(DiffMetamodel diffMetamodel, List<ChangeResponse> deleteResponse,List<Change> changes) {
		for(ChangeResponse delRes: deleteResponse) {
			diffMetamodel.createDeleteStatusCode(delRes, changes);
		}
	}
	
	/************************************ GET METHODS ************************************************************/
	
	public static void getAddedParameters(List<ChangeParameter> addParameters, Map<String, List<ChangeParameter>> operations, Diff diff, String newVersion) {
		if (((ReferenceChange)diff).getValue() instanceof ParameterImpl && diff.getKind() == DifferenceKind.ADD){
			ParameterImpl parameter = (ParameterImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getRight().eContainer();
								
				ChangeParameter param = new ChangeParameter();
				param.setParameter(parameter);
				param.setVersion(newVersion);
				param.setDifferenceKind(DifferenceKind.ADD);
				param.setPath(path.getRelativePath());				
				param.setUri(EcoreUtil.getURI(parameter).toString());
				
				setOperation(path, param);
				
				addOperations(operations, path, param);
				
				addParameters.add(param);
			}
		}
	}

	public static void getChangedParameters(List<ChangeParameter> changeParameters, Diff diff, String oldVersion, String newVersion) {
		if (((ReferenceChange)diff).getValue() instanceof ParameterImpl && diff.getKind() == DifferenceKind.MOVE){
			ParameterImpl parameter = (ParameterImpl)((ReferenceChange)diff).getValue();
			
			if (diff.getMatch().getRight() != null && diff.getMatch().getRight().eContainer() instanceof PathImpl){						
				PathImpl path = (PathImpl)diff.getMatch().getRight().eContainer();
				
				ChangeParameter param = new ChangeParameter();
				param.setParameter(parameter);
				param.setVersion(newVersion);
				param.setDifferenceKind(DifferenceKind.MOVE);
				param.setPath(path.getRelativePath());
				param.setUri(EcoreUtil.getURI(parameter).toString());				
				setOperation(path, param);				
				
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
				param.setParameter(parameter);
				param.setVersion(oldVersion);
				param.setDifferenceKind(DifferenceKind.DELETE);
				param.setPath(path.getRelativePath());				
				param.setUri(EcoreUtil.getURI(parameter).toString());
				setOperation(path, param);	
				
				addOperations(operations, path, param);		
				
				deleteParameters.add(param);				
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
