package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Ҫ���û������Լ������գ���ʽΪ��
 * 1992-07-13
 * �������㣬�����
 * ������Ϊֹһ������XXXXt�졣
 * �Լ�����10000�컹�ж����졣
 * ����10000��ļ������ǣ�2018-12-05
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) throws ParseException  {
	System.out.println("�������������գ�");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date birth = sdf.parse(str);
	//�����Ѿ����˶����죿
	Date now = new Date();
	long time = now.getTime()-birth.getTime();
	time = time/1000/60/60/24;
	System.out.println("��ϲ����������Ϊֹ�Ѿ�����"+time+"�죡����������֣�");
	
	time = 10000-time;
	System.out.println("����10000�컹��"+time+"��");
	
	time = time*1000*60*60*24;
	now.setTime(now.getTime()+time);
	System.out.println("����10000��ļ������ǣ�"+sdf.format(now));
	}
}
