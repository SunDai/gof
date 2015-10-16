package sundai.gof.action.iterator;

/**
 * Created by xh on 2015/10/16.
 */
public interface Iterator {
    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
