package day03;

import java.util.Calendar;

/**
 * Calendar�ṩ����Բ�ͬʱ�������������
 * ֵ�ķ�����
 * void set(int field,int value)
 * ���е�һ������Ϊ��ʱ����������磺�꣬�£���
 * �ڶ�������Ϊ��Ӧ��ֵ��
 * ʱ�������һ��intֵ��ʹ��Calendar�ṩ�ĳ�����
 * @author Administrator
 *
 */
public class CalendarDemo02 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		/*
		 * ����Calendar��ʹ���ʾ
		 * 2008-08-08 20:08:08
		 * 
		 */
		//�趨��
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		/*
		 * ������
		 * �´��㿪ʼ��0��ʾ1��
		 * ���߿���ʹ�þ����µĳ���
		 */
		//calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.MONTH, 7);
		System.out.println(calendar.getTime());
		/*
		 * ������
		 * ��Ӧ��ʱ��������õ�
		 * DATE�� ������
		 * DAY_OF_MONTH:���е��죬��DATEһ��
		 * DAY_OF_WEEK:���е��죬���ڼ�
		 * DAY_OF_YEAR:���е���
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
