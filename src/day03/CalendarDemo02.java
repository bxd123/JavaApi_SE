package day03;

import java.util.Calendar;

/**
 * Calendar提供了针对不同时间分量单独设置
 * 值的方法。
 * void set(int field,int value)
 * 其中第一个参数为：时间分量，例如：年，月，日
 * 第二个参数为对应的值。
 * 时间分量是一个int值，使用Calendar提供的常量。
 * @author Administrator
 *
 */
public class CalendarDemo02 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		/*
		 * 设置Calendar，使其表示
		 * 2008-08-08 20:08:08
		 * 
		 */
		//设定年
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		/*
		 * 设置月
		 * 月从零开始，0表示1月
		 * 或者可以使用具体月的常量
		 */
		//calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.MONTH, 7);
		System.out.println(calendar.getTime());
		/*
		 * 设置日
		 * 对应的时间分量常用的
		 * DATE： 月中天
		 * DAY_OF_MONTH:月中的天，与DATE一致
		 * DAY_OF_WEEK:周中的天，星期几
		 * DAY_OF_YEAR:年中的天
		 * 
		 */
		calendar.set(Calendar.DAY_OF_MONTH,8);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.HOUR_OF_DAY,22 );
		calendar.set(Calendar.MINUTE, 8);
		calendar.set(Calendar.SECOND, 5);
		System.out.println(calendar.getTime());
		
	}
}
