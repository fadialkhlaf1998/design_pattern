package Structural.Bridge;

public class Red extends Color {
    @Override
    public void fill() {
        System.out.println("Red");
        shape.Draw();
    }
}
