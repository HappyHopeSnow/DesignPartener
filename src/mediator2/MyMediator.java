package mediator2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 10:28
 */
public class MyMediator implements Mediator {

    private User1 u1;
    private User2 u2;

    @Override
    public void createM() {
        u1 = new User1();
        u2 = new User2();
    }

    @Override
    public void workAll() {
        u1.work();
        u2.work();
    }
}
