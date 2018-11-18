package co.edu.uniandes;

import co.edu.uniandes.diff.ChangesIdentifier;
import co.edu.uniandes.pojos.CompareVersionInput;
import co.edu.uniandes.pojos.CompareVersionOutput;

public class Main {

	static String minorVersion = "1.0";
	static String mayorVersion = "2.0";
	
	public static void main(String[] args) {		
		String minorModelPath = "v1.0.xmi";
		String mayorModelPath = "v2.0.xmi";
		
		CompareVersionInput compareVersionInput = new CompareVersionInput();
		compareVersionInput.setInputType("filePath");
		compareVersionInput.setMinorVersionNumber(minorVersion);
		compareVersionInput.setMayorVersionNumber(mayorVersion);
		compareVersionInput.setMinorVersionModel(minorModelPath);
		compareVersionInput.setMayorVersionModel(mayorModelPath);
		compareVersionInput.setOutputType("filePath");
		compareVersionInput.setOutputDiffModel("C:\\temp\\model.xmi");
		
		ChangesIdentifier identifierChanges = new ChangesIdentifier();
		CompareVersionOutput comparerVersionOutput = identifierChanges.createDiffModel(compareVersionInput);
		
		System.out.println("Diff model type: " + comparerVersionOutput.getOutputType());
		System.out.println("Diff model: " + comparerVersionOutput.getDiffModel());
		System.out.println("Error: " + comparerVersionOutput.getError());		
	}	
}
