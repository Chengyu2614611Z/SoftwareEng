package model;

public class ClassDirector{

	private ListOfClassRequirements listOfClassRequirements = new ListOfClassRequirements();

	//��ý�ѧҪ��
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