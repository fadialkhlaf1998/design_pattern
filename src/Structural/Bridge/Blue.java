package Structural.Bridge;

public class Blue extends Color {
    @Override
    public void fill() {
        System.out.println("Blue");
        shape.Draw();
    }
}
