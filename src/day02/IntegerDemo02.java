package day02;
/**
 * �������͵İ�װ��̳���Number
 * ���ṩ���磺intValue,doubleValue������
 * �����������ǿ��Խ���ǰ��װ���ʾ������������
 * �������͵���ʽ���ء�
 * @author Administrator
 *
 */
public class IntegerDemo02 {
	public static void main(String[] args) {
		/*
		 * ����������ת��Ϊ��װ�������ַ�ʽ��
		 * 1.���ù��췽��
		 * 2.���þ�̬����valueOf(�Ƽ�)
		 */
		//Integer i1 = new Integer(123);
		//Integer i2 = new Integer(123);
		Integer i1 = Integer.valueOf(123);
		Integer i2 = Integer.valueOf(123);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		int i = i1.intValue();
		System.out.println(i);
		
		double d = i1.doubleValue();
		System.out.println(d);
		
		byte b = i1.byteValue();
		System.out.println(b);
		
		float f = i1.floatValue();
		System.out.println(f);
				
	}
}
