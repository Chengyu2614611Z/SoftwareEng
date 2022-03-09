import Model.*;

import java.util.Scanner;

import Controller.*;
import View.*;

public class test {
    public static void main(String[] args) throws InterruptedException {
        BasicModel model = new BasicModel();
        AllView view = new AllView(model);

        Controller controller = new Controller(model, view);

        // Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();
        controller.MainModule();

    }
}