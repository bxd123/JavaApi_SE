package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 从字符串转换为Date
 * Date parse (String str)
 * 将给定的字符串按照SimpleDateFormat指定的日期
 * 格式解析为一个Date对象。
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo02 {

	public static void main(String[] args) throws ParseException {
		String str = "2000-08-08 20:23:21";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		System.out.println(date);
	}

}
