package HW_2_less;

import HW_2_less.Abstracts.MathOperations;
import HW_2_less.Interface.Operations;
import HW_2_less.Operations.StringToList;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Calc calculator = new Calc();
        StringToList stringToList = new StringToList();
        List<String> exe = stringToList.StringToList("2/3");
        System.out.println(calculator.getResult(Double.parseDouble(exe.get(0)), exe.get(1),
                Double.parseDouble(exe.get(2))));
    }
}



