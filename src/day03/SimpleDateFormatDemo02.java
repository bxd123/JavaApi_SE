package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ַ���ת��ΪDate
 * Date parse (String str)
 * ���������ַ�������SimpleDateFormatָ��������
 * ��ʽ����Ϊһ��Date����
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo02 {

	public static void main(String[] args) throws ParseException {
		String str = "2000-08-08 20:23:21";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		System.out.println(date);
	}

}
