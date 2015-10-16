package sundai.gof.action.iterator;

/**
 * Created by xh on 2015/10/16.
 */
public interface Collection {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
