package View;

import Model.*;
import View.*;

public class AllView {

	private BasicModel model;
	private AllView view;

	public AllView(BasicModel model) {
		this.model = model;
	}

	public void teacherModule() {
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("                Teahcer Module                 ");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("* *   View Personal Information(by his id) * * ");
		System.out.println();
	}

	public void teacherInfo() {
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("              Personal Information             ");
		System.out.println("* *  * * Press 1 to return teacher module * * *");
		System.out.println("* *  press 2 to View his/her assigned courses* ");
		System.out.println("* * * * * *Press any other key to quit)* * ** *");
		System.out.println();
	}

	public void NoteahcerAssiment() {
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" there is no assignment for you      ");
		System.out.println(" Press 1 to return to main module    ");
		System.out.println(" Press any other number to quit        ");
		System.out.println();
	}

	public void ShowteahcerAssiment() {
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("     Here are/is the assignment(s) for you     ");
		System.out.println();
	}

	public void drawAdminSelect() { // Admin Menu 1
		System.out.println();
		System.out.println("Administrator Access Mode");
		System.out.println("press 1 to View and assign class requirements");
		System.out.println("press 2 to Quit");
		System.out.println("-----------------------------------------------------");
	}

	public void AdminIndex() { // Admin Menu 2
		System.out.println();
		System.out.println("The teachers teaching this course");
		System.out.println("--------------------------------------------");
	}

	public void drawClassDirectorSelect() { // Class Director Menu 1
		System.out.println();
		System.out.println("Class Director Access Mode");
		System.out.println("press 1 to List of class requirements");
		System.out.println("press 2 to Quit");
		System.out.println("--------------------------------------------");
	}

	public void drawClassDirectorCreate() { // Class Director Menu 2
		System.out.println();
		System.out.println("	1. Add class requirement");
		System.out.println("	2. Remove class requirement");
		System.out.println("	3. Veiw All Requirement");
		System.out.println("	4. Return to CD Menu");
		System.out.println("------------------------------");
	}

	public void noClassDirectors() {
		System.out.println();
		System.out.println("There are currently no lists of requirements...");
		System.out.println("Please contact Class Director before progressing.");
	}

	public void showrequirement() {
		System.out.println();
		System.out.println("Here are the requiremnt");
		System.out.println("------------------------------");
	}

	public void drawAdminNameWait() {
		System.out.println();
		System.out.println("Type the name of teacher you want to arrange.");
	}

	public void readyToAssign() {
		System.out.println();
		System.out.println("To proceed making a class assignment enter Y...");
		System.out.println("Else enter a new search query...");
	}

	public void addClassRequirement() { // When class director wants to add class
		System.out.println();
		System.out.println("Please input a new course name");
	}

	public void addNumClasses() { // When class director wants to add class
		System.out.println();
		System.out.println("Please input time(From Monday to Firday)");
	}

	public void removeClassRequirement() { // When class director wants to remove a class
		System.out.println();
		System.out.println("Please input the course name you wanna delete");
	}

	public void gotoAdminModule() { // When class director wants to remove a class
		System.out.println();
		System.out.println("Press 2 to Go to Admin Module(adviced)");
		System.out.println("Press 3 to Go to PTT Module");
	}

	public void notValidMatch() { // String matching error
		System.out.println();
		System.out.println("The class title MUST match exactly to an existing class!");
	}

	public void PttDirectorIndex() {
		System.out.println();
		System.out.println("This is PttDirector Module");
		System.out.println("Press 1 to view requests");
		System.out.println("-----------------------------------------------------");
	}

	public void drawPTTDirectorSelect() { // PTT Director Menu 1
		System.out.println();
		System.out.println("PTT Director Access Mode");
		System.out.println();
		System.out.println("Press 1 to View and approve class assignments");
		System.out.println("Press 2 to Return to main menu");
		System.out.println("----------------------------------------------");
	}

	public void drawPTTDirectorApprove() { // PTT Director Menu 2
		System.out.println();
		System.out.println("There are requests that you can approve or disaprove");
		System.out.println("-----------------------------------------------------");
	}

	public void drawMain() { // Main/root menu
		System.out.println();
		System.out.println("press 1 to Class Director");
		System.out.println("press 2 to Administrator");
		System.out.println("press 3 to PTT Director");
		System.out.println("press 4 to Teacher");
		System.out.println("----------------------------------");
	}

	public void fileOutputConfirmation() {
		System.out.println();
		System.out.println("Writing to .txt file in root folder"); // change with actula filename
	}

	public void fileInputConfirmation() {
		System.out.println();
		System.out.println("Reading from .txt file in root folder"); // change with actula filename
	}

	public void fileError() {
		System.out.println();
		System.out.println("File read error..."); // change with actula filename
	}

	public void notValid() {
		System.out.println();
		System.out.println("Please select a valid menu option...");
	}

	public void noTeachingRequests() {
		System.out.println();
		System.out.println("There are no teaching requests to approve...");
	}

	public void approveRequestScreen() {
		System.out.println();
		System.out.println("Press 1 to approve | press 2 to disapprove.");
		System.out.println("----------------------------------");
	}
}