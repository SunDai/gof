package sundai.gof.structures.adapter;

/**
 * Created by xh on 2015/10/14.
 * 这是对象这个级别的适配
 * 这里面的source 是持有的，所以调用的时候就是 调用的原汁原味的 Source的方法了
 * 不知道为什么感觉这种对象的适配其实较类的适配，从思想上比较low
 * 另外 构造方法里面的 super 是什么用法，你知道么？
 *
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper (Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetabel method !");
    }

    public static void main(String[] args){
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
