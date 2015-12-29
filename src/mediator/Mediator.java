package mediator;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 10:10
 */
public class Mediator {
    private MyUser1 user1;
    private MyUser2 user2;

    public Mediator(MyUser1 user1, MyUser2 user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public void hello(){
        user1.run();
        user2.run();
    }
}
