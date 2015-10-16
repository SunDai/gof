package sundai.gof.action.strategy;

/**
 * Created by xh on 2015/10/16.
 */
public class Test {
    public static void main(String[] args){
        String exp = "2+8";
        ICalculator calculator = new Plus();
        int result = calculator.calculate(exp);
        System.out.println(result);
    }
}
