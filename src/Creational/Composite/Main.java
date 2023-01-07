package Creational.Composite;

public class Main {

    public static void main(String[] args) {
        MathExp mathExp = new ComOp(new ComOp(new NumOp(1),new NumOp(1),'+'),
                new ComOp(new NumOp(2),new NumOp(2),'+'),'+');
        System.out.println(mathExp.getValue());
    }

}
