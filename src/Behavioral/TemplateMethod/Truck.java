package Behavioral.TemplateMethod;

public class Truck extends VehicleTemplate{
    @Override
    protected void assembleComponents() {
        System.out.println("Components for TRUCK");
    }

    @Override
    protected void installGearBox() {
        System.out.println("GearBox for TRUCK");
    }
}
