package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ����һ�����������ڸ�ʽ��String��Date�໥
 * ת����
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		/*
		 * 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * Date->String
		 * String format(Date date)
		 * format�������Խ�������date��������ʾ��
		 * ʱ�䰴��SimpleDateFormatָ�������ڸ�ʽ
		 * ת��Ϊ�ַ�����
		 */
		String str = sdf.format(now);
		System.out.println(str);
		
		
		
		
	}
}
