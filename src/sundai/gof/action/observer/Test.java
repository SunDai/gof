package sundai.gof.action.observer;

/**
 * Created by xh on 2015/10/16.
 */
public class Test {
    public static void main(String[] args){
        Subject sb = new MySubject();
        sb.add(new Observer1());
        sb.add(new Observer2());
        sb.operation();
    }

}
