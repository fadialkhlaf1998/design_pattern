package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        InernetServiceProvider inernetServiceProvider = new Proxy();
        String result = inernetServiceProvider.getSite("facebook");
        System.out.println(result);
    }
}
