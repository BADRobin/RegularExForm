package oleg.bryl.controller;

import oleg.bryl.model.Model;
import oleg.bryl.view.View;

import java.util.Scanner;

public class Controller {
        private Model model;
        private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void inputFromUser (){
        Scanner scanner = new Scanner(System.in);
        User user = new User(view, scanner);
        user.addUser();

    }

}
