package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * �����������
 * ����һ���������ڣ�һ�������ڵ�����
 * ������Ϊ����Ʒ������ǰ���ܵ�����
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������ڣ�(yyyy-MM-dd)");
		String dateStr = scanner.nextLine();
		System.out.println("�����뱣���ڵ�������");
		
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
		System.out.println("������Ϊ"+dateStr);
	}
}
