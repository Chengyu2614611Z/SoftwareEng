package Controller;

import java.util.Iterator;
import java.util.Scanner;

import Model.*;
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

    public void PttDirectorModule() throws InterruptedException {
        this.view.PttDirectorIndex();
        ListofAssignments Requests = new ListofAssignments(this.model.getListofTeacher());
        Requests.generateRequest();
        do {
            this.readInput = this.systemInput.nextInt();
            this.systemInput.nextLine();

            // press 1 to see and process requirement//
            if (this.readInput == 1) {
                do {
                    if (Requests.getRequest().isEmpty()) {
                        this.view.noTeachingRequests();
                        return;
                    } else {
                        for (String request : Requests.getRequest()) {
                            Thread.sleep(500);
                            this.view.approveRequestScreen();
                            System.out.println(request);

                            this.readInput = this.systemInput.nextInt();
                            this.systemInput.nextLine();
                            if (this.readInput == 1) {
                                this.model.getPtt().approveRequest(request);
                            } else if (this.readInput == 2) {
                                this.model.getPtt().declineRequest(request);
                            }
                        }
                        Requests.getRequest().clear();
                    }
                } while (!Requests.getRequest().isEmpty());

                System.out.println("Requests all been processed");
                this.model.getPtt().sendToFile();
            }

            // press any other key will return to main module
            else {
                this.view.drawMain();
                return;
            }
        } while (this.readInput >= 0);

    }

}
