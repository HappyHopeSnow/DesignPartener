package iterator;

/**
 * 迭代器
 * Created by lianle on 2015/12/27.
 */
public interface Iterator {
    Object getObject();
    Object next();
    boolean hasNext();
}
