package Controller;

import java.util.Scanner;

import Model.*;
import Model.Course;
import View.*;

public class CourseDirectorController {

    private BasicModel model;
    private AllView view;
    private Scanner systemInput = new Scanner(System.in); // User input instance
    private int readInput; // Holds user menu input for condition checks
    private int intChecker; // int for class creation and queries
    private String stringChecker; // String search query story
    private Class currentClass = null;

    public CourseDirectorController(BasicModel model, AllView view) {
        this.model = model;
        this.view = view;
    }

    public void runtimeClassDirector() throws InterruptedException {
        this.view.drawClassDirectorSelect();
        this.readInput = this.systemInput.nextInt();
        this.systemInput.nextLine();
        if (this.readInput == 1) {
            this.model.getCd().getListOfClassRequirements().print();
            this.view.drawClassDirectorCreate(); // CD Menu
            do {
                this.readInput = this.systemInput.nextInt();
                this.systemInput.nextLine();
                if (this.readInput == 1) { // Add class requirement
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
                    // try {
                    this.model.getCd().newClassRequirement(new Course(this.stringChecker, this.intChecker)); // this
                                                                                                             // should
                    // create a
                    // new Class
                    // in class
                    // requirements
                    // } catch (Exception e) {
                    // this.view.classError();
                    // Thread.sleep(500);
                    // this.runtimeClassDirector();
                    // }
                    this.view.confirmClass();
                    Thread.sleep(500);
                    this.runtimeClassDirector();

                } else if (this.readInput == 2) { // Remove class requirement
                    this.view.removeClassRequirement();
                    do {
                        this.stringChecker = this.systemInput.next();
                        this.systemInput.nextLine();
                    } while (this.stringChecker.equals(""));
                    try {
                        this.model.getCd().subClassRequirement(
                                this.model.getCd().getListOfClassRequirements().searchClass(this.stringChecker)); // finds
                                                                                                                  // Class
                                                                                                                  // to
                        // remove and then
                        // removes it
                    } catch (Exception e) {
                        this.view.classError();
                        Thread.sleep(300);
                        this.runtimeClassDirector();
                    }
                    this.view.confirmClass();
                    Thread.sleep(300);
                    this.runtimeClassDirector();
                } else if (this.readInput == 3) { // View current list of class requirements
                    this.runtimeClassDirector(); // replace with scanner to check if user wishes to exit
                } else {
                    this.view.notValid();
                    Thread.sleep(300);
                    this.runtimeClassDirector();
                }
            } while (this.readInput != 4);
        } else if (this.readInput == 2) {
            System.exit(0);
        } else {
            this.view.notValid();
            Thread.sleep(300);
            this.runtimeClassDirector();
        }

    }

}
