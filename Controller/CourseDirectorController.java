package Controller;

import java.util.Scanner;

import Model.*;
import Model.Course;
import View.*;

public class CourseDirectorController {

    BasicModel basicmodel;
    AllView view;
    private Scanner systemInput = new Scanner(System.in); // User input instance
    private int readInput; // Holds user menu input for condition checks
    private int intChecker; // int for class creation and queries
    private String stringChecker; // String search query story
    private Course currentClass = null;

    public CourseDirectorController(BasicModel model, AllView view) {
        this.basicmodel = model;
        this.view = view;
        this.basicmodel.newClassDirector();

    }

    public void ClassDirectorModule() throws InterruptedException {

        this.view.drawClassDirectorSelect();
        this.readInput = this.systemInput.nextInt();
        this.systemInput.nextLine();
        switch (this.readInput) {
            case 1: {

                this.view.drawClassDirectorCreate(); // CD Menu

                this.readInput = this.systemInput.nextInt();
                this.systemInput.nextLine();

                switch (this.readInput) {
                    case 1: {
                        this.view.addClassRequirement();
                        do {
                            this.stringChecker = this.systemInput.next(); // Checks string input
                            this.systemInput.nextLine();
                        } while (this.stringChecker.equals(""));
                        this.view.addNumClasses();
                        do {
                            this.intChecker = this.systemInput.nextInt(); // Check input hours
                            this.systemInput.nextLine();
                        } while (this.intChecker <= 0);
                        this.basicmodel.getCd().newClassRequirement(new Course(this.stringChecker, this.intChecker));
                        this.view.confirmClass();
                        Thread.sleep(500);
                        this.ClassDirectorModule();

                    }
                        break;

                    case 2: { // Remove class requirement
                        this.view.removeClassRequirement();
                        do {
                            this.stringChecker = this.systemInput.next();
                            this.systemInput.nextLine();
                        } while (this.stringChecker.equals(""));
                        try {
                            this.basicmodel.getCd().subClassRequirement(
                                    this.basicmodel.getCd().getListOfClassRequirements()
                                            .searchClass(this.stringChecker)); // finds
                            // Class
                            // to
                            // remove and then
                            // removes it
                        } catch (Exception e) {
                            this.view.classError();
                            Thread.sleep(300);
                            this.ClassDirectorModule();
                        }
                        this.view.confirmClass();
                        Thread.sleep(300);
                        this.ClassDirectorModule();
                    }
                        break;

                    case 3: // View current list of class requirements
                        this.view.showrequirement();
                        this.basicmodel.getCd().getListOfClassRequirements().print();
                        // this.stringChecker = this.systemInput.next();
                        // this.systemInput.nextLine();
                        // if (!stringChecker.equals("")) {
                        this.ClassDirectorModule();
                        // }
                        // replace with scanner to check if user wishes to exit

                        break;

                    case 4:
                        this.ClassDirectorModule();
                        break;

                    default:
                        this.view.notValid();
                        Thread.sleep(300);
                        this.ClassDirectorModule();

                }

            }
                break;

            case 2:
                this.view.gotoAdminModule();
                return;

            default:
                this.view.notValid();
                Thread.sleep(300);
                this.ClassDirectorModule();
        }

    }

}
