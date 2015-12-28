package Memento2;

/**
 * Description: <br>
 * 存储
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 17:34
 */
public class Storage {
    //备忘录
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
