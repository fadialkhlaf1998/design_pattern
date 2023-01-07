package Structural.Facade;

public class FacadePayment implements Payment{
    String type;

    public FacadePayment(String type) {
        this.type = type;
    }

    @Override
    public void pay() {
        if(type.toLowerCase().equals("visa")){
            Payment p = new VisaPayment();
            p.pay();
        }else {
            Payment p = new CashPayment();
            p.pay();
        }
    }
}
