package sundai.gof.structures.decorator;

import sundai.gof.structures.adapter.*;

/**
 * Created by xh on 2015/10/14.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!"+this.getClass().getName());
    }
}
