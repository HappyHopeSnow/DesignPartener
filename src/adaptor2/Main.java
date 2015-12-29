package adaptor2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 11:28
 */
public class Main {
    public static void main(String[] args) {
        Target target = new MyTarget();
        Source source = new Source();
        source.method1();
        System.out.println("*****************");
        target.method1();
        target.method2();
    }
}
