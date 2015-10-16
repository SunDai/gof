package sundai.gof.action.mediator;

/**
 * Created by xh on 2015/10/16.
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
