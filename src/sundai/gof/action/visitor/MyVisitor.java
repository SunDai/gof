package sundai.gof.action.visitor;

/**
 * Created by xh on 2015/10/16.
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject:"+sub.getSubject());
    }
}
