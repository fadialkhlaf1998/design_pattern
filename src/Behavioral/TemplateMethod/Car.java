package Behavioral.TemplateMethod;

public class Car extends VehicleTemplate{
    @Override
    protected void assembleComponents() {
        System.out.println("Components for CAR");
    }

    @Override
    protected void installGearBox() {
        System.out.println("GearBox for CAR");
    }
}
