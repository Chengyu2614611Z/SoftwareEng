package Controller;

import java.util.Scanner;

import Model.BasicModel;
import View.AllView;

public class Controller {
    AdminController adminController;
    CourseDirectorController courseDirectorController;
    PTTDirectorController pttDirectorController;
    BasicModel model;
    AllView view;

    private Scanner sc = new Scanner(System.in); // User input instance
    private int IntUserInput; // int for class creation and queries

    public Controller(BasicModel model, AllView view) {
        this.model = model;
        this.view = view;
        courseDirectorController = new CourseDirectorController(model, view);
        adminController = new AdminController(model, view);
    }

    public void MainModule() throws InterruptedException {
        do {
            this.IntUserInput = this.sc.nextInt();
            switch (this.IntUserInput) {
                case 1:
                    this.courseDirectorController.ClassDirectorModule();
                    break;
                case 2:
                    this.adminController.AdminModule();
                    break;
                // case 3:
                // this.pttDirectorController.PttDirectorModule();
                default:
                    this.MainModule();
            }
        } while (this.IntUserInput != 8);

    }
}
