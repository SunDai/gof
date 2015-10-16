package sundai.gof.action.mediator;

/**
 * Created by xh on 2015/10/16.
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
