package observer2;

/**
 * Created by lianle on 2015/12/27.
 */
public interface Subject {
    void add(Observer observer);
    void del(Observer observer);
    void notifyObservers();
    void operation();
}
