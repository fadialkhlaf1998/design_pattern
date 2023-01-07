package Composite;

public class ComOp implements MathExp{
    MathExp mathExp_1;
    MathExp mathExp_2;
    char sign;

    public ComOp(MathExp mathExp_1, MathExp mathExp_2, char sign) {
        this.mathExp_1 = mathExp_1;
        this.mathExp_2 = mathExp_2;
        this.sign = sign;
    }

    @Override
    public double getValue() {
        if( sign == '+'){
            return mathExp_1.getValue() + mathExp_2.getValue();
        }else if( sign == '-'){
            return mathExp_1.getValue() - mathExp_2.getValue();
        }else if( sign == '*'){
            return mathExp_1.getValue() * mathExp_2.getValue();
        }else {
            return mathExp_1.getValue() / mathExp_2.getValue();
        }
    }
}
