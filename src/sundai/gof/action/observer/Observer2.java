package sundai.gof.action.observer;

/**
 * Created by xh on 2015/10/16.
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }

}
