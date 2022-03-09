package Model;

import java.util.ArrayList;
import java.util.Iterator;

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
		for (Teacher teacher : this.ListofTeacher) {
			if (teacher.getSubjectArea().contains(search)) {
				teacher.print();
			}
		}
	}

	// According to teacher name
	public Teacher findAccordingtoName(String search) {
		Iterator<Teacher> it = this.ListofTeacher.iterator();
		while (it.hasNext()) {
			if (it.next().getName().equals(search)) {
				return it.next();
			}
		}
		// for (Teacher th : this.ListofTeacher) {
		// if (th.getName().equals(search)) {
		// return th;
		// }
		// }
		return null;
	}

	public void print() {
		for (Teacher printVal : this.ListofTeacher) {
			printVal.print();
		}
	}
}