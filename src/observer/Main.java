package observer;

/**
 * Created by lianle on 2015/12/26.
 */
public class Main {
    public static void main(String[] args) {
        AbstractSubject abstractSubject = new MySubject();
        abstractSubject.addObserver(new ObserverA());
        abstractSubject.addObserver(new ObserverB());

        abstractSubject.operation();
    }
}
