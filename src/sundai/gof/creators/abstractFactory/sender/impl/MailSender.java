package sundai.gof.creators.abstractFactory.sender.impl;

import sundai.gof.creators.abstractFactory.sender.Sender;

/**
 * Created by xh on 2015/10/10.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("Send an Email !");
    }
}
