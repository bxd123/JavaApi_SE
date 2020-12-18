package day02;
/**
 * 使用replaceAll实现图片重命名
 * @author Administrator
 *
 */
public class Test03 {
	public static void main(String[] args) {
		String imgName = "2.jpg";
		imgName = imgName.replaceAll(".+\\.", System.currentTimeMillis()+".");
		//imgName = imgName.replaceAll("\\d+", System.currentTimeMillis()+"");
	System.out.println(imgName);
	}
}
