package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * SimpleDateFormat的两种用法：
 * 1.将时间转换为字符串（format）
 * 2.将字符串转换为时间（parse）
 * 要求用户输入自己的生日，格式为：
 * 1992-07-13
 * 经过计算，输出：
 * 到今天为止一共活了XXXXt天。
 * 以及距离10000天还有多少天。
 * 生存10000天的纪念日是：2018-12-05
 * @author Administrator
 *
 */
public class Test03 {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入您的生日：");
		Scanner scanner = new Scanner(System.in);
		String birthStr = scanner.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		Date birth = sdf.parse(birthStr);
		long time = now.getTime()-birth.getTime();
		time= time/1000/60/60/24;
		System.out.println("到今天为止一共活了"+time+"天");

		time = 10000-time;
		System.out.println("距离10000天还有"+time+"天");
		
		time = time*1000*60*60*24+now.getTime();
		now.setTime(time);
		System.out.println("生存10000天的纪念日是："+sdf.format(now));
				
	}

}
