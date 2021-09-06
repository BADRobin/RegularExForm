package oleg.bryl.view;

//import oleg.bryl.model.User;

import java.util.Locale;
import java.util.ResourceBundle;

import static oleg.bryl.view.InputForm.INPUT_DATA;
import static oleg.bryl.view.InputForm.WRONG_DATA;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
            new Locale("ua", "UA"));
//            new Locale("en"));

    public void printMassage(String message) {
        System.out.println(message);
    }

    public String combineString(String... massage) {
        StringBuilder comString = new StringBuilder();
        for (String s : massage) {
            comString = comString.append(s);
        }
        return new String(comString);
    }

    public void printInput(String message) {
        printMassage(combineString(bundle.getString(INPUT_DATA),
                                   bundle.getString(message)));
    }

    public void printInputIsWrong(String message) {
        printMassage(combineString(bundle.getString(WRONG_DATA),
                                   bundle.getString(INPUT_DATA),
                                   bundle.getString(message)));
    }

}
