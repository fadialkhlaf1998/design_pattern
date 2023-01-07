package visitor;

public class TaxVisitor implements Visitor{
    @Override
    public void visit(Fruit fruit) {
        System.out.println(fruit.price * 20 / 100);
    }
}
