package visitor;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 9:47
 */
public class Main {
    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Sub sub = new MySub();
        sub.accept(visitor);
    }
}
