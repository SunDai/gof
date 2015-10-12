package sundai.gof.creators.factoryMethod;

import sundai.gof.creators.sender.Sender;

/**
 * Created by xh on 2015/10/10.
 */
public class Test {
    public static void main(String[] args){
        Sender s1 = StaticFactoryMethod.produceMail();
        s1.send();
        Sender s2 = StaticFactoryMethod.produceSms();
        s2.send();
    }
}
