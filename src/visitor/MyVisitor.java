package visitor;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 9:54
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Sub sub) {
        System.out.println("subject is=" + sub.getSubject());
    }
}
