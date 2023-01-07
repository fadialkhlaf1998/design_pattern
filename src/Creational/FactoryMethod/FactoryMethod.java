package Creational.FactoryMethod;

public class FactoryMethod {
    Payment getClass(String type){
        if(type.equals("cash")){
            return new CashPayment();
        }else {
            return new CreditPayment();
        }
    }
}
