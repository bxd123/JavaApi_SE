package day01;
/**
 * javadoc用于对java代码进行注释的一种
 * 文档命令，
 * 文档注释最终可以被javadoc命令所解释，然后
 * 生成一个文档手册。
 * 
 * 当前类是用来测试文档注释的使用规范。
 * @author QiWenDong
 * @version 1.0 1/11/17
 * @since JDK1.0 
 * 
 *
 */
public class APIDocDemo {
	/**
	 * sayHello方法中用到的问候语
	 */
	public static final String INFO = "你好！";
	
	/**
	 * 为指定的用户添加问候语
	 * @param name 指定的用户名字
	 * @return 添加问候语后的字符串
	 */
	public static String sayHello(String name){
		return INFO+name;
	}
}
