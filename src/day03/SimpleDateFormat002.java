package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ½«×Ö·û´®×ª»»ÎªDate
 * @author Administrator
 *
 */
public class SimpleDateFormat002 {
	public static void main(String[] args) throws ParseException {
		String str = "2001-12-23 12:32:58";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		System.out.println(date);
	}
}
