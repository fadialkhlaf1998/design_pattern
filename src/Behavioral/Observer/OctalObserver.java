package Behavioral.Observer;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("convert Octal String: "+ this.subject.getState());
    }
}
