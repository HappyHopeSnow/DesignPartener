package AbstractoFactory2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 15:12
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Mail sender ...");
    }
}
