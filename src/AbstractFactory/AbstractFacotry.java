package AbstractFactory;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 14:56
 */
public abstract class AbstractFacotry {

    Factory getFactory(String type){
        if (type.equals("a")) {
            return new FactoryA();
        }
        return new FactoryB();
    }

}
