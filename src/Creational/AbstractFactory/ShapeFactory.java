package Creational.AbstractFactory;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Shape getShape(String type) {
        if(type.equals("square")){
            return new Square();
        }else {
            return new Rectangle();
        }
    }
}
