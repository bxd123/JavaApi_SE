package day08;
/**
 * java异常捕获机制中的try-catch
 * try块是用来扩上可能出错的代码片段
 * catch块是用来捕获try块中代码抛出的错误
 * 并解决。
 * 1@author Administrator
 *
 */
public class ExceptionDemo01 {
	//@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try{
			String str = "a";
			/*
			 * JVM在执行代码的过程中若发现了一个异常，
			 * 则会实例化这种情况的异常实例，并将整个代码
			 * 执行过程完整设置到异常中来表示该错误报告，
			 * 设置完毕后将该异常抛出。若抛出异常的这句代码
			 * 有被try包围，则JVM会检查catch中是否有关注
			 * 该异常，关注则交给catch并解决，否则会将异常
			 * 抛出到当前方法外，由调用当前方法的代码解决该
			 * 异常。
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
		}catch(NullPointerException e){
			System.out.println("出现空指针");
			System.out.println(e);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界了");
			/*
			 * 应当养成一个好习惯，在最后一个catch中
			 * 捕获Exception。避免因未捕获异常，导致程序
			 * 中断。
			 * 
			 * 当多个catch捕获不同异常时，这些异常间存在
			 * 继承关系，那么子类异常要在上先行捕获，父类异常
			 * 在下。
			 */
		}catch(Exception e){
			System.out.println("出错啦！");
		}
		System.out.println("程序结束了");
	}
}
