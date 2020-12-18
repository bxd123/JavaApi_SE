package day03;

import java.util.Calendar;

/**
 * 获取一个Calendar表示的日期中
 * 各个时间分量对应的值
 * @author Administrator
 *
 */
public class CalendarDemo03 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * int get(int field)
		 * 获取对应时间分量的值
		 */
		//获取年
		int year = calendar.get(Calendar.YEAR);
		//获取月
		int month = calendar.get(Calendar.MONTH)+1;
		//获取日
		int day = calendar.get(Calendar.DATE);
		//获取时
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		//获取分
		int minute = calendar.get(Calendar.MINUTE);
		//获取秒
		int second = calendar.get(Calendar.SECOND);
		System.out.println(year+"-"+month+"-"+day+" "+hour+':'+minute+':'+second);
		
		//查看星期几
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("周"+(dow==1?"日":dow-1));
		String[] data = {"日","一","二","三","四","五","六"};
		System.out.println("周"+data[dow-1]);
		//到今天为止，今年已经过了少天
		int doy = 365-calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(year+"还剩"+doy+"天");
	}
}
