import Model.*;
import Controller.*;
import View.*;

public class test {
    public static void main(String[] args) throws InterruptedException {
        BasicModel model = new BasicModel();
        AllView view = new AllView(model);
        CourseDirectorController controller = new CourseDirectorController(model, view);

        controller.ClassDirectorModule();
    }
}