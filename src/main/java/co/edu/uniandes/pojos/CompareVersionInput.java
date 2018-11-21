package co.edu.uniandes.pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CompareVersionInput {

	private String minorVersionNumber;
	private String mayorVersionNumber;
	private String inputType;
	private String minorVersionModel;
	private String mayorVersionModel;
	private String outputType;
	private String outputDiffModel;
		
	public String getMinorVersionNumber() {
		return minorVersionNumber;
	}
	public void setMinorVersionNumber(String minorVersionNumber) {
		this.minorVersionNumber = minorVersionNumber;
	}
	public String getMayorVersionNumber() {
		return mayorVersionNumber;
	}
	public void setMayorVersionNumber(String mayorVersionNumber) {
		this.mayorVersionNumber = mayorVersionNumber;
	}
	public String getInputType() {
		return inputType;
	}
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}
	public String getMinorVersionModel() {
		return minorVersionModel;
	}
	public void setMinorVersionModel(String minorVersionModel) {
		this.minorVersionModel = minorVersionModel;
	}
	public String getMayorVersionModel() {
		return mayorVersionModel;
	}
	public void setMayorVersionModel(String mayorVersionModel) {
		this.mayorVersionModel = mayorVersionModel;
	}
	public String getOutputType() {
		return outputType;
	}
	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}
	public String getOutputDiffModel() {
		return outputDiffModel;
	}
	public void setOutputDiffModel(String outputDiffModel) {
		this.outputDiffModel = outputDiffModel;
	}
	public ModelInputType getInputTypeE() {
		return ModelInputType.parse(inputType);
	}
	public ModelOutputType getOutputTypeE() {
		return ModelOutputType.parse(outputType);
	}	
}
