package sundai.gof.structures.proxy;

/**
 * Created by xh on 2015/10/15.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy(){
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before(){
        System.out.println("before proxy!");
    }

    private void after(){
        System.out.println("after proxy!");
    }
}
