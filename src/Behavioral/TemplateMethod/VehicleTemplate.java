package Behavioral.TemplateMethod;

public abstract class VehicleTemplate {

    public final void buildVehicle(){
        collectComponents();
        assembleComponents();
        installGearBox();
        startVehicle();
        System.out.println("Vehicle Done");
    }

    private void collectComponents() {
        System.out.println("Components is collected");
    }
    protected abstract void assembleComponents();
    protected abstract void installGearBox();
    private void startVehicle() {
        System.out.println("Engine is started");
    }
}
