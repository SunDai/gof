package sundai.gof.creators.abstractFactory.producer.impl;

import sundai.gof.creators.abstractFactory.producer.Producer;
import sundai.gof.creators.sender.Sender;
import sundai.gof.creators.sender.impl.MailSender;

/**
 * Created by xh on 2015/10/10.
 */
public class MailSenderFactory implements Producer {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
