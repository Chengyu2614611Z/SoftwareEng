package Controller;

import java.util.Scanner;

import Model.*;
import View.*;

public class AdminController {

	BasicModel basicmodel;
	AllView view;
	private Scanner systemInput = new Scanner(System.in); // User input instance
	private int readInput = 1; // Holds user menu input for condition checks
	private int IntUserInput; // int for class creation and queries
	private String StringUserInput; // String search query story
	private Course currentClass = null;

	public AdminController(BasicModel model, AllView view) {
		this.basicmodel = model;
		this.view = view;
	}

	public void AdminModule() throws InterruptedException {

		// When administrator menu option chosen
		this.view.drawAdminSelect();
		this.readInput = this.systemInput.nextInt();
		this.systemInput.nextLine();

		switch (this.readInput) {
			case 1: {

				while (this.basicmodel.getCd().getListOfClassRequirements().getit().hasNext()) {

					currentClass = this.basicmodel.getCd().getListOfClassRequirements().getit().next(); // current
																										// //
																										// assigned
					System.out.println();

					currentClass.print(); // print Class requirement 1..n

					this.view.AdminIndex();
					this.StringUserInput = this.systemInput.next();
					this.systemInput.nextLine();
					this.basicmodel.getListofTeacher().find(StringUserInput); // allow admin to search for
																				// appropriate staff
					// Thread.sleep(1000);
					this.view.readyToAssign();
					this.StringUserInput = this.systemInput.next();
					this.systemInput.nextLine();

					boolean successfulAssignment = false;
					while (!successfulAssignment) {
						this.view.drawAdminNameWait();
						this.StringUserInput = this.systemInput.next();
						this.systemInput.nextLine();
						try {
							//
							this.basicmodel.getListofTeacher().findAccordingtoName(StringUserInput).train();
							this.basicmodel.getListofTeacher().findAccordingtoName(StringUserInput)
									.assignClass(currentClass,
											this.basicmodel.getCd().getListOfClassRequirements());
							successfulAssignment = true;
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
				this.AdminModule();

			}
				break;

			case 2:
				return;
			default:
				this.AdminModule();
				break;

		}

	}

}