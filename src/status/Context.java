package status;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 18:04
 */
public class Context {
    Status status;

    public Context(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void action() {
        if (status.getValue().equals("1")) {
            status.method1();
        }else {
            status.method2();
        }
    }
}
