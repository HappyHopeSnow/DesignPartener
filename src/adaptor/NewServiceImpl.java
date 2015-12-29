package adaptor;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 11:21
 */
public class NewServiceImpl extends Adaptor implements NewService {

    @Override
    public void action() {
        oldService.action();
        System.out.println("this is new service!");
    }
}
