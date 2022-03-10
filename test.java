import Model.*;

import Controller.*;
import View.*;

public class test {
    public static void main(String[] args) throws InterruptedException {
        BasicModel model = new BasicModel();
        AllView view = new AllView(model);

        Controller controller = new Controller(model, view);

        controller.MainModule();

    }
}