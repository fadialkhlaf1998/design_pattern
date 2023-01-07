package AbstractFactory;

public class ColorFactory implements AbstractFactory{
    @Override
    public Color getColor(String type) {
        if(type.equals("red")){
            return new Red();
        }else {
            return new Blue();
        }
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
