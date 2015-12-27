package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianle on 2015/12/26.
 */
public abstract class AbstractSubject implements Subject{
    public List<Observer> observerList = new ArrayList<Observer>();
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void delObserver(Observer observer){
        observerList.remove(observer);
    }
    public void notifyAllObserver(){
        for (Observer observer : observerList) {
            observer.observerAction();
        }
    }
}
