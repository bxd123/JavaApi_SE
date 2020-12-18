package day02;
/**
 * 字符串支持正则表达式的方法之一：
 * boolean matches(String regex)
 * 根据给定的正则表达式验证当前字符串是否满足格式
 * 要求，满足则返回ture,否则返回false.
 * @author Administrator
 *
 */
public class StringDemo01 {
	public static void main(String[] args) {
	/*
	 * 电子邮箱的正则表达式：
	 * [a-zA-Z0-9]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9])+ 
	 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
		String mail = "fancq@tedu.cn";
		System.out.println(mail);
		boolean flag = mail.matches(regex);
		if(flag){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
	}
}
