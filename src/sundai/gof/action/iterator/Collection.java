package sundai.gof.action.iterator;

/**
 * Created by xh on 2015/10/16.
 */
public interface Collection {

    public Iterator iterator();

    /*ȡ�ü���Ԫ��*/
    public Object get(int i);

    /*ȡ�ü��ϴ�С*/
    public int size();
}
