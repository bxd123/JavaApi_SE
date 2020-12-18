package day01;
/**
 * String toUpperCase
 * String toLowerCase
 * 将当前字符串的英文转换为全大写或小写
 * @author Administrator
 *
 */
public class StringDemo5 {
	public static void main(String[] args){
	String str = "wo ai Java";
	String upper = str.toUpperCase();
	System.out.println(upper);
	
	String lower = str.toLowerCase();
	System.out.println(lower);
	
	int min = Integer.MIN_VALUE;
	int n = 3;
	int m = n+(min)*2;
	System.out.println(m);
	}
}
