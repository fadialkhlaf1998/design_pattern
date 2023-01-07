package Structural.Facade;

public class Customer {

    void pay(String type){
        FacadePayment facadePayment = new FacadePayment(type);
        facadePayment.pay();
    }
}
