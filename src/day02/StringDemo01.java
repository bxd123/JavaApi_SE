package day02;
/**
 * �ַ���֧��������ʽ�ķ���֮һ��
 * boolean matches(String regex)
 * ���ݸ�����������ʽ��֤��ǰ�ַ����Ƿ������ʽ
 * Ҫ�������򷵻�ture,���򷵻�false.
 * @author Administrator
 *
 */
public class StringDemo01 {
	public static void main(String[] args) {
	/*
	 * ���������������ʽ��
	 * [a-zA-Z0-9]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9])+ 
	 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
		String mail = "fancq@tedu.cn";
		System.out.println(mail);
		boolean flag = mail.matches(regex);
		if(flag){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}
}
