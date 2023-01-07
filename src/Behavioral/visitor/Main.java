package Behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit(100);
        fruit.accept(new TaxVisitor());
    }

}
