package model;

public class ClassDirector{

	private ListOfClassRequirements listOfClassRequirements = new ListOfClassRequirements();

	//获得教学要求
	public ListOfClassRequirements getListOfClassRequirements(){
		return this.listOfClassRequirements;
	}

	public void newClassRequirement(String teachingrequirement){
		this.listOfClassRequirements.add(teachingrequirement);
	}

	public void subClassRequirement(int index){
		this.listOfClassRequirements.remove(index);
	}
}