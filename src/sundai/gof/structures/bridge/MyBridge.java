package sundai.gof.structures.bridge;

/**
 * Created by xh on 2015/10/15.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
