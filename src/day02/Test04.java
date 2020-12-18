package day02;
/**
 * 和谐用语
 * @author Administrator
 *
 */
public class Test04 {
	public static void main(String[] args) {
	String regex = "(wqnmlgb|cnm|sb|2b|nc|tmd|cby|djb)";
	String message = "wqnmlgb!你这个djb!你怎么这么nc,你这个2b!cnm!";
	message = message.replaceAll(regex, "*****");
	System.out.println(message);
	}
}
