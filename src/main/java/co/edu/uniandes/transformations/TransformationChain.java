package co.edu.uniandes.transformations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.ecore.resource.ResourceSet;

import co.edu.uniandes.changesIdentifier.ChangesIdentifier;
import co.edu.uniandes.comparator.Comparer;
import co.edu.uniandes.pojos.CompareVersionInput;
import co.edu.uniandes.pojos.IdentifyOutput;
import co.edu.uniandes.pojos.ModelPathOutput;
import co.edu.uniandes.pojos.TransformationChainOutput;
import co.edu.uniandes.transformations.m2m.HtmlToModelTransformation;
import co.edu.uniandes.transformations.m2t.HtmlToFileTransformation;
import co.edu.uniandes.util.Tools;

public class TransformationChain {

	public TransformationChainOutput execute(CompareVersionInput compareVersion){
		TransformationChainOutput output = new TransformationChainOutput();
		
		try{
			
			Tools.registerOpenAPIMetamodel();
			Tools.registerDiffMetamodel();
			Tools.registerHtmlMetamodel();
			
			//Compare
			ModelPathOutput minorPath = Tools.getMinorModelPath(compareVersion);
			ModelPathOutput mayorPath = Tools.getMayorModelPath(compareVersion);
			
			ResourceSet minorVersionModel = Tools.loadModel(minorPath.getPath());
			ResourceSet mayorVersionModel = Tools.loadModel(mayorPath.getPath());
			
			Comparer comparer = new Comparer();
			EList<Diff> diffs = comparer.compare(minorVersionModel, mayorVersionModel);
			
			//identify
			ModelPathOutput outputDiffModelPath = Tools.getOutputDiffModelPath(compareVersion);
			ChangesIdentifier identifierChanges = new ChangesIdentifier();
			IdentifyOutput identifyOutput = identifierChanges.identify( compareVersion, diffs, 
																		outputDiffModelPath.getPath(), 
																		minorVersionModel, 
																		mayorVersionModel);
			if(!identifyOutput.isSuccess())
				throw new Exception(identifyOutput.getError());
			
			//M2M
			ModelPathOutput htmlModelPath = Tools.getHtmlModelPath();
			HtmlToModelTransformation htmlModelTransformation = new HtmlToModelTransformation(htmlModelPath.getPath());
			htmlModelTransformation.transformation(identifyOutput.getOutputModel(), minorVersionModel, mayorVersionModel);
			
			//M2T
			HtmlToFileTransformation htmlFileTransformation = new HtmlToFileTransformation();
			htmlFileTransformation.transformation(htmlModelPath.getPath());
			
			output.setSuccess(true);
			output.setDiffModel(identifyOutput.getDiffModel());
			output.setError(identifyOutput.getError());
			output.setOutputType(identifyOutput.getOutputType());
			
			
		}
		catch(Exception ex){
			output.setSuccess(false);
			output.setError(ex.getMessage());
		}
		
		return output;
	}
}
