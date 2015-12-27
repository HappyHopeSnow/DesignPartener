package iterator2;

/**
 * Created by lianle on 2015/12/27.
 */
public class MyCollection implements Collection {

    public String[] strings = {"a", "b", "c", "d"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int index) {
        return strings[index];
    }

    @Override
    public int size() {
        return strings.length;
    }
}
