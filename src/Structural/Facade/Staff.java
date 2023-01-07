package Structural.Facade;

public class Staff {
    void pay(String type){
        FacadePayment facadePayment = new FacadePayment(type);
        facadePayment.pay();
    }
}
