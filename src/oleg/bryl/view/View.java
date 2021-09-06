package oleg.bryl.view;


import oleg.bryl.model.Model;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static oleg.bryl.view.InputForm.INPUT_DATA;
import static oleg.bryl.view.InputForm.WRONG_DATA;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";


    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
            new Locale("ua", "UA"));
//            new Locale("en"));
    String DATE_CREATION = bundle.getString("date_creation");
    String DATE_MODIFICATION = bundle.getString("date_modification");
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

    public void printAllUser(List<Model> user) {

        for (int i = 1; i < user.size(); i++) {
            System.out.print(i + 1 + " ");
            System.out.println(user.get(i).getFullName());
            System.out.println(user.get(i).getHomePhone());
            System.out.println(user.get(i).getMobilePhone());
            System.out.println(user.get(i).getFullAddress());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
            System.out.println(DATE_CREATION + dateFormat.format(user.get(i).getCreation()));
            System.out.println(DATE_MODIFICATION + dateFormat.format(user.get(i).getModification()));

        }
    }

}
