package day01;

import java.util.Scanner;

/**
 * ��дһ������Ҫ���û�����һ����ַ��Ϣ��
 * ��ʽ���£�
 * www.baidu,com
 * www.baidu.com.cn
 * http://www.baidu.com
 * Ȼ�󾭹���������������磺baidu
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������������");
		String host = scan.next();
		int start = host.indexOf(".")+1;
		int end = host.indexOf(".",start);
		String sub = host.substring(start,end);
		System.out.println("������"+sub);
	}

}
