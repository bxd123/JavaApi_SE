package day03;

import java.util.Calendar;

/**
 * 
 * ��ȡĳһ��ʱ���������������ֵ��
 * @author Administrator
 *
 */
public class CalendarDemo04 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//�����ܹ������죿
		int days = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//�鿴2017��2�¶����죿
		calendar.set(Calendar.MONTH, 1);
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//�����ܹ��ж����죿
		days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("�����ܹ���"+days+"��");
		
	}
}
