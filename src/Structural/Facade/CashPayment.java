package Structural.Facade;

public class CashPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Cash");
    }
}
