package Model;

import java.util.ArrayList;
import java.util.Iterator;

// Generated by Class Director
public class ListofAssignments {

	// to store all teaching requirements
	private ArrayList listOfClassAssignments = new ArrayList<>();
	private Iterator it;

	public ListofAssignments() {

	}

	public ArrayList<Class> getListOfClassRequirements() {
		return this.listOfClassAssignments;
	}

	public Iterator<Class> it() {
		it = this.listOfClassAssignments.iterator();
		return this.it;
	}

	public void add(String a) {
		this.listOfClassAssignments.add(a);
	}

	public void remove(int index) {
		this.listOfClassAssignments.remove(index);
	}

	public int requirementsRemaining() {
		this.print();
		return this.listOfClassAssignments.size();
	}

	public void print() {

	}
}