package day02;

import java.util.Scanner;

/**
 * ��֤�ֻ��ŵ�������ʽ
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
	/*
	 * Ҫ���û�����һ���ֻ��ţ�Ȼ�󾭹�
	 * ��֤����Ƿ����ֻ��š�
	 */
	System.out.println("������һ���ֻ��ţ�");
	Scanner scan = new Scanner(System.in);
	String line = scan.next();
	/*
	 * (\+86|0086)?\s*1[0-9]{10}
	 */
	String regex = "1[0-9]{10}";
	if(line.matches(regex)){
		System.out.println("���ֻ���");
	}else{
		System.out.println("�����ֻ���");
		}
	}
	String r = "2[0-9]{10}";
	
}
