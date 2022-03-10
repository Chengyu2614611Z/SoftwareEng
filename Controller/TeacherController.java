package Controller;

import java.util.Scanner;

import Model.*;
import View.*;

public class TeacherController {

    BasicModel basicmodel;
    AllView view;
    private Scanner systemInput = new Scanner(System.in); // User input instance
    private int readInput = 1; // Holds user menu input for condition checks
    private int IntUserInput; // int for class creation and queries
    private String StringUserInput; // String search query story
    private Course currentClass = null;

    public TeacherController(BasicModel model, AllView view) {
        this.basicmodel = model;
        this.view = view;
    }

    public void TeacherModule() throws InterruptedException {
        while (readInput != 0) {
            this.view.teacherModule();

            readInput = systemInput.nextInt();
            this.basicmodel.newTeacher(readInput);

            switch (this.readInput) {
                case 0:
                    System.exit(0);
                    break;
                default:
                    this.view.teacherInfo();
                    this.basicmodel.getTeacher().print();
                    readInput = systemInput.nextInt();
                    if (this.readInput == 1) {
                        this.TeacherModule();
                    } else if (this.readInput == 2) {
                        if (this.basicmodel.getTeacher().getAssignedClasses().isEmpty()) {
                            this.view.NoteahcerAssiment();
                            readInput = systemInput.nextInt();
                            if (this.readInput == 1) {
                                this.TeacherModule();
                            } else {
                                return;
                            }
                        }
                    }

            }
        }
    }

}