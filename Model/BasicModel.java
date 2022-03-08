package Model;

public class BasicModel {
    CourseDirector cd;
    PTTDirector ptt;
    Admin admin;
    Model.File file = new Model.File();
    ListofTeacher listofTeacher;

    // must make it possible to have multiple class directors

    public BasicModel() {
        try {
            this.ReadFile();
        } catch (Exception e) {
            System.out.print("***    Can not read file    ***");
        }
    }

    public void ReadFile() {
        this.file.readListofTeacher();
        this.listofTeacher = this.file.getListofTeacher();
    }

    public void newClassDirector() { // Creates temp object for user sessions
        this.cd = new CourseDirector();
    }

    public void newPTTDirector() { // Creates temp object for user session
        this.ptt = new PTTDirector();
    }

    public void newAdmin() { // Creates temp object for user session
        this.admin = new Admin();
    }

    public CourseDirector getCd() {
        return this.cd;
    }

    public PTTDirector getPtt() {
        return this.ptt;
    }

    public Admin getAdmin() {
        return this.admin;
    }

    public Model.File getFile() {
        return this.file;
    }

    public ListofTeacher getListofTeacher() {
        return this.getListofTeacher();
    }
}
