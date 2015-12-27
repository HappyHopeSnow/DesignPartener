package observer2;

/**
 * Created by lianle on 2015/12/27.
 */
public class ObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("A is doing");
    }
}
