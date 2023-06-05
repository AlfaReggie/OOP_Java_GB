package HW_2_less.Abstracts;

import java.util.List;

public abstract class StringToList {
    public List<String> user_list;
    public String user_inp;

    protected List<String> StringToList (String user_inp) {
        return this.user_list;
    }
}
