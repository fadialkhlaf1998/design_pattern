package Structural.FlyWeight;

import java.util.HashMap;

public class EmployeeFactory {
    static HashMap<String,Employee> map = new HashMap<String,Employee>();

    static Employee getEmployee(String type){
        Employee employee = null;
        if(map.get(type) != null){
            employee = map.get(type);
        }else {
            if(type.equals("Developer")){
                System.out.println("Developer Created");
                employee = new Developer();
            }else {
                System.out.println("Tester Created");
                employee = new Tester();
            }
            map.put(type,employee);
        }
        return employee;
    }
}
