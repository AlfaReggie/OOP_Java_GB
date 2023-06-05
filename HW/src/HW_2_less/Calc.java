package HW_2_less;

import HW_2_less.Abstracts.MathOperations;

public class Calc extends MathOperations {
    private Double result_ex = 0.0;
    public Calc() {
        super();
    }

    @Override
    public Double getResult(Double first_number, String operation, Double second_number) {
        switch (operation) {
            case "+":
                result_ex = sum(first_number, second_number);
                break;
            case "-":
                result_ex = diff(first_number, second_number);
                break;
            case "*":
                result_ex = mult(first_number, second_number);
                break;
            case "/":
                result_ex = div(first_number, second_number);
                break;
        }
        return result_ex;
    }

    @Override
    public Double sum(Double first_number, Double second) {
        return first_number + second;
    }

    @Override
    public Double diff(Double first_number, Double second) {
        return first_number - second;
    }

    @Override
    public Double mult(Double first_number, Double second) {
        return first_number * second;
    }

    @Override
    public Double div(Double first_number, Double second) {
        return first_number / second;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "result=" + result_ex +
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