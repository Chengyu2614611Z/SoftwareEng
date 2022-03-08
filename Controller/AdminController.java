package Controller;

import java.util.Scanner;

import Model.*;
import View.*;

public class AdminController {

	BasicModel basicmodel;
	AllView view;
	private Scanner systemInput = new Scanner(System.in); // User input instance
	private int readInput; // Holds user menu input for condition checks
	private int IntUserInput; // int for class creation and queries
	private String StringUserInput; // String search query story
	private Class currentClass = null;

	public AdminController(BasicModel model, AllView view) {
		this.basicmodel = model;
		this.view = view;
	}

	public void runtimeAdmin() throws InterruptedException {
		// When administrator menu option chosen
		this.view.drawAdminOptions();
		do {
			this.readInput = this.systemInput.nextInt();
			this.systemInput.nextLine();
			if (this.readInput == 1) {
				if (this.basicmodel.getCd() != null) {

					while (this.basicmodel.getCd().getListOfClassRequirements().getit().hasNext()) {
						currentClass = this.basicmodel.getCd().getListOfClassRequirements().getit().next(); // current
																											// //
																											// assigned
						System.out.println();

						currentClass.print(); // print Class requirement 1..n

						// Thread.sleep(1000);
						do {
							this.view.drawAdminOptions();
							this.StringUserInput = this.systemInput.next();
							this.systemInput.nextLine();
							this.basicmodel.getListofTeacher().find(StringUserInput); // allow admin to search for
																						// appropriate
							// staff
							// Thread.sleep(1000);
							this.view.readyToAssign();
							this.StringUserInput = this.systemInput.next();
							this.systemInput.nextLine();
						} while (!this.StringUserInput.equals("Y"));

						boolean successfulAssignment = false;
						while (!successfulAssignment) {
							this.view.drawAdminNameWait();
							this.StringUserInput = this.systemInput.next();
							this.systemInput.nextLine();
							try {
								successfulAssignment = this.basicmodel.getListofTeacher().findStaff(StringUserInput)
										.assignClass(
												currentClass, this.basicmodel.getCd().getListOfClassRequirements());
							} catch (Exception e) {
								this.view.classError();
								Thread.sleep(300);
							}
							if (successfulAssignment) {
								this.view.confirmClass();
								Thread.sleep(300);
							} else {
								this.view.classError();
							}
						}
					}
					System.out.println("End of required classes, please contact PTT Director");
					this.runtimeAdmin();
				} else {
					this.view.noClassDirectors();
					this.basicmodel.newClassDirector();
					Thread.sleep(300);
					this.runtimeAdmin();
				}
			} else if (this.readInput == 2) {
				System.exit(0);
			} else {
				this.view.notValid();
				Thread.sleep(300);
				this.view.drawAdminSelect();
			}
		} while (this.readInput != 2);
	}

}