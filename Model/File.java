package Model;

import java.io.*;
import java.util.ArrayList;

public class File {
    private ListofTeacher ListofTeacher;
    private String[] headers;
    private String[] attributes;
    private String classNames;

    public File() { // Constructor
        this.ListofTeacher = new ListofTeacher();
    }

    void readListofTeacher() { // reads cards from .txt file and creates card objects
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new java.io.File("TeacherList.txt").getAbsolutePath()));
            String read = null;
            read = br.readLine(); // reads first line of text into a string array
            this.headers = read.split("\\s+");
            while ((read = br.readLine()) != null) { // while there is another line in the txt file to read
                attributes = read.split("\\s+");
                this.ListofTeacher.add(new Teacher(attributes[0], attributes[1], Integer.parseInt(attributes[2]),
                        Boolean.parseBoolean(attributes[4])));
                classNames += attributes[1] + " ";
            }
            System.out.println("File successfully read.");
        }

        catch (FileNotFoundException e) {
            System.err.println("The file does not exist at the location.");
        } catch (IOException e) {
            System.err.println(
                    "file directory Wrong");
        }

        finally {
            System.out.println("***   File Reading Ended   ***");
        }
    }

    static void writeApprovedRequests(ArrayList<String> approvedRequests) { // reads cards from .txt file and creates
                                                                            // card objects
        BufferedWriter writter = null;
        java.io.File file = new java.io.File("ApprovedClasses.txt");

        try {
            writter = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
            writter.write("////////////////APPROVED TEACHING REQUESTS/////////////////\n"
                    + "==========================================\n\n");
            for (String request : approvedRequests) {
                writter.write(request);
            }
            writter.close();
            System.out.println("Successfully Adding request.");
        } catch (FileNotFoundException e) {
            System.err.println("The file does not exist at this location.");
        } catch (IOException e) {
            System.err.println(
                    "file directory Wrong");
        } finally {
            if (writter != null) {
                try {
                    writter.close();
                } catch (IOException e) {
                    System.err.println("Could not close file writer.");

                }
            }
            System.out.println("\"***   File Writing Ended   ***\"");
        }
    }

    // Getter methods
    public ListofTeacher getListofTeacher() {
        return this.ListofTeacher;
    }

    public String getClassNames() {
        return this.classNames;
    }
}