package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * SimpleDateFormat�������÷���
 * 1.��ʱ��ת��Ϊ�ַ�����format��
 * 2.���ַ���ת��Ϊʱ�䣨parse��
 * Ҫ���û������Լ������գ���ʽΪ��
 * 1992-07-13
 * �������㣬�����
 * ������Ϊֹһ������XXXXt�졣
 * �Լ�����10000�컹�ж����졣
 * ����10000��ļ������ǣ�2018-12-05
 * @author Administrator
 *
 */
public class Test03 {
	public static void main(String[] args) throws ParseException {
		System.out.println("�������������գ�");
		Scanner scanner = new Scanner(System.in);
		String birthStr = scanner.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		Date birth = sdf.parse(birthStr);
		long time = now.getTime()-birth.getTime();
		time= time/1000/60/60/24;
		System.out.println("������Ϊֹһ������"+time+"��");

		time = 10000-time;
		System.out.println("����10000�컹��"+time+"��");
		
		time = time*1000*60*60*24+now.getTime();
		now.setTime(time);
		System.out.println("����10000��ļ������ǣ�"+sdf.format(now));
				
	}

}
