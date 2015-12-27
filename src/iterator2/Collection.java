package iterator2;

/**
 * Created by lianle on 2015/12/27.
 */
public interface Collection {

    /**获取迭代器方法**/
    public Iterator iterator();

    Object get(int index);
    int size();

}
