package day02;

import java.util.Scanner;

/**
 * 验证手机号的正则表达式
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
	/*
	 * 要求用户输入一个手机号，然后经过
	 * 验证输出是否是手机号。
	 */
	System.out.println("请输入一个手机号：");
	Scanner scan = new Scanner(System.in);
	String line = scan.next();
	/*
	 * (\+86|0086)?\s*1[0-9]{10}
	 */
	String regex = "1[0-9]{10}";
	if(line.matches(regex)){
		System.out.println("是手机号");
	}else{
		System.out.println("不是手机号");
		}
	}
	String r = "2[0-9]{10}";
	
}
