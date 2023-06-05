package HW_2_less;

import HW_2_less.Operations.DiffOperation;
import HW_2_less.Operations.DivOperation;
import HW_2_less.Operations.MultOperation;
import HW_2_less.Operations.SumOperation;

import java.util.List;

public class Calc {
    private Double result = 0.0;

    public Double getResult(List<String> expression) {
        switch (expression.get(1)) {
            case "+": SumOperation sumOperation = new SumOperation();
                result = sumOperation.Operation(Double.parseDouble(expression.get(0)),
                    Double.parseDouble(expression.get(2)));
                break;
            case "-": DiffOperation diffOperation = new DiffOperation();
                result = diffOperation.Operation(Double.parseDouble(expression.get(0)),
                    Double.parseDouble(expression.get(2)));
                break;
            case "*": MultOperation multOperation = new MultOperation();
                result = multOperation.Operation(Double.parseDouble(expression.get(0)),
                        Double.parseDouble(expression.get(2)));
                break;
            case "/": DivOperation divOperation = new DivOperation();
                result = divOperation.Operation(Double.parseDouble(expression.get(0)),
                        Double.parseDouble(expression.get(2)));
        }
        return result;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "result=" + result +
                '}';
    }
}


    /*public String result(List<String> userList) {
        if (userList.contains("(")) {
            List<String> new_expression = new ArrayList<>();
            for (int i = userList.indexOf("(") + 1; i < userList.indexOf(")"); i++) {
                new_expression.add(userList.get(i));
            }
            String prep_res = result(new_expression);
            userList = (userList.subList(0, userList.indexOf("(")));
            userList.add(prep_res);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < userList.size(); j++) {
            stringBuilder.append(userList.get(j));
            stringBuilder.append(userList.get(j+1));
            if (j % 2 != 0) {
                if (userList.get(j).contains("+")) {
                    SumOperation sumOperation = new SumOperation();
                    stringBuilder.append(sumOperation.Operation(Double.parseDouble(userList.get(j - 1)),
                            Double.parseDouble(userList.get(j + 1))));
                } else if (userList.get(j).contains("-")) {
                    SumOperation sumOperation = new SumOperation();
                    stringBuilder.append(sumOperation.Operation(Double.parseDouble(userList.get(j - 1)),
                            Double.parseDouble(userList.get(j + 1))));
                }
            }
        }
        return stringBuilder.toString();*/