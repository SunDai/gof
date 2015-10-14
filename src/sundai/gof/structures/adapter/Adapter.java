package sundai.gof.structures.adapter;

/**
 * Created by xh on 2015/10/14.
 * 这是类这个级别的 适配
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is targetable method !");
    }

    //调用的是本身的方法而不是父类方法，继承了，就是你的了

}
