package observerscratch.controller;

import observerscratch.model.Model;
import observerscratch.view.LoginFormEvent;
import observerscratch.view.LoginListener;
import observerscratch.view.View;

public class Controller implements LoginListener {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());

    }
}
