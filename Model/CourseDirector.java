package Model;

public class CourseDirector {

	private ListofRequirements listOfClassRequirements = new ListofRequirements();

	//
	public ListofRequirements getListOfClassRequirements() {
		return this.listOfClassRequirements;
	}

	public void newClassRequirement(Course newrequirement) {
		this.listOfClassRequirements.add(newrequirement);
	}

	public void subClassRequirement(Course subRequirement) {
		this.listOfClassRequirements.remove(subRequirement);
	}

	public void printRequirement() {
		this.listOfClassRequirements.print();
	}
}