package sundai.gof.structures.proxy;

import sundai.gof.structures.decorator.*;

/**
 * Created by xh on 2015/10/15.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method !"+ this.getClass().getName());
    }
}
