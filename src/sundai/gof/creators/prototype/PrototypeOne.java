package sundai.gof.creators.prototype;

/**
 * Created by xh on 2015/10/14.
 */
public class PrototypeOne implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        PrototypeOne prototypeOne = (PrototypeOne) super.clone();
        return prototypeOne;
    }
}
