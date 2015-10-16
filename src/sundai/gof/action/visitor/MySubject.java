package sundai.gof.action.visitor;

/**
 * Created by xh on 2015/10/16.
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
