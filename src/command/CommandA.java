package command;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 17:26
 */
public class CommandA implements Command {

    private Receiver receiver;

    public CommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void operation() {
        receiver.exe();
    }
}
