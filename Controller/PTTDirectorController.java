package Controller;

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
        ListofAssignments Requests = new ListofAssignments(this.model.getListofTeacher());
        Requests.generateRequest();

        do {
            this.readInput = this.systemInput.nextInt();
            this.systemInput.nextLine();
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
                                // teachingRequests.getTeachingRequests().remove(request);
                            } else if (this.readInput == 2) {
                                this.model.getPtt().declineRequest(request);
                            }
                        }
                        Requests.getRequest().clear();
                    }
                } while (!Requests.getRequest().isEmpty());

                System.out.println("All available teaching requests have been reviewed...");
                Thread.sleep(1000);
                System.out.println("Writing to File...");
                this.model.getPtt().sendToFile();
            }
            return;
        } while (this.readInput != 2);

    }

}
