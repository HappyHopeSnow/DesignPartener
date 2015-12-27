package observer;

/**
 * Created by lianle on 2015/12/26.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("My Subject");
        notifyAllObserver();
    }
}
