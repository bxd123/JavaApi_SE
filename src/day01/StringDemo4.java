package day01;
/**
 * boolean startsWith(Sring str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以指定的字符串开始或者结尾。
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
