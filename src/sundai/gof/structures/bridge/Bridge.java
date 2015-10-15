package sundai.gof.structures.bridge;

/**
 * Created by xh on 2015/10/15.
 */
public abstract class Bridge {
    private Sourceable source;
    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source){
        this.source = source;
    }
}
