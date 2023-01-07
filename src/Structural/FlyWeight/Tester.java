package Structural.FlyWeight;

public class Tester implements Employee{
    String job;
    String skill;
    public Tester(){
        job = "Testing";
    }
    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void Task() {
        System.out.println("Tester Task Done");
    }
}