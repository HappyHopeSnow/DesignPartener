package Interpreter;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 10:41
 */
public class Main {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Interpreter interpreter = new AddInterpreter();
        int result = interpreter.exe(num1, num2);
        System.out.println("result=" + result);

        interpreter = new PlusInterpreter();
        System.out.println("result2 = " + interpreter.exe(num1, num2));

    }
}
