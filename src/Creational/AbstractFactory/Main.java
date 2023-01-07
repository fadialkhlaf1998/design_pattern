package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ShapeFactory();
        abstractFactory.getShape("square").draw();
        AbstractFactory abstractFactory2 = new ColorFactory();
        abstractFactory2.getColor("red").fill();
    }
}
