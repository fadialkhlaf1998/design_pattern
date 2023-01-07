package Structural.FlyWeight;

public class Developer implements Employee{
    String job;
    String skill;
    public Developer(){
        job = "Development";
    }
    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void Task() {
        System.out.println("Developer Task Done");
    }
}

