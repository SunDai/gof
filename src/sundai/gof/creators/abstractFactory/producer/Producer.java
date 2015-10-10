package sundai.gof.creators.abstractFactory.producer;

import sundai.gof.creators.abstractFactory.sender.Sender;

/**
 * Created by xh on 2015/10/10.
 */
public interface Producer {
    public Sender produce();
}
