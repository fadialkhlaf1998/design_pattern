package Behavioral.Observer;

public class HexObserver extends Observer{
    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("convert Hex String: "+ this.subject.getState());
    }
}
