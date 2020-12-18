package day03;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个确切的时间点。
 * 内部维护了一个long值，该值记录的是从：
 * 1970年1月1日 00:00:00 到表示的时间点之间所经历
 * 的毫秒值。正数是70年以后的日期，负数是70年以前的日期。
 * 由于Date设计上存在缺陷(时区，千年虫)，所以它的大部分
 * 方法被设置为"过时的",不再建议使用。
 * @author Administrator
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		/*
		 * 使用默认构造方法创建的Date表示当前
		 * 系统时间。
		 */
		Date date = new Date();
		/*
		 * Date重写了toString，返回的字符串
		 * 显示的就是当前Date表示的时间。格式：
		 * Sun Nov 05 13:35:44 CST 2017
		 * 对于非英语地区不太友好。
		 */
		System.out.println(date);
		/*
		 * Date的大部分方法不建议使用了。
		 */
		date.getYear();
		/*
		 * 获取Date内部维护的long值
		 * 
		 */
		long time = date.getTime();
		System.out.println(time);
		//明天这一时刻的毫秒值
		time +=1000*60*60*24;
		/*
		 * void setTime(long)
		 * 设置一个long值，使Date表示该long值
		 * 所表示的时间。
		 */
		date.setTime(time);
		System.out.println(date);
	}
}
