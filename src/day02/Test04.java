package day02;
/**
 * ��г����
 * @author Administrator
 *
 */
public class Test04 {
	public static void main(String[] args) {
	String regex = "(wqnmlgb|cnm|sb|2b|nc|tmd|cby|djb)";
	String message = "wqnmlgb!�����djb!����ô��ônc,�����2b!cnm!";
	message = message.replaceAll(regex, "*****");
	System.out.println(message);
	}
}
