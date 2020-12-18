package day02;
/**
 * 包装类
 * java对于8个基本类型分别定义了对应的包装类
 * 而包装类出现的原因是为了解决基本类型不能参与
 * 面向对象开发问题。
 * @author Administrator
 *
 */
public class IntegerDemo01 {

	public static void main(String[] args) {
		dosome("abc");
		dosome(new Point(1,2));
		int i = 1;
		/**
		 * java的8个基本类型：
		 * byte，short,int,long,float,double
		 * char,boolean
		 * 是以值的形式直接存在的，所以他们没有
		 * 面向对象的特征，自然也不继承Object，所以
		 * 不能使用多态，用Object的角度去接受基本类型
		 * 
		 */
		Integer ii = new Integer(i);
				
		dosome(i);
	}
	public static void dosome(Object obj){
		
	}
}
