package Model;

import java.util.ArrayList;

public class Teacher{

	private ArrayList<Class> assignedClasses = new ArrayList<>();

	private String name;
	private String subjectArea;

	public Teacher(String name, String subjectArea){
		this.name = name;
		this.subjectArea = subjectArea;

	}

	public ArrayList<Class> getAssignedClasses(){
		return this.assignedClasses;
	}


	public String getName(){
		return this.name;
	}

	public String getSubjectArea(){
		return this.subjectArea;
	}



	public void print(){
		System.out.printf("Name: %s | Subject: %s | Current classes: %d\n", this.name);
	}
}