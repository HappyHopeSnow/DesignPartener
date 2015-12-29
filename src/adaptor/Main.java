package adaptor;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 11:20
 */
public class Main {
    public static void main(String[] args) {
        OldService old = new OldServiceImpl();
        old.action();
        System.out.println("*******************");

        Adaptor adaptor = new NewServiceImpl();
        adaptor.setOldService(old);
        adaptor.action();

    }
}
