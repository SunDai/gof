package sundai.gof.action.iterator;

/**
 * Created by xh on 2015/10/16.
 */
public interface Iterator {
    //ǰ��
    public Object previous();

    //����
    public Object next();
    public boolean hasNext();

    //ȡ�õ�һ��Ԫ��
    public Object first();
}
