package sundai.gof.action.interpreter;

/**
 * Created by xh on 2015/10/16.
 */
public class Test {

    public static void main(String[] args) {

        // ����9+2-8��ֵ
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
