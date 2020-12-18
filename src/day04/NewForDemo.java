package day04;
/**
 * JDK5.0之后推出了一个新的特性：
 * 增强for循环，又叫做新循环，for each
 * 
 * 新循环不能代替传统循环。作用仅仅是用来遍历集合或
 * 数组。
 * @author Administrator
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five","six"};
		for(int i=0;i<array.length;i++){
			String str = array[i];
			System.out.println(str);
		}
		for(String str:array){
			System.out.println(str);
		}
			
	}
}
