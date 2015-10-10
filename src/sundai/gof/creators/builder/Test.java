package sundai.gof.creators.builder;

/**
 * Created by xh on 2015/10/10.
 */
public class Test {
    public static void main(String[] args){
        SenderBuilder sb = new SenderBuilder();
        sb.produceMailSender(5);
        sb.produceSmsSender(10);
        sb.produceMailSender(3);
        sb.printList();
    }
}
