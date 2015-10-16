package sundai.gof.action.templateMethod;

/**
 * Created by xh on 2015/10/16.
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}
