package observer2;

/**
 * Created by lianle on 2015/12/27.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new ObserverA());
        subject.add(new ObserverA());
        subject.add(new ObserverB());

        subject.operation();
    }
}
