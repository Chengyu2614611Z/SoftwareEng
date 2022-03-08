package Model;

import java.util.ArrayList;

public class Teacher {

	private ArrayList<Course> assignedClasses = new ArrayList<>();

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

	public boolean assignClass(Course assignedClass, ListofRequirements requirements) {
		if (!assignedClass.getName().equals(this.subjectArea)) {
			System.out.print("This staff member is not part of the " + assignedClass.getName() + " trained staff.");
			return false;
		}
		this.assignedClasses.add(assignedClass);
		requirements.remove(assignedClass);
		return true;
	}

	public ArrayList<Course> getAssignedClasses() {
		return this.assignedClasses;
	}

	public String getName() {
		return this.name;
	}

	public String getSubjectArea() {
		return this.subjectArea;
	}

	public void print() {
		System.out.printf("Name: %s | Subject: %s | Current classes: %d\n", this.name);
	}
}