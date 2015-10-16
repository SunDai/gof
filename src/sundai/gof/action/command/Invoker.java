package sundai.gof.action.command;

/**
 * Created by xh on 2015/10/16.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
