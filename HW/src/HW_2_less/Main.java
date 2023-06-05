package HW_2_less;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringToList stringToList = new StringToList();
        Calc calc = new Calc();
        System.out.println(calc.getResult(stringToList.StringToList("1+24")));
        System.out.println(calc.getResult(stringToList.StringToList("1-24")));
        System.out.println(calc.getResult(stringToList.StringToList("1*24")));
        System.out.println(calc.getResult(stringToList.StringToList("1/24")));
    }

}



