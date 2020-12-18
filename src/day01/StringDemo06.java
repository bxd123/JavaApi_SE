package day01;
/**
 * String提供若干重载的静态方法
 * static String valueOf(XXX　ｘｘｘ)
 * 该方法的作用是将java中其他类型转换为字符串
 * @author Administrator
 *
 */
public class StringDemo06 {
	public static void main(String[] args) {
	int i = 1;
	String str1 = String.valueOf(i);
	System.out.println(str1+1);
	
	double d = 1.1;
	String str2 = String.valueOf(d);
	System.out.println(str2+1);
	}
}
