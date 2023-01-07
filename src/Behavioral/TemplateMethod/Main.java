package Behavioral.TemplateMethod;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        car.buildVehicle();
        truck.buildVehicle();
    }

}
