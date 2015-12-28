package Memento2;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 17:39
 */
public class Main {
    public static void main(String[] args) {

        Origin origin = new Origin("1");

        Storage storage = new Storage(origin.createMemento());
        System.out.println("old=" + origin.getValue());
        origin.setValue("2");
        System.out.println("new=" + origin.getValue());

        origin.restoreMemento(storage.getMemento());
        System.out.println("now=" + origin.getValue());



    }
}
