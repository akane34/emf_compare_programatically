package co.edu.uniandes.pojos;

public enum ModelOutputType {

	BASE64("base64"),
	FILE_PATH("filePath"),
	NONE("none");
	
	private String name;
	
	private ModelOutputType (String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static ModelOutputType parse(String name){
		if (name == null)
			return ModelOutputType.NONE;
		
		for (ModelOutputType e : ModelOutputType.values()) {
	      if (e.name.equalsIgnoreCase(name)) {
	        return e;
	      }
	    }
	    return ModelOutputType.NONE;
	}
}
