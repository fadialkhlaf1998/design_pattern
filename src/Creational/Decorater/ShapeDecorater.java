package Creational.Decorater;

public class ShapeDecorater implements Shape{
    Shape shape;

    public ShapeDecorater(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
