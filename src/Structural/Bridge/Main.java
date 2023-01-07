package Structural.Bridge;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        Color color = new Red();
        color.shape = shape;
        color.fill();
    }

}
