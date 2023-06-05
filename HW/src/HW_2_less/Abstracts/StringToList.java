package HW_2_less.Abstracts;

import java.util.List;

public abstract class StringToList {
    private String user_inp;
    private List<String> user_list;
    protected List<String> StringToList (String user_inp) {
        return user_list;
    }

    public void setUser_inp(String user_inp) {
        this.user_inp = user_inp;
    }
}
