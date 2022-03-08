package Model;

import java.util.ArrayList;

public class Teacher {

	private ArrayList<Class> assignedClasses = new ArrayList<>();

	private String name;
	private String subjectArea;
	private int age;
	private boolean Traincondition;

	public Teacher(String name, String subjectArea, int age, boolean traincondition) {
		super();
		this.name = name;
		this.subjectArea = subjectArea;
		this.age = age;
		Traincondition = traincondition;
	}

	public ArrayList<Class> getAssignedClasses() {
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