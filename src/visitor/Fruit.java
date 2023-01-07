package visitor;

public class Fruit implements Visitable{
    double price;

    public Fruit(double price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
