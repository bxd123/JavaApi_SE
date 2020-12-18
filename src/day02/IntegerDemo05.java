package day02;
/**
 * JDK1.5之后推出了一个新的特性
 * 自动拆装箱
 * @author Administrator
 *
 */
public class IntegerDemo05 {
	public static void main(String[] args) {
		/*
		 * 自动拆装箱是编译器认可，而不是虚拟机认可。
		 * 编译器在将源程序编译时自动补充代码来完成
		 * 基本类型与包装类之间的转换
		 * 
		 * 下面代码触发了自动拆箱：
		 * 在class文件中，下面的代码被编译器改为：
		 * int i = new Integer(1).intValue();
		 */
		int i = new Integer(1);
		/*
		 * 下面代码出发的自动装箱：
		 * 在class文件中，下面代码被编译器改为：
		 * Integer ii = Integer.valueOf(123);
		 */
		Integer ii = 123;
	}
}
