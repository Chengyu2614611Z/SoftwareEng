package Model;

import java.util.ArrayList;
import java.util.Iterator;

// Generated by Class Director
public class ListofRequirements{

	//to store all teaching requirements
	private ArrayList<Class> listOfClassRequirements = new ArrayList<>();
	private Iterator<Class> it;

	public ListofRequirements(){

	}

	public ArrayList<Class> getListOfClassRequirements(){
		return this.listOfClassRequirements;
	}

	public Iterator<Class> getit(){
		it = this.listOfClassRequirements.iterator();
		return this.it;
	}

	public void add(Class requirement) {
		this.listOfClassRequirements.add(requirement);
	}

	public void remove(Class subRequirement){
		this.listOfClassRequirements.remove(subRequirement);
	}

	public int requirementsRemaining(){
		this.print();
		return this.listOfClassRequirements.size();
	}

	public void print(){
		
	}
}