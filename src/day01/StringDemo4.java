package day01;
/**
 * boolean startsWith(Sring str)
 * boolean endsWith(String str)
 * �жϵ�ǰ�ַ����Ƿ�����ָ�����ַ�����ʼ���߽�β��
 * @author Administrator
 *
 */
public class StringDemo4 {
	public static void main(String[] args) {
	String str = "thinking in java";
	boolean starts = str.startsWith("th");
	System.out.println("starts:"+starts);
	
	boolean ends = str.endsWith("a");
	System.out.println("ends:"+ends);
	}
}
