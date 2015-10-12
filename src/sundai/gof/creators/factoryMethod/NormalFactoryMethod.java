package sundai.gof.creators.factoryMethod;

import sundai.gof.creators.sender.Sender;
import sundai.gof.creators.sender.impl.MailSender;
import sundai.gof.creators.sender.impl.SmsSender;

/**
 * Created by xh on 2015/10/10.
 */
public class NormalFactoryMethod {

    public Sender produce(String type){
        if ("sms".equals(type)){
            return new SmsSender();
        }else if ("email".equals(type)){
            return new MailSender();
        }
        return null;
    }

}
