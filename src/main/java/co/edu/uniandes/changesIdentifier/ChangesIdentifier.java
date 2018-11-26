package co.edu.uniandes.changesIdentifier;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.resource.ResourceSet;

import co.edu.uniandes.comparator.Comparer;
import co.edu.uniandes.pojos.CompareVersionInput;
import co.edu.uniandes.pojos.IdentifyOutput;
import co.edu.uniandes.pojos.ModelInputType;
import co.edu.uniandes.pojos.ModelOutputType;
import co.edu.uniandes.transformations.m2m.DiffModelTransformation;
import co.edu.uniandes.util.Tools;

public class ChangesIdentifier {

	public IdentifyOutput identify(CompareVersionInput compareVersionInput){
		IdentifyOutput output = new IdentifyOutput();
		try{
			output = validateCompareVersionInput(compareVersionInput);
			if (!output.getError().isEmpty())
				return output;
			
			String outputModelPath = getOutputModelPath(compareVersionInput);
			
			if (compareVersionInput.getInputTypeE() == ModelInputType.BASE64)
				return createDiffModelFromBase64(compareVersionInput, outputModelPath);
			else if (compareVersionInput.getInputTypeE() == ModelInputType.FILE_PATH)
				return createDiffModelFromFilePath(compareVersionInput, outputModelPath);
			else{							
				output.setError("Invalid model input type");
				output.setSuccess(false);
				return output;
			}
		}catch (Exception ex){						
			output.setError(ex.getMessage());
			output.setSuccess(false);
			return output;
		}
	}
	
	/*************************************** PRIVATE METHODS *************************************************/
	
	private IdentifyOutput createDiffModelFromBase64(CompareVersionInput compareVersionInput, String outputModelPath) throws IOException {				
		byte[] decodedMinorModel = Base64.getDecoder().decode(compareVersionInput.getMinorVersionModel().getBytes(StandardCharsets.UTF_8));
		Path destinationFileMinorModel = Files.createTempFile("minorModel", ".xmi");
		Files.write(destinationFileMinorModel, decodedMinorModel);			
		
		byte[] decodedMayorModel = Base64.getDecoder().decode(compareVersionInput.getMayorVersionModel().getBytes(StandardCharsets.UTF_8));
		Path destinationFileMayorModel = Files.createTempFile("mayorModel", ".xmi");
		Files.write(destinationFileMayorModel, decodedMayorModel);
		
		String minorModelPath = destinationFileMinorModel.toAbsolutePath().toString();
		String mayorModelPath = destinationFileMayorModel.toAbsolutePath().toString();	
		
		return proccessComparition(compareVersionInput, minorModelPath, mayorModelPath, outputModelPath);		
	}
	
	private IdentifyOutput createDiffModelFromFilePath(CompareVersionInput compareVersionInput, String outputModelPath) throws IOException {		
		return proccessComparition(compareVersionInput, compareVersionInput.getMinorVersionModel(), compareVersionInput.getMayorVersionModel(), outputModelPath);
	}
	
	private IdentifyOutput proccessComparition(CompareVersionInput compareVersionInput, String minorModelPath, String mayorModelPath, String outputModelPath) throws IOException {
		IdentifyOutput output = new IdentifyOutput();
		
		String minorVersion = compareVersionInput.getMinorVersionNumber();
		String mayorVersion = compareVersionInput.getMinorVersionNumber();
		
		DiffModelTransformation diffMetamodel = new DiffModelTransformation(outputModelPath);
		Comparer comparer = new Comparer();
		
		ResourceSet minorVersionModel = Tools.loadModel(minorModelPath);
		ResourceSet mayorVersionModel = Tools.loadModel(mayorModelPath);	
		
		Comparison comparison = comparer.compare(minorVersionModel, mayorVersionModel);
	
		EList<Diff> diffs = comparison.getDifferences();
		
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
		co.edu.uniandes.metamodels.Diff.Diff diff = ChangesProcessor.processVersion(diffMetamodel, mayorVersion, minorVersion);
		ChangesProcessor.processRelocateSameParameter(diffMetamodel, changeParameters, diff.getChange());
		ChangesProcessor.processRelocateMultipleParametersInOneParameter(diffMetamodel, changeParameters, operations, diff.getChange());
		ChangesProcessor.processChangeTypeParameter(diffMetamodel, deleteParameters, addParameters, changeParameters, diff.getChange());
		ChangesProcessor.processIncreaseNumberOfParameters(diffMetamodel, operations, minorVersion, diff.getChange());
		ChangesProcessor.processDecreaseNumberOfParameters(diffMetamodel, operations, minorVersion, diff.getChange());
		ChangesProcessor.processChangeTypeOfReturnValue(diffMetamodel, deleteResponse, addResponse, diff.getChange());
		ChangesProcessor.processRenameParameter(diffMetamodel, changeParameters, diff.getChange());
		ChangesProcessor.processDeletedResponses(diffMetamodel, deleteResponse, diff.getChange());
		ChangesProcessor.processAddedResponses(diffMetamodel, addResponse, diff.getChange());
		ChangesProcessor.processBoundariesParamsUpdated(diffMetamodel,changesBoundaryParameters, diff.getChange());
		ChangesProcessor.processSchemasUpdated(diffMetamodel, addAndDeletedSchemas, diff.getChange());
		ChangesProcessor.processContentTypesUpdates(diffMetamodel,contentTypesUpdated, diff.getChange());
		ChangesProcessor.processUnsupportRequestMethods(diffMetamodel, deleteOperations, diff.getChange());
		ChangesProcessor.processChangeDefaultValueOfParameter(diffMetamodel, changeParameters, diff.getChange());
		ChangesProcessor.processExposeData(diffMetamodel, contentTypesUpdated, diff.getChange());
		ChangesProcessor.processAddRestrictedAccess(diffMetamodel, addResponse, diff.getChange());
		ChangesProcessor.processRemoveRestrictedAccessToTheAPI(diffMetamodel, addResponse, diff.getChange());
		ChangesProcessor.processModifyParameterSchemaType(diffMetamodel, addAndDeletedSchemas, changedSchemas, diff.getChange(), minorVersionModel, mayorVersionModel);
		
		diffMetamodel.saveInstance();		
						
		if (compareVersionInput.getOutputTypeE() == ModelOutputType.BASE64){
			output.setDiffModel(base64Converter(outputModelPath));
			output.setOutputType(compareVersionInput.getOutputTypeE().getName());
		}
		else if (compareVersionInput.getOutputTypeE() == ModelOutputType.FILE_PATH){
			output.setDiffModel(outputModelPath);
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
	
	private String getOutputModelPath(CompareVersionInput compareVersionInput) throws IOException {
		String outputModelPath = "";
		if (compareVersionInput.getOutputTypeE() == ModelOutputType.BASE64){
			Path outputModel = Files.createTempFile("outputModel", ".xmi");
			outputModelPath = outputModel.toAbsolutePath().toString();
		}
		else if (compareVersionInput.getOutputTypeE() == ModelOutputType.FILE_PATH){				
			outputModelPath = compareVersionInput.getOutputDiffModel();
		}
		return outputModelPath;
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
