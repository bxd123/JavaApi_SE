package day08;
/**
 * Exception���÷���
 * @author Administrator
 *
 */
public class ExceptionDemo06 {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "avb";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("���������");
	}
}
