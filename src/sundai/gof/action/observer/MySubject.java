package sundai.gof.action.observer;

/**
 * Created by xh on 2015/10/16.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
