package day02;
/**
 * ��װ���ṩ��һ����̬����parseXXX(string str)
 * ���Խ��������ַ���ת��Ϊ��Ӧ�Ļ�������
 * ǰ���Ǹ��ַ���������ȷ�������������Ϳ��Ա����ֵ��
 * @author Administrator
 *
 */
public class IntegerDemo04 {
	public static void main(String[] args) {
		String str = "123";
		int i = Integer.parseInt(str);
		System.out.println(i);
		i = Integer.valueOf(str);
		System.out.println(i+1);
		
		double d = Double.parseDouble(str);
		System.out.println(d);
	}
	
	
}
