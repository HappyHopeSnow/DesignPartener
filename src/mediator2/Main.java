package mediator2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 10:27
 */
public class Main {
    public static void main(String[] args) {

        Mediator mediator = new MyMediator();
        mediator.createM();
        mediator.workAll();
    }
}
