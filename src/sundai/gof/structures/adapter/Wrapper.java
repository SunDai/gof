package sundai.gof.structures.adapter;

/**
 * Created by xh on 2015/10/14.
 * ���Ƕ���������������
 * �������source �ǳ��еģ����Ե��õ�ʱ����� ���õ�ԭ֭ԭζ�� Source�ķ�����
 * ��֪��Ϊʲô�о����ֶ����������ʵ��������䣬��˼���ϱȽ�low
 * ���� ���췽������� super ��ʲô�÷�����֪��ô��
 *
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper (Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetabel method !");
    }

    public static void main(String[] args){
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
