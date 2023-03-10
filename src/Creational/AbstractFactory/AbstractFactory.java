package Creational.AbstractFactory;

public interface AbstractFactory {
    public Color getColor(String type);
    public Shape getShape(String type);
}
