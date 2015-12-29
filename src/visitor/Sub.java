package visitor;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 9:54
 */
public interface Sub {
    void accept(Visitor visitor);
    String getSubject();
}
