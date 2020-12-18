package day03;

import java.util.Calendar;

/**
 * Calendar中计算时间的方法
 * void add(int field,int value)
 * 对指定的时间分量加上给定的值，若给定的值是负数，
 * 则是减去给定的值。
 * @author Administrator
 *
 */
public class CalendarDemo05 {
	public static void main(String[] args) {
		/*
		 * 查看3年2个月零1天5以后的日期？
		 * 
		 */
		Calendar calendar = Calendar.getInstance();
		//查看3年以后
		calendar.add(Calendar.YEAR, 3);
		System.out.println(calendar.getTime());
		//查看3年2个月以后
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		//查看3年2个月一天以后
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		System.out.println(calendar.getTime());
		//再查看5小时以前？
		calendar.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println(calendar.getTime());
		
		/**
		 * 当遇到类似开发需求：
		 * 要求用户输入一个日期，然后对该日期进行一系列
		 * 的运算，再将计算后的日期显示给用户时。
		 * 流程如下：
		 * 1.获取用户输入的日期字符串
		 * 2.使用SimpleDateFormat将Date转换为Date
		 * 3.创建一个Calendar，使其表示Date表示的日期
		 * 4.使用Calendar根据需求计算时间
		 * 5.将Calendar转换为一个Date
		 * 6.使用SimpleDateFormat将Date转换为字符串
		 * 后显示给用户
		 */
	}
	
}
