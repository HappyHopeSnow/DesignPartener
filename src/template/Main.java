package template;

/**
 * Created by lianle on 2015/12/26.
 */
public class Main {
    public static void main(String[] args) {
        Template a = new TemplateA();
        a.first();
        a.commonMethod();
        System.out.println("****************");

        Template b = new TemplateB();
        b.first();
        b.commonMethod();
    }
}
