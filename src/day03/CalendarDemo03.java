package day03;

import java.util.Calendar;

/**
 * ��ȡһ��Calendar��ʾ��������
 * ����ʱ�������Ӧ��ֵ
 * @author Administrator
 *
 */
public class CalendarDemo03 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * int get(int field)
		 * ��ȡ��Ӧʱ�������ֵ
		 */
		//��ȡ��
		int year = calendar.get(Calendar.YEAR);
		//��ȡ��
		int month = calendar.get(Calendar.MONTH)+1;
		//��ȡ��
		int day = calendar.get(Calendar.DATE);
		//��ȡʱ
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		//��ȡ��
		int minute = calendar.get(Calendar.MINUTE);
		//��ȡ��
		int second = calendar.get(Calendar.SECOND);
		System.out.println(year+"-"+month+"-"+day+" "+hour+':'+minute+':'+second);
		
		//�鿴���ڼ�
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("��"+(dow==1?"��":dow-1));
		String[] data = {"��","һ","��","��","��","��","��"};
		System.out.println("��"+data[dow-1]);
		//������Ϊֹ�������Ѿ���������
		int doy = 365-calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(year+"��ʣ"+doy+"��");
	}
}
