package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串支持正则表达式方法二： String[] split(String regex) 将当前字符串按照满足正则表达式的部分进行拆分
 * 返回拆分部分后的内容。
 * 
 * @author Administrator
 *
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String str = "才看始地方了01";
		/*
		 * 按照数字拆分，保留所有的英文字母部分
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
