package co.edu.uniandes.changesIdentifier;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.resource.ResourceSet;

import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.pojos.CompareVersionInput;
import co.edu.uniandes.pojos.IdentifyOutput;
import co.edu.uniandes.pojos.ModelOutputType;
import co.edu.uniandes.transformations.m2m.DiffModelTransformation;
import co.edu.uniandes.util.Tools;
import edu.uoc.som.openapi.impl.PathImpl;

public class ChangesIdentifier {

	public IdentifyOutput identify(CompareVersionInput compareVersionInput, EList<Diff> diffs, String outputModelPath, ResourceSet minorVersionModel, ResourceSet mayorVersionModel){
		IdentifyOutput output = new IdentifyOutput();
		try{
			output = validateCompareVersionInput(compareVersionInput);
			if (!output.getError().isEmpty())
				return output;
						
			return proccessComparition(compareVersionInput, diffs, outputModelPath, minorVersionModel, mayorVersionModel);
			
		}catch (Exception ex){						
			output.setError(ex.getMessage());
			output.setSuccess(false);
			return output;
		}
	}
	
	/*************************************** PRIVATE METHODS *************************************************/
	private IdentifyOutput proccessComparition(CompareVersionInput compareVersionInput, EList<Diff> diffs, String outputDiffModelPath, ResourceSet minorVersionModel, ResourceSet mayorVersionModel) throws IOException {
		IdentifyOutput output = new IdentifyOutput();
		
		String minorVersion = compareVersionInput.getMinorVersionNumber();
		String mayorVersion = compareVersionInput.getMinorVersionNumber();
		
		DiffModelTransformation diffModelTransformation = new DiffModelTransformation(outputDiffModelPath);		
		
		List<ChangeParameter> deleteParameters = new ArrayList<ChangeParameter>();
		List<ChangeParameter> addParameters = new ArrayList<ChangeParameter>();
		List<ChangeParameter> changeParameters = new ArrayList<ChangeParameter>();
		Map<String, List<ChangeParameter>> operations = new HashMap<String, List<ChangeParameter>>();
		List<ChangeBoundaryParameter> changesBoundaryParameters = new ArrayList<ChangeBoundaryParameter>();
		List<ChangeResponse> deleteResponse = new ArrayList<ChangeResponse>();
		List<ChangeResponse> addResponse = new ArrayList<ChangeResponse>();
		List<ChangeSchema> addAndDeletedSchemas = new ArrayList<ChangeSchema>();
		List<ChangeSchema> changedSchemas = new ArrayList<ChangeSchema>();
		List<ChangeContentType> contentTypesUpdated = new ArrayList<ChangeContentType>();
		List<ChangeOperation> deleteOperations = new ArrayList<ChangeOperation>();
		List<ChangePath> deletePaths = new ArrayList<ChangePath>();
		List<ChangeOperation> changeOperations = new ArrayList<ChangeOperation>();
		
		for (Diff diff : diffs){	
			
			if (diff instanceof ReferenceChange){
				ChangesProcessor.getDeletedParameters(deleteParameters, operations, diff, minorVersion);				
				ChangesProcessor.getAddedParameters(addParameters, operations, diff, mayorVersion);			
				ChangesProcessor.getChangedParameters(changeParameters, diff, minorVersion, mayorVersion);
				ChangesProcessor.getDeletedResponse(deleteResponse, diff, minorVersion);				
				ChangesProcessor.getAddedResponse(addResponse, diff, mayorVersion);
				ChangesProcessor.getSchemaChanges(addAndDeletedSchemas, changedSchemas, diff);
				ChangesProcessor.getDeletedOperations(deleteOperations, diff, mayorVersion);		
				ChangesProcessor.getDeletedPaths(deletePaths, diff, minorVersion, mayorVersion);
				ChangesProcessor.getChangedOperations(changeOperations, diff, minorVersion, mayorVersion);
			}else if (diff instanceof AttributeChange) {
				ChangesProcessor.getChangeBoundaryParameters(changesBoundaryParameters, diff);
				ChangesProcessor.getContentTypesUpdated(contentTypesUpdated, diff);
				ChangesProcessor.getChangedParameters(changeParameters, diff, minorVersion, mayorVersion);
			}
			
		}
		co.edu.uniandes.metamodels.Diff.Diff diff = ChangesProcessor.processVersion(diffModelTransformation, mayorVersion, minorVersion);
		ChangesProcessor.processRelocateSameParameter(diffModelTransformation, changeParameters, diff.getChange());
		ChangesProcessor.processRelocateMultipleParametersInOneParameter(diffModelTransformation, changeParameters, operations, diff.getChange());
		ChangesProcessor.processChangeTypeParameter(diffModelTransformation, deleteParameters, addParameters, changeParameters, diff.getChange());
		ChangesProcessor.processIncreaseNumberOfParameters(diffModelTransformation, operations, deleteParameters, minorVersion, diff.getChange());
		ChangesProcessor.processDecreaseNumberOfParameters(diffModelTransformation, operations, addParameters, minorVersion, diff.getChange());
		ChangesProcessor.processDeletePaths(diffModelTransformation, deletePaths, diff.getChange());
		ChangesProcessor.processChangeTypeOfReturnValue(diffModelTransformation, deleteResponse, addResponse, diff.getChange());
		ChangesProcessor.processRenameParameter(diffModelTransformation, changeParameters, diff.getChange());
		ChangesProcessor.processDeletedResponses(diffModelTransformation, deleteResponse, addResponse, diff.getChange());
		ChangesProcessor.processAddedResponses(diffModelTransformation, addResponse,deleteResponse, diff.getChange());
		ChangesProcessor.processBoundariesParamsUpdated(diffModelTransformation,changesBoundaryParameters, diff.getChange());
		ChangesProcessor.processSchemasUpdated(diffModelTransformation, addAndDeletedSchemas, diff.getChange());
		ChangesProcessor.processContentTypesUpdates(diffModelTransformation,contentTypesUpdated, diff.getChange());
		ChangesProcessor.processUnsupportRequestMethods(diffModelTransformation, deleteOperations, diff.getChange());
		ChangesProcessor.processChangeDefaultValueOfParameter(diffModelTransformation, changeParameters, diff.getChange());
		ChangesProcessor.processExposeData(diffModelTransformation, contentTypesUpdated, diff.getChange());
		ChangesProcessor.processAddRestrictedAccess(diffModelTransformation, addResponse, diff.getChange());
		ChangesProcessor.processRemoveRestrictedAccessToTheAPI(diffModelTransformation, addResponse, diff.getChange());
		ChangesProcessor.processModifyParameterSchemaType(diffModelTransformation, addAndDeletedSchemas, changedSchemas, diff.getChange(), minorVersionModel, mayorVersionModel);		
		
		diffModelTransformation.saveInstance();		
		
		output.setOutputDiffModel(Tools.loadModel(outputDiffModelPath));
						
		if (compareVersionInput.getOutputTypeE() == ModelOutputType.BASE64){
			output.setDiffModel(base64Converter(outputDiffModelPath));
			output.setOutputType(compareVersionInput.getOutputTypeE().getName());
		}
		else if (compareVersionInput.getOutputTypeE() == ModelOutputType.FILE_PATH){
			output.setDiffModel(outputDiffModelPath);
			output.setOutputType(compareVersionInput.getOutputTypeE().getName());
		}
		
		output.setSuccess(true);		
		return output;
	}
	
