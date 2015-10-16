package sundai.gof.action.visitor;

/**
 * Created by xh on 2015/10/16.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
