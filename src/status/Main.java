package status;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 18:01
 */
public class Main {
    public static void main(String[] args) {

        Status status = new Status();
        status.setValue("2");
        Context context = new Context(status);

        context.action();


    }
}
