package command;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 17:27
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new CommandA(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
