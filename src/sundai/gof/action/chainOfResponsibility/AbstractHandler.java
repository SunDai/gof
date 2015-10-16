package sundai.gof.action.chainOfResponsibility;

/**
 * Created by xh on 2015/10/16.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}

