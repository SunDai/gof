package sundai.gof.creators.builder;

import sundai.gof.creators.sender.Sender;
import sundai.gof.creators.sender.impl.MailSender;
import sundai.gof.creators.sender.impl.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xh on 2015/10/10.
 */
public class SenderBuilder {
    private List<Sender> list = new ArrayList<Sender>();
    public void produceMailSender(int count){
        for (int i = 0;i<count;i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0;i<count;i++){
            list.add(new SmsSender());
        }
    }

    public void printList(){
        for (int i = 0;i<list.size();i++){
            Sender s = list.get(i);
            System.out.println("the "+(i+1)+" is a "+ s.getClass().getName());
            s.send();
        }
    }
}
