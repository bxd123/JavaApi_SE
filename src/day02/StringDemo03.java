package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �ַ���֧��������ʽ�������� String[] split(String regex) ����ǰ�ַ�����������������ʽ�Ĳ��ֽ��в��
 * ���ز�ֲ��ֺ�����ݡ�
 * 
 * @author Administrator
 *
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String str = "�ſ�ʼ�ط���01";
		/*
		 * �������ֲ�֣��������е�Ӣ����ĸ����
		 */
		 String regex = "^[\u3400-\u9FFF]+";
//		String regex = "[0-9]+";
//		String[] arr = str.split(regex);
//		List<String> list = new ArrayList<String>();
//		System.out.println("len:" + arr.length);
//		for (int i = 0; i < arr.length; i++) {
//			list.add(arr[i]);
//		}
//		System.out.println(list.size());
//		System.out.println(list);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.replaceAll("").trim());
	}
}
