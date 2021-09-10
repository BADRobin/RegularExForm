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
        User user = getUser(model);
        System.out.println(user);
        }

    /**
     *
     * @param model
     * @return
     */
        private User getUser(Model model){
            User user  = null;
            while (true){
                try{
                    user = new User(model.getFirstName(), model.getName(), model.getMiddleName(), model.getNickName(),
                            model.getComment(), model.getGroups(), model.getHomePhone(), model.getMobilePhone(),
                            model.getMobilePhone2(), model.getEmail(), model.getSkype(), model.getAddressIndex(),
                            model.getCity(), model.getStreet(), model.getHomeNumber(), model.getRoomNumber(), model.getHomeNumber(),
                            model.getCreation(), model.getModification()) ;

                    break;
                } catch (AlreadyRegistered e){
                        e.printStackTrace();
                    System.out.println("It's First Name already created:  " + e.addFirstName() );
                    System.out.println("It's First Name already created:  " + e.addName() );
                    System.out.println("It's First Name already created:  " + e.addMiddleName() );
                    System.out.println("It's First Name already created:  " + e.addNickName() );
                    System.out.println("It's First Name already created:  " + e.addHomePhone() );
                    System.out.println("It's First Name already created:  " + e.addMobilePhone() );
                    System.out.println("It's First Name already created:  " + e.addMobilePhone2() );
                    System.out.println("It's First Name already created:  " + e.addEmail() );
                    System.out.println("It's First Name already created:  " + e.addSkype() );
                    model.addFirstName();
                }
            }
            return user;
        }

}
