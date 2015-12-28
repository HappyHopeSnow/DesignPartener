package Memento2;

/**
 * Description: <br>
 * 原始对象
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/28 17:33
 */
public class Origin {
    private String value;

    /**
     * 构造方法
     * @param value
     */
    public Origin(String value) {
        this.value = value;
    }

    /**
     * get set方法
     * @return
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //创建
    public Memento createMemento(){
        return new Memento(value);
    }

    //存储
    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }



}
