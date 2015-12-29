package adaptor2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 11:29
 */
public class MyTarget extends Source implements Target {

    @Override
    public void method2() {
        System.out.println("method 2 is doing !");
    }
}
