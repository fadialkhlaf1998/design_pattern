package Composite;

public class NumOp implements MathExp {
    double value;

    public NumOp(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
