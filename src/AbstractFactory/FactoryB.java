package AbstractFactory;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 14:59
 */
public class FactoryB implements Factory{

    @Override
    public User getUser() {
        return new User();
    }
}
