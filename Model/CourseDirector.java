package Model;

public class CourseDirector {

	private ListofRequirements listOfClassRequirements = new ListofRequirements();

	//
	public ListofRequirements getListOfClassRequirements() {
		return this.listOfClassRequirements;
	}

	public void newClassRequirement(Class newrequirement) {
		this.listOfClassRequirements.add(newrequirement);
	}

	public void subClassRequirement(Class subRequirement) {
		this.listOfClassRequirements.remove(subRequirement);
	}

	public void printRequirement() {
		this.listOfClassRequirements.print();
	}
}