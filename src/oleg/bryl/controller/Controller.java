package oleg.bryl.controller;

import oleg.bryl.model.Model;
import oleg.bryl.view.View;

import java.util.Scanner;

public class Controller {
        private Model model;
        private View view;

    /**
     *
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void inputFromUser (){
        Scanner scanner = new Scanner(System.in);
        Model model = new Model(view, scanner);
        model.addUser();

    }
//    public void printOutput(){
//        System.out.println();
//
//    }

    public void printOutput(){
//        Scanner scanner = new Scanner(System.in);
//        ControllerUtility controllerUtility = new ControllerUtility(scanner, view);
//        model.addUser();
        view.printAllUser(model.allUsers());

    }

}
