package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        OctalObserver octalObserver = new OctalObserver(subject);
        HexObserver hexObserver = new HexObserver(subject);
        subject.setState(1);
    }
}
