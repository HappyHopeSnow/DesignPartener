package Interpreter;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 10:39
 */
public class AddInterpreter implements Interpreter {

    @Override
    public int exe(int num1, int num2) {
        return num1 + num2;
    }
}
