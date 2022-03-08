package Model;

import java.util.ArrayList;

// Generated via .txt file input
public class ListofTeacher {

	private ArrayList<Teacher> listOfTeacher = new ArrayList<>();

	public ListofTeacher() {
	}

	public ArrayList<Teacher> getlistOfTeacher() {
		return this.listOfTeacher;
	}

	public void add(Teacher newStaff) {
		this.listOfTeacher.add(newStaff);
	}

	public void remove(Teacher subStaff) {
		this.listOfTeacher.remove(subStaff);
	} // unused in implementation.

	public void find(String search) {
		for (Teacher curVal : this.listOfTeacher) {
			if (curVal.getSubjectArea().contains(search)) {
				curVal.print();
			}
		}
	}

	public void print() {

	}
}