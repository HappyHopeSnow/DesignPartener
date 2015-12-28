package command;

/**
 * Description: <br>
 * 调用者
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 17:23
 */
public class Invoker {
    Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        command.operation();
    }
}
