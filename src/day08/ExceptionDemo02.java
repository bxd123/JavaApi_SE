package day08;
/**
 * finally��
 * finally�鶨�����쳣������Ƶ����
 * ����ֱ�Ӹ���try��֮��������һ��catch��
 * ֮��
 * finally���еĴ���һ��ִ�У�����try���еĴ���
 * �Ƿ��׳��쳣��
 * ����ͨ������ͷ���Դ�Ȳ�������finally�У�
 * ���磺�ر���
 * @author Administrator
 *
 */
public class ExceptionDemo02 {
	public static void main(String[] args) {
		System.out.println("����ʼ��!");
		try {
			String str ="";
			//System.out.println(str.length());
			System.out.println(str.charAt(0));
		} catch (Exception e) {
			System.out.println("��������");
		} finally{
			System.out.println("finally�еĴ���ִ��");
		}
		System.out.println("��������ˣ�");
	}
}
