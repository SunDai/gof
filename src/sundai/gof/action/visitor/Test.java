package sundai.gof.action.visitor;

/**
 * Created by xh on 2015/10/16.
 */
public class Test {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
