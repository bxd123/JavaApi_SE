package day02;
/**
 * �ַ���֧��������ʽ��������
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���
 * @author Administrator
 *
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String str = "123abc456defg789hijk";
		/*
		 * �����ֲ����滻Ϊ"#NUMBER#"
		 * 
		 */
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
		str=str.replaceFirst("\\w+", "123");
		System.out.println(str);
	}
}
