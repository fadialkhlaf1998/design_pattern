package Structural.Facade;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Staff staff = new Staff();
        customer.pay("visa");
        customer.pay("cash");

        staff.pay("visa");
        staff.pay("cash");
    }

}
