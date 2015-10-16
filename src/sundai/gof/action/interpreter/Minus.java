package sundai.gof.action.interpreter;

/**
 * Created by xh on 2015/10/16.
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
