package Model;

import java.util.ArrayList;

public class Admin {
	String name;
	ArrayList<Course> ListofRequirement = new ArrayList<>();
	ArrayList<Teacher> ListofTeacher = new ArrayList<>();

	public ArrayList<Course> getListofRequirement1() {
		return this.ListofRequirement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Teacher> getListofTeacher() {
		return this.ListofTeacher;
	}

}