package Structural.FlyWeight;

public class Main {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Developer");
        employee.Task();
        Employee employee2 = EmployeeFactory.getEmployee("Developer");
        employee2.Task();
        Employee employee3 = EmployeeFactory.getEmployee("Tester");
        employee3.Task();
    }

}
