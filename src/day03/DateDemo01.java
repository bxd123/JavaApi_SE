package day03;

import java.util.Date;

/**
 *�ظ���ϵDate�������ϰ
 * @author Administrator
 *
 */
public class DateDemo01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		long time = now.getTime();
		time += 1000*60*60*24;
		now.setTime(time);
		System.out.println(now);
	}
}
