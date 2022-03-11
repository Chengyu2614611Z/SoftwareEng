package Model;

public class Course {

	private String name; // must match Staff subject area
	private String WorkingDay;// 改

	public Course(String name, String time) {
		this.name = name;
		this.WorkingDay = time;
	}

	public String getName() {
		return this.name;
	}

	public String getClassesPerWeek() {
		return this.WorkingDay;
	}

	public void print() {
		System.out.printf("Class Subject: " + this.name + " | time to take class: " + this.WorkingDay);
		System.out.println();
	}

	public String toString() {
		return " Class Subject:  " + this.name + " time to take class: " + this.WorkingDay;
	}
}