package sundai.gof.action.observer;

/**
 * Created by xh on 2015/10/16.
 */
public interface Subject {

    /*���ӹ۲���*/
    public void add(Observer observer);

    /*ɾ���۲���*/
    public void del(Observer observer);

    /*֪ͨ���еĹ۲���*/
    public void notifyObservers();

    /*����Ĳ���*/
    public void operation();
}
