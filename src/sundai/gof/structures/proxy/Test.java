package sundai.gof.structures.proxy;

/**
 * Created by xh on 2015/10/15.
 */
public class Test {
    public static void main(String[] args){
        Sourceable source = new Proxy();
        source.method();
    }
}
