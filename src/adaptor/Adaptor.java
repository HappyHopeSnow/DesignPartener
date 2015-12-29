package adaptor;

/**
 * Description: <br>
 *
 * @author <a href=mailto:lianle1@jd.com>连乐</a>
 * @date 2015/12/29 11:22
 */
public abstract class Adaptor implements OldService{
    public OldService oldService;

    public OldService getOldService() {
        return oldService;
    }

    public void setOldService(OldService oldService) {
        this.oldService = oldService;
    }

    public void action() {

    }
}
