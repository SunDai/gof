package sundai.gof.structures.bridge;

/**
 * Created by xh on 2015/10/15.
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
