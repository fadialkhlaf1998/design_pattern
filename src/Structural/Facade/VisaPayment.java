package Structural.Facade;

public class VisaPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Visa");
    }
}
