package FactoryMethod;

public class CreditPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Credit");
    }
}
