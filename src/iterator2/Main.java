package iterator2;

/**
 * Created by lianle on 2015/12/27.
 */
public class Main {
    public static void main(String[] args) {
        Collection my = new MyCollection();
        Iterator iterator = my.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
