package Creational.Decorater;

public class RedCircle extends ShapeDecorater{
    public RedCircle(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        fillRed();
    }

    public void fillRed(){
        System.out.println("Red");
    }
}
