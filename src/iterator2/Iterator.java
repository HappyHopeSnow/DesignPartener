package iterator2;

/**
 * 迭代器
 * Created by lianle on 2015/12/27.
 */
public interface Iterator {

    Object previous();
    Object next();
    boolean hasNext();
    Object first();
}
