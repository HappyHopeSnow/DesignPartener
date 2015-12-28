package Chain;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 16:13
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + ":dodo");
        if (getHandler() != null) {
            getHandler().operation();
        }

    }
}
