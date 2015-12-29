package bridge;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 14:08
 */
public class Main {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        Sourceable sourceable = new Source();
        bridge.setSourceable(sourceable);
        bridge.method();
    }
}
