package day02;
/**
 * 包装类提供了一个静态方法parseXXX(string str)
 * 可以将给定的字符串转换为对应的基本类型
 * 前提是该字符串必须正确的描述基本类型可以保存的值。
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
