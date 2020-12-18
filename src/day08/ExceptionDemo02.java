package day08;
/**
 * finally块
 * finally块定义在异常捕获机制的最后
 * 可以直接跟在try块之后或者最后一个catch块
 * 之后。
 * finally块中的代码一定执行，无论try块中的代码
 * 是否抛出异常。
 * 所以通常会把释放资源等操作放在finally中，
 * 例如：关闭流
 * @author Administrator
 *
 */
public class ExceptionDemo02 {
	public static void main(String[] args) {
		System.out.println("程序开始啦!");
		try {
			String str ="";
			//System.out.println(str.length());
			System.out.println(str.charAt(0));
		} catch (Exception e) {
			System.out.println("出错啦！");
		} finally{
			System.out.println("finally中的代码执行");
		}
		System.out.println("程序结束了！");
	}
}
