package day03;

import java.util.Calendar;

/**
 * 
 * 获取某一个时间分量所允许的最大值。
 * @author Administrator
 *
 */
public class CalendarDemo04 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//当月总共多少天？
		int days = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//查看2017年2月多少天？
		calendar.set(Calendar.MONTH, 1);
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//今年总共有多少天？
		days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年总共有"+days+"天");
		
	}
}
