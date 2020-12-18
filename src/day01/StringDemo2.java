package day01;
/**
 * String substring(int start,int end)
 * 截取字符串，从指定位置(start)开始截取到指定
 * 的位置(end)
 * java api有一个特点，通常用两个数字表示范围时，
 * 含头不含尾。、
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
	 * 若只传入一个参数，这是从指定位置开始
	 * 截取到字符串末尾。
	 */
	sub = host.substring(4);
	System.out.println(sub);
	sub = host.substring(4, 8);
	System.out.println(sub);
	}
	
}
