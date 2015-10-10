package sundai.gof.creators.abstractFactory;

import sundai.gof.creators.abstractFactory.producer.Producer;
import sundai.gof.creators.abstractFactory.producer.impl.SmsSenderFactory;
import sundai.gof.creators.abstractFactory.sender.Sender;

/**
 * Created by xh on 2015/10/10.
 */
public class Test {
    public static void main(String[] args){
        Producer p = new SmsSenderFactory();
        Sender s = p.produce();
        s.send();
    }
}
