package oleg.bryl.controller;

import oleg.bryl.view.View;

import java.util.Scanner;

public class ControllerUtility {
    private Scanner scanner;
    private View view;

    /**
     *
     * @param scanner
     * @param view
     */
    public ControllerUtility(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     *
     * @param message
     * @param regex
     * @return
     */
    public String inputValueFromScanner(String message, String regex){
        String inp;
        view.printInput(message);
        while (!(scanner.hasNext() && (inp = scanner.next()).matches(regex))){
            view.printInputIsWrong(message);
        }return inp;
    }

}
