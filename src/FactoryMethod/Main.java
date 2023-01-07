package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        factoryMethod.getClass("cash").pay();
    }

}
