package co.edu.uniandes.pojos;

public enum ModelInputType {

	BASE64("base64"),
	FILE_PATH("filePath"),
	NONE("none");
	
	private String name;
	
	private ModelInputType (String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static ModelInputType parse(String name){
		if (name == null)
			return ModelInputType.NONE;
		
		for (ModelInputType e : ModelInputType.values()) {
	      if (e.name.equalsIgnoreCase(name)) {
	        return e;
	      }
	    }
	    return ModelInputType.NONE;
	}
}
