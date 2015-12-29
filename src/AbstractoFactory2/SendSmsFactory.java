package AbstractoFactory2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 15:14
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender product() {
        return new SmsSender();
    }
}
