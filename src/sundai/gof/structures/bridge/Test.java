package sundai.gof.structures.bridge;

/**
 * Created by xh on 2015/10/15.
 */
public class Test {
    public static void main(String[] args){
        Bridge bridge = new MyBridge();
        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
