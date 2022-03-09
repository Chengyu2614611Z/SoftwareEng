package Controller;

import java.util.Scanner;

import Model.*;
import Model.Course;
import View.*;

public class PTTDirectorController {

    private BasicModel model;
    private AllView view;
    private Scanner systemInput = new Scanner(System.in); // User input instance
    private int readInput; // Holds user menu input for condition checks
    private int intChecker; // int for class creation and queries
    private String stringChecker; // String search query story
    private Class currentClass = null;

    public PTTDirectorController(BasicModel model, AllView view) {
        this.model = model;
        this.view = view;
        this.model.newPTTDirector();
    }

    public void runtimePTT() throws InterruptedException {

    }

}
