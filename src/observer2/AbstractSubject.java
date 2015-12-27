package observer2;

import java.util.Vector;

/**
 * Created by lianle on 2015/12/27.
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> observerVector = new Vector<Observer>();
    @Override
    public void add(Observer observer) {
        observerVector.add(observer);
    }
    @Override
    public void del(Observer observer) {
        observerVector.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observerVector) {
            observer.update();
        }
    }
}
