package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算促销日期
 * 输入一个生产日期，一个保质期的天数
 * 促销日为该商品过期日前两周的周三
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入生产日期：(yyyy-MM-dd)");
		String dateStr = scanner.nextLine();
		System.out.println("请输入保质期的天数：");
		
		int days = Integer.parseInt(scanner.nextLine());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateStr);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(Calendar.DAY_OF_YEAR, days);
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		calendar.add(Calendar.DAY_OF_WEEK, 4);
		
		date = calendar.getTime();
		dateStr = sdf.format(date);
		System.out.println("促销日为"+dateStr);
	}
}
