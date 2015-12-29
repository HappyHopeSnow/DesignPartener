package Factory;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 14:53
 */
public class Main {
    public static void main(String[] args) {
        Facotry facotry = new Facotry();
        User u1 = facotry.getUser("1");
        u1.run();

        System.out.println("**********");

        User u2 = facotry.getUser("2");
        u2.run();
    }
}
