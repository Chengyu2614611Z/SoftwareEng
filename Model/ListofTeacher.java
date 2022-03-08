package Model;

import java.util.ArrayList;

// Generated via .txt file input
public class ListofTeacher {

	private ArrayList<Teacher> ListofTeacher = new ArrayList<>();

	public ListofTeacher() {
	}

	public ArrayList<Teacher> getlistOfTeacher() {
		return this.ListofTeacher;
	}

	public void add(Teacher newStaff) {
		this.ListofTeacher.add(newStaff);
	}

	public void remove(Teacher subStaff) {
		this.ListofTeacher.remove(subStaff);
	} // unused in implementation.

	// print teahcer seaching teacher's name or subjectArea
	public void find(String search) {
		for (Teacher curVal : this.ListofTeacher) {
			if (curVal.getSubjectArea().contains(search) || curVal.getName().contains(search)) {
				curVal.print();
			}
		}
	}

	// According to teacher name
	public Teacher findAccordingtoName(String search) {
		for (Teacher th : this.ListofTeacher) {
			if (th.getName().equals(search)) {
				return th;
			}
		}
		return null;
	}

	public void print() {
		for (Teacher printVal : this.ListofTeacher) {
			printVal.print();
		}
	}
}