package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * ������
 * ������һ�������࣬��װ�˶�ʱ�����ز�����
 * ���õ�ʵ��������{����(����)
 * ʹ����������Ϊ�˶�ʱ�������صĲ�����
 * �������ʱ�䡣
 * 
 * @author Administrator
 *
 */
public class CalendarDemo01 {
	public static void main(String[] args) {
		/*
		 * ʹ��Calendar�ľ�̬��������ʵ����
		 * �÷�������ݵ�ǰϵͳ���ڵ�������
		 * һ����Ӧ��ʵ�֣�ͨ����GregorianCalendar
		 * Ĭ�ϴ���������ʵ����ʾ��ǰϵͳʱ��
		 */
		Calendar calendar = Calendar.getInstance();
		/*
		 * toString����ֱ�۷�ӳ��ʾ������
		 */
		System.out.println(calendar);
		/*
		 * Calendar��Date֮���ת��
		 * 
		 * 
		 * Calendar->Date
		 * Date getTime()
		 * Calendar�ṩ�˷���getTime���÷���
		 * ����һ��Date���󣬸ö����ʾ��ʱ�����
		 * ��ǰCalendar��ʾ��ʱ�䡣
		 * 
		 */
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		/*
		 * Date ->Calendar 
		 * void setTime(Date date)
		 * Calendar��setTime��������ʹ�õ�ǰ
		 * Calendar��ʾ����Date����ʾ��ʱ�䡣
		 * CalendarҲ��ʾ������һʱ�̡�
		 */
		date.setTime(date.getTime()+1000*60*60*24);
		System.out.println(date);
		// calendar.setTime(date);
		
	}
}
