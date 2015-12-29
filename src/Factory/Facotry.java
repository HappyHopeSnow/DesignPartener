package Factory;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 14:49
 */
public class Facotry {

    public User getUser(String type) {
        if ("1".equals(type)) {
            return new UserA("aaa", 20);
        }else {
            return new UserB("bbbb", 11);
        }


    }
}
