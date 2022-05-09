package models;

public class ActionFigure extends Doll {
	String ModelType;

	
	public ActionFigure() {
		this.ModelType = "Plastic Chassis" ;
		this.name = "Jonny";
	}
	
	public ActionFigure(String ModelType, String name) {
		this.ModelType = ModelType;
		this.name = name;
	}
	
	public String getModelType () {
		return this.ModelType;
	}
	public void setModelType (String ModelType) {
		this.ModelType = ModelType;
	}
	
	public void makePunch() {
		System.out.println("Boom, Head Punch!");
	}
	
}
