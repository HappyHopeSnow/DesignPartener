package AbstractoFactory2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 15:14
 */
public class Main {
    public static void main(String[] args) {
        Sender sms = new SendSmsFactory().product();
        sms.send();

        System.out.println("*****************");

        Sender mail = new SendMailFactory().product();
        mail.send();

    }
}
