package Model;

import java.util.ArrayList;

public class Teacher {

	private ArrayList<Course> assignedCourse = new ArrayList<>();

	private String name;
	private String subjectArea;
	private int age;
	private boolean Traincondition; // be trained or not

	public Teacher(String name, String subjectArea, int age, boolean traincondition) {
		super();
		this.name = name;
		this.subjectArea = subjectArea;
		this.age = age;
		Traincondition = traincondition;
	}

	// Assign requirement to teacher.
	public boolean assignClass(Course assignedCourse, ListofRequirements requirements) {
		if (!assignedCourse.getName().equals(this.subjectArea)) {
			System.out.print("This staff member is not part of the " + assignedCourse.getName() + " trained staff.");
			return false;
		}
		this.assignedCourse.add(assignedCourse);
		requirements.remove(assignedCourse);
		return true;
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
		System.out.printf("Name: " + this.getName() + "  Subject: " + this.getSubjectArea() + "TrainedOrNot:  "
				+ this.Traincondition);
	}
}