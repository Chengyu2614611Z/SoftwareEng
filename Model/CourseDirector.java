package Model;

public class CourseDirector{

	private ListofRequirements listOfClassRequirements = new ListofRequirements();
	private Requirements requirement;

	//
	public ListofRequirements getListOfClassRequirements(){
		return this.listOfClassRequirements;
	}

	public void newClassRequirement(String a){
		this.requirement.setRequirement(a);
		this.listOfClassRequirements.add(this.requirement);
	}

	public void subClassRequirement(int index){
		this.listOfClassRequirements.remove(index);
	}
}