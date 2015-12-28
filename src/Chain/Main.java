package Chain;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 16:14
 */
public class Main {
    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("one");
        MyHandler h2 = new MyHandler("two");
        MyHandler h3 = new MyHandler("three");

        h1.setHandler(new MyHandler("h2"));
        h2.setHandler(h3);

        h1.operation();
    }
}
