package co.edu.uniandes.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.metamodels.Diff.DiffPackage;
import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.pojos.CompareVersionInput;
import co.edu.uniandes.pojos.ModelInputType;
import co.edu.uniandes.pojos.ModelOutputType;
import co.edu.uniandes.pojos.ModelPathOutput;
import edu.uoc.som.openapi.OpenAPIPackage;

public class Tools {
	public static ResourceSet loadModel(String absolutePath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		URI uri = URI.createFileURI(absolutePath);
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResource(uri, true);
	  
		return resourceSet;
	}
	
	public static OpenAPIPackage registerOpenAPIMetamodel() {		
		OpenAPIPackage openAPIPackage = OpenAPIPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(openAPIPackage.getNsURI(), openAPIPackage);
		
		return openAPIPackage;
	}
	
	public static HtmlPackage registerHtmlMetamodel() {		
		HtmlPackage htmlPackage = HtmlPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(htmlPackage.getNsURI(), htmlPackage);
		
		return htmlPackage;
	}
	
	public static DiffPackage registerDiffMetamodel() {		
		DiffPackage diffPackage = DiffPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(diffPackage.getNsURI(), diffPackage);
		
		return diffPackage;
	}
	
	public static ModelPathOutput getMinorModelPath(CompareVersionInput compareVersionInput){
		ModelPathOutput output = new ModelPathOutput();
		try{
			if (compareVersionInput.getInputTypeE() == ModelInputType.BASE64){
				output.setPath(getMinorPathFromBase64(compareVersionInput));
				output.setSuccess(true);
			}
			else if (compareVersionInput.getInputTypeE() == ModelInputType.FILE_PATH){
				output.setPath(getMinorPathFromFilePath(compareVersionInput));
				output.setSuccess(true);
			}
			else{				
				output.setError("Invalid model input type");
				output.setSuccess(false);					
			}
		}catch(Exception ex){
			output.setSuccess(false);
			output.setError(ex.getMessage());
		}
		
		return output;
	}
	
	public static ModelPathOutput getMayorModelPath(CompareVersionInput compareVersionInput){
		ModelPathOutput output = new ModelPathOutput();
		try{
			if (compareVersionInput.getInputTypeE() == ModelInputType.BASE64){
				output.setPath(getMayorPathFromBase64(compareVersionInput));
				output.setSuccess(true);
			}
			else if (compareVersionInput.getInputTypeE() == ModelInputType.FILE_PATH){
				output.setPath(getMayorPathFromFilePath(compareVersionInput));
				output.setSuccess(true);
			}
			else{				
				output.setError("Invalid model input type");
				output.setSuccess(false);					
			}
		}
		catch(Exception ex){
			output.setSuccess(false);
			output.setError(ex.getMessage());
		}
		
		return output;
	}
	
	public static ModelPathOutput getOutputDiffModelPath(CompareVersionInput compareVersionInput) {
		ModelPathOutput output = new ModelPathOutput();
		try{			
			if (compareVersionInput.getOutputTypeE() == ModelOutputType.BASE64){
				Path outputModel = Files.createTempFile("outputModel", ".xmi");
				output.setPath(outputModel.toAbsolutePath().toString());
				output.setSuccess(true);
			}
			else if (compareVersionInput.getOutputTypeE() == ModelOutputType.FILE_PATH){				
				output.setPath(compareVersionInput.getOutputDiffModel());
				output.setSuccess(true);
			}
			else{				
				output.setError("Invalid model output type");
				output.setSuccess(false);					
			}
		}
		catch(Exception ex){
			output.setSuccess(false);
			output.setError(ex.getMessage());
		}
		
		return output;
	}
	
	public static ModelPathOutput getHtmlModelPath(){
		ModelPathOutput output = new ModelPathOutput();
		try{			
			output.setPath(Files.createTempFile("htmlModel", ".xmi").toAbsolutePath().toString());
			output.setSuccess(true);
		}
		catch(Exception ex){
			output.setSuccess(false);
			output.setError(ex.getMessage());
		}
		
		return output;
	}
	
	private static String getMinorPathFromBase64(CompareVersionInput compareVersionInput) throws IOException {				
		byte[] decodedMinorModel = Base64.getDecoder().decode(compareVersionInput.getMinorVersionModel().getBytes(StandardCharsets.UTF_8));
		Path destinationFileMinorModel = Files.createTempFile("minorModel", ".xmi");
		Files.write(destinationFileMinorModel, decodedMinorModel);		
		
		return destinationFileMinorModel.toAbsolutePath().toString();		
	}
	
	private static String getMinorPathFromFilePath(CompareVersionInput compareVersionInput){		
		return compareVersionInput.getMinorVersionModel();
	}
	
	private static String getMayorPathFromBase64(CompareVersionInput compareVersionInput) throws IOException {		
		byte[] decodedMayorModel = Base64.getDecoder().decode(compareVersionInput.getMayorVersionModel().getBytes(StandardCharsets.UTF_8));
		Path destinationFileMayorModel = Files.createTempFile("mayorModel", ".xmi");
		Files.write(destinationFileMayorModel, decodedMayorModel);			
		
		return destinationFileMayorModel.toAbsolutePath().toString();		
	}
	
	private static String getMayorPathFromFilePath(CompareVersionInput compareVersionInput) throws IOException {		
		return compareVersionInput.getMayorVersionModel();
	}
}
