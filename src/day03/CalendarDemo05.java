package day03;

import java.util.Calendar;

/**
 * Calendar�м���ʱ��ķ���
 * void add(int field,int value)
 * ��ָ����ʱ��������ϸ�����ֵ����������ֵ�Ǹ�����
 * ���Ǽ�ȥ������ֵ��
 * @author Administrator
 *
 */
public class CalendarDemo05 {
	public static void main(String[] args) {
		/*
		 * �鿴3��2������1��5�Ժ�����ڣ�
		 * 
		 */
		Calendar calendar = Calendar.getInstance();
		//�鿴3���Ժ�
		calendar.add(Calendar.YEAR, 3);
		System.out.println(calendar.getTime());
		//�鿴3��2�����Ժ�
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		//�鿴3��2����һ���Ժ�
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		System.out.println(calendar.getTime());
		//�ٲ鿴5Сʱ��ǰ��
		calendar.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println(calendar.getTime());
		
		/**
		 * ���������ƿ�������
		 * Ҫ���û�����һ�����ڣ�Ȼ��Ը����ڽ���һϵ��
		 * �����㣬�ٽ�������������ʾ���û�ʱ��
		 * �������£�
		 * 1.��ȡ�û�����������ַ���
		 * 2.ʹ��SimpleDateFormat��Dateת��ΪDate
		 * 3.����һ��Calendar��ʹ���ʾDate��ʾ������
		 * 4.ʹ��Calendar�����������ʱ��
		 * 5.��Calendarת��Ϊһ��Date
		 * 6.ʹ��SimpleDateFormat��Dateת��Ϊ�ַ���
		 * ����ʾ���û�
		 */
	}
	
}
