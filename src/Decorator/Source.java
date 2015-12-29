package Decorator;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 13:54
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the origin method");
    }
}
