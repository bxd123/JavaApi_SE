package day08;
/**
 * 
 * @author Administrator
 *
 */
public class ExceptionDemo04 {
	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * ������һ������throws�����쳣�׳�
		 * �ķ���ʱ��������Ҫ����봦����쳣��
		 * �����ֶ������֣�
		 * 1.ʹ��try-catch���񲢴���
		 * 2.�ڵ�ǰ�����ϼ���ʹ��throws������
		 * 	�쳣���׳���
		 */
				try {
					p.setAge(200);
				} catch (IllegalAgeException e) {
					e.printStackTrace();
				}
			
		System.out.println("����Ϊ��"+p.getAge());
	}
}
