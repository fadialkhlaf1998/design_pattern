package Creational.Decorater;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape1 = new RedCircle(shape);
        shape1.draw();
    }
}
