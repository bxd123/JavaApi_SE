package day01;
/**
 * javadoc���ڶ�java�������ע�͵�һ��
 * �ĵ����
 * �ĵ�ע�����տ��Ա�javadoc���������ͣ�Ȼ��
 * ����һ���ĵ��ֲᡣ
 * 
 * ��ǰ�������������ĵ�ע�͵�ʹ�ù淶��
 * @author QiWenDong
 * @version 1.0 1/11/17
 * @since JDK1.0 
 * 
 *
 */
public class APIDocDemo {
	/**
	 * sayHello�������õ����ʺ���
	 */
	public static final String INFO = "��ã�";
	
	/**
	 * Ϊָ�����û�����ʺ���
	 * @param name ָ�����û�����
	 * @return ����ʺ������ַ���
	 */
	public static String sayHello(String name){
		return INFO+name;
	}
}
