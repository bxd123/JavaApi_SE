package day02;
/**
 * 字符串支持正则表达式方法三：
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的字符串
 * @author Administrator
 *
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String str = "123abc456defg789hijk";
		/*
		 * 将数字部分替换为"#NUMBER#"
		 * 
		 */
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
		str=str.replaceFirst("\\w+", "123");
		System.out.println(str);
	}
}
