package observerscratch;

import observerscratch.controller.Controller;
import observerscratch.model.Model;
import observerscratch.view.View;

import javax.swing.SwingUtilities;

public class Application {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                runApp();
            }

        });
    }

    public static void runApp() {
        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(view, model);

        view.setLoginListener(controller);
    }

}
