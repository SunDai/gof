package sundai.gof.action.observer;

/**
 * Created by xh on 2015/10/16.
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
