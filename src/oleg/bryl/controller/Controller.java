package oleg.bryl.controller;

import oleg.bryl.model.Model;
import oleg.bryl.model.User;
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
//        System.out.println(model.print());
        User user = getUser(model);
        System.out.println(user);
        }

        private User getUser(Model model){
            User user  = null;
            while (true){
                try{
                    user = new User(model.getFullName(), model.getNickName(), model.getComment(), model.getGroups(),
                            model.getFullPhonesNumber(), model.getEmail(), model.getSkype(), model.getFullAddress(),
                            model.getCreation(), model.getModification());
                    break;
                } catch (SkypeNameIsRegistered e){
                        e.printStackTrace();
                    System.out.println("It's Skype Name already created:  " + e.getSkypeDate() );
                    model.addUser();
                }
            }
            return user;
        }

//    public void printOutput(){
//        System.out.println();
//
//    }

//    public void printOutput(){
//        Scanner scanner = new Scanner(System.in);
////        ControllerUtility controllerUtility = new ControllerUtility(scanner, view);
//        Model model = new Model(view, scanner);
//        model.addUser();
//        view.printAllUser(model.getUsers());
//    }

}
