package day08;
/**
 * Exception常用方法
 * @author Administrator
 *
 */
public class ExceptionDemo06 {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "avb";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("程序结束了");
	}
}
