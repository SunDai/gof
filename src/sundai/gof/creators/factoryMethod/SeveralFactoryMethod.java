package sundai.gof.creators.factoryMethod;

import sundai.gof.creators.sender.Sender;
import sundai.gof.creators.sender.impl.MailSender;
import sundai.gof.creators.sender.impl.SmsSender;

/**
 * Created by xh on 2015/10/10.
 */
public class SeveralFactoryMethod {
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
}
