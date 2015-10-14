package sundai.gof.structures.decorator;

import sundai.gof.structures.adapter.*;

/**
 * Created by xh on 2015/10/14.
 */
public class Decorator implements Sourceable{
    private Sourceable source ;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator£¡");
        source.method();
        System.out.println("after decorator!");
    }

    public static void main(String[] args){
        Sourceable sourceable = new Source();
        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();
    }

}
