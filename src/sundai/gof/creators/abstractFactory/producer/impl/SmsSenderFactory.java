package sundai.gof.creators.abstractFactory.producer.impl;

import sundai.gof.creators.abstractFactory.producer.Producer;
import sundai.gof.creators.sender.Sender;
import sundai.gof.creators.sender.impl.SmsSender;

/**
 * Created by xh on 2015/10/10.
 */
public class SmsSenderFactory implements Producer{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
