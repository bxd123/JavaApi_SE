package day02;
/**
 * ʹ��replaceAllʵ��ͼƬ������
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
