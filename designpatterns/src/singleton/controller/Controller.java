package singleton.controller;

import singleton.model.Model;
import singleton.view.LoginFormEvent;
import singleton.view.LoginListener;
import singleton.view.View;

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
