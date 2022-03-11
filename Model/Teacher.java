package Model;

import java.util.ArrayList;

public class Teacher {

	private ArrayList<Course> assignedCourse = new ArrayList<>();

	private String name;
	private String subjectArea;
	private int age;
	private boolean traincondition; // be trained or not

	public Teacher(String name, String subjectArea, int age, boolean traincondition) {
		super();
		this.name = name;
		this.subjectArea = subjectArea;
		this.age = age;
		this.traincondition = traincondition;
	}

	public void train() {
		this.traincondition = true;
	}

	// Assign requirement to teacher.
	public void assignClass(Course assignedCourse, ListofRequirements requirements) {
		this.assignedCourse.add(assignedCourse);
		requirements.remove(assignedCourse);
	}

	public ArrayList<Course> getAssignedClasses() {
		return this.assignedCourse;
	}

	public String getName() {
		return this.name;
	}

	public String getSubjectArea() {
		return this.subjectArea;
	}

	public void print() {
		if (this.traincondition) {
			System.out
					.printf("Name: " + this.getName() + "  | Subject: " + this.getSubjectArea()
							+ " | Already be trained ");
		} else {
			System.out
					.printf("Name: " + this.getName() + " | Subject: " + this.getSubjectArea()
							+ " | Need to be trained ");
		}

	}

	public String toString() {
		return "Name: " + this.getName() + " | Subject: " + this.getSubjectArea()
				+ " | TrainedOrNot: Already be trained ";
	}

}