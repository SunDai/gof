package sundai.gof.action.mediator;

/**
 * Created by xh on 2015/10/16.
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
