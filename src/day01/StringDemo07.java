package day01;
/**
 * 字符串拼接的性能问题
 * 
 * @author Administrator
 *
 */
public class StringDemo07 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("a"); 
		for(int i=0;i<10000000;i++){
			builder.append("a");
		}
		System.out.println("执行完毕！");
		//System.out.println(builder);
	}

}
