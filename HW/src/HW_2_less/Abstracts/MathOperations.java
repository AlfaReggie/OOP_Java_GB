package HW_2_less.Abstracts;

import HW_2_less.Interface.Operations;

public abstract class MathOperations implements Operations {
    protected Double result;
    public MathOperations() {
        this.result = 0.0;
    }
    public abstract Double getResult(Double first_number, String operation, Double second_number);
}
