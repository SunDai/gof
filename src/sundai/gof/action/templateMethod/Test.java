package sundai.gof.action.templateMethod;

/**
 * Created by xh on 2015/10/16.
 */
public class Test {
    public static void main(String[] args){
        String exp = "16+100";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp,"\\+");
        System.out.println(result);
    }
}
