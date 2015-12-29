package AbstractoFactory2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 15:13
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender product() {
        return new MailSender();
    }
}
