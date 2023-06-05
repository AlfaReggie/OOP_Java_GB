package HW_2_less.Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToList extends HW_2_less.Abstracts.StringToList {

    @Override
    public List<String> StringToList(String user_inp) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < user_inp.length(); i++) {
            if ((Character.isDigit(user_inp.charAt(i)))) {
                stringBuilder.append(user_inp.charAt(i));
            } else if (Character.toString(user_inp.charAt(i)).equals("(")) {
                stringBuilder.append(user_inp.charAt(i) + " ");
            } else {
                stringBuilder.append(" " + user_inp.charAt(i) + " ");
            }
        }
        return new ArrayList<>(Arrays.asList(stringBuilder.toString().split(" ")));
    }
}
