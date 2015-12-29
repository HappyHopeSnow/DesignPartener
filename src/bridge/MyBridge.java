package bridge;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 14:09
 */
public class MyBridge extends Bridge {

    public void method() {
        getSourceable().method();
    }
}
