package Decorator;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 13:56
 */
public class Main {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Source());
        decorator.method();
    }
}
