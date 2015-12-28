package Memento2;

/**
 * Description: <br>
 * 备忘录 和原始对象有相同的属性类型，来建立存储关系
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 17:33
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