	private IdentifyOutput validateCompareVersionInput(CompareVersionInput compareVersionInput){
		IdentifyOutput compareVersionOutput = new IdentifyOutput();
		compareVersionOutput.setError(null);
		
		if (compareVersionInput == null){
			compareVersionOutput.setError("The input can not be null");
			return compareVersionOutput;
		}else if (compareVersionInput.getInputType() == null || compareVersionInput.getInputType().isEmpty()){
			compareVersionOutput.setError("The inputType can not be null or empty");
			return compareVersionOutput;
		}else if (compareVersionInput.getMayorVersionModel() == null || compareVersionInput.getMayorVersionModel().isEmpty()){
			compareVersionOutput.setError("The mayorVersionModel can not be null or empty");
			return compareVersionOutput;
		}else if (compareVersionInput.getMayorVersionNumber() == null || compareVersionInput.getMayorVersionNumber().isEmpty()){
			compareVersionOutput.setError("The mayorVersionNumber can not be null or empty");
			return compareVersionOutput;
		}else if (compareVersionInput.getMinorVersionModel() == null || compareVersionInput.getMinorVersionModel().isEmpty()){
			compareVersionOutput.setError("The minorVersionModel can not be null or empty");
			return compareVersionOutput;
		}else if (compareVersionInput.getMinorVersionNumber() == null || compareVersionInput.getMinorVersionNumber().isEmpty()){
			compareVersionOutput.setError("The minorVersionNumber can not be null or empty");
			return compareVersionOutput;
		}else if (compareVersionInput.getOutputType() == null || compareVersionInput.getOutputType().isEmpty()){
			compareVersionOutput.setError("The outputType can not be null or empty");
			return compareVersionOutput;
		}else if (ModelOutputType.parse(compareVersionInput.getOutputType()) == ModelOutputType.FILE_PATH &&
				 (compareVersionInput.getOutputDiffModel() == null || compareVersionInput.getOutputDiffModel().isEmpty())){
			compareVersionOutput.setError("The outputDiffModel can not be null or empty");
			return compareVersionOutput;
		}
		return compareVersionOutput;		
	}	
	
	private String base64Converter(String outputModelPath) throws IOException{
		File originalFile = new File(outputModelPath);        
        try (FileInputStream fileInputStreamReader = new FileInputStream(originalFile)){
	        byte[] bytes = new byte[(int)originalFile.length()];
	        fileInputStreamReader.read(bytes);
	        return new String(Base64.getEncoder().encode(bytes));
        }        
	}
}
