package day08;
/**
 * 
 * @author Administrator
 *
 */
public class ExceptionDemo04 {
	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * 当调用一个含有throws声明异常抛出
		 * 的方法时，编译器要求必须处理该异常。
		 * 处理手段有两种：
		 * 1.使用try-catch捕获并处理
		 * 2.在当前方法上继续使用throws声明该
		 * 	异常的抛出。
		 */
				try {
					p.setAge(200);
				} catch (IllegalAgeException e) {
					e.printStackTrace();
				}
			
		System.out.println("年龄为："+p.getAge());
	}
}
