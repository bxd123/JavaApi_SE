package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入自己的生日，格式为：
 * 1992-07-13
 * 经过计算，输出：
 * 到今天为止一共活了XXXXt天。
 * 以及距离10000天还有多少天。
 * 生存10000天的纪念日是：2018-12-05
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) throws ParseException  {
	System.out.println("请输入您的生日：");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date birth = sdf.parse(str);
	//计算已经活了多少天？
	Date now = new Date();
	long time = now.getTime()-birth.getTime();
	time = time/1000/60/60/24;
	System.out.println("恭喜您！到今天为止已经活了"+time+"天！，请继续保持！");
	
	time = 10000-time;
	System.out.println("距离10000天还有"+time+"天");
	
	time = time*1000*60*60*24;
	now.setTime(now.getTime()+time);
	System.out.println("生存10000天的纪念日是："+sdf.format(now));
	}
}
