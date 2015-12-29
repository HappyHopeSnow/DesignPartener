package mediator;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 10:18
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator(new MyUser1(), new MyUser2());
        mediator.hello();
    }
}
