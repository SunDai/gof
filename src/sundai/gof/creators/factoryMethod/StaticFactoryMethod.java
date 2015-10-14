package sundai.gof.creators.factoryMethod;

import sundai.gof.creators.sender.Sender;
import sundai.gof.creators.sender.impl.MailSender;
import sundai.gof.creators.sender.impl.SmsSender;

/**
 * Created by xh on 2015/10/10.
 */
public class StaticFactoryMethod {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
    //TODO staic  的用法的优点等
}
