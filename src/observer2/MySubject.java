package observer2;

/**
 * Created by lianle on 2015/12/27.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("my sub dodo");
        notifyObservers();
    }
}
