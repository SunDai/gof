package sundai.gof.structures.adapter;

/**
 * Created by xh on 2015/10/14.
 * �������������� ����
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is targetable method !");
    }

    //���õ��Ǳ���ķ��������Ǹ��෽�����̳��ˣ����������

}
