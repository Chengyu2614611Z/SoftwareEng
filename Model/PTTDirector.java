package Model;

import java.util.ArrayList;

public class PTTDirector {
    private ListofAssignments teachingRequests;
    private ArrayList approvedRequests;
    private ArrayList unapprovedRequests;

    public PTTDirector() {
        this.approvedRequests = new ArrayList<String>();
        this.unapprovedRequests = new ArrayList<String>();
    }

    public void approveRequest(String teachingRequest) {
        this.approvedRequests.add(teachingRequest);
    }

    public void declineRequest(String teachingRequest) {
        this.unapprovedRequests.add(teachingRequest);
    }

    public void sendToFile() {
        if (!approvedRequests.isEmpty()) {
            File.writeApprovedRequests(this.approvedRequests);
        } else {
            System.err.println("No Request to Write to File");
        }

    }

}