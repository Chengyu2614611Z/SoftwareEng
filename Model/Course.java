package Model;

public class Course {

	private String name; // must match Staff subject area
	private int classesPerWeek;

	public Course(String name, int classesPerWeek) {
		this.name = name;
		this.classesPerWeek = classesPerWeek;
	}

	public String getName() {
		return this.name;
	}

	public int getClassesPerWeek() {
		return this.classesPerWeek;
	}

	public void print() {
		System.out.printf("Class Subject:  " + this.name + " Class number per week:  " + this.classesPerWeek);
		System.out.println();
	}
}