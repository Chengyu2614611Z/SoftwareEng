package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Requirements{

	String requirement;

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public Requirements(String requirement) {
		super();
		this.requirement = requirement;
	}

//	public String CreateRequirement() {
//		Scanner sc = new Scanner(System.in);
//		this.requirement = sc.nextLine();
//		return this.requirement;
//	}
}