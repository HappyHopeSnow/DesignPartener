package observer2;

/**
 * Created by lianle on 2015/12/27.
 */
public class ObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("B is doing");
    }
}
