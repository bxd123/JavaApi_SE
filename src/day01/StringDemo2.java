package day01;
/**
 * String substring(int start,int end)
 * ��ȡ�ַ�������ָ��λ��(start)��ʼ��ȡ��ָ��
 * ��λ��(end)
 * java api��һ���ص㣬ͨ�����������ֱ�ʾ��Χʱ��
 * ��ͷ����β����
 * @author Administrator
 * 
 * 
 */
public class StringDemo2 {
	public static void main(String[] args) {
		//        0123456789012345
	String str = "thinking in java";
	String sub = str.substring(5,8);
	System.out.println("sub:"+sub);
	String host = "www.tedu.cn";
	/*
	 * ��ֻ����һ�����������Ǵ�ָ��λ�ÿ�ʼ
	 * ��ȡ���ַ���ĩβ��
	 */
	sub = host.substring(4);
	System.out.println(sub);
	sub = host.substring(4, 8);
	System.out.println(sub);
	}
	
}
