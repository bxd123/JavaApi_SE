package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 根据一个给定的日期格式将String与Date相互
 * 转换。
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		/*
		 * 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * Date->String
		 * String format(Date date)
		 * format方法可以将给定的date对象所表示的
		 * 时间按照SimpleDateFormat指定的日期格式
		 * 转换为字符串。
		 */
		String str = sdf.format(now);
		System.out.println(str);
		
		
		
		
	}
}
