package observer;

/**
 * Created by lianle on 2015/12/26.
 */
public interface Subject {
    void addObserver(Observer observer);
    void delObserver(Observer observer);
    void notifyAllObserver();
    void operation();
}
