package oleg.bryl;

import oleg.bryl.controller.Controller;
import oleg.bryl.model.Model;
import oleg.bryl.view.View;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args){
            Controller controller = new Controller(new Model(), new View());

        controller.inputFromUser();
//        controller.printOutput();
    }
}
