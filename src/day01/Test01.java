package day01;

import java.util.Scanner;

/**
 * 编写一个程序，要求用户输入一个网址信息。
 * 格式如下：
 * www.baidu,com
 * www.baidu.com.cn
 * http://www.baidu.com
 * 然后经过处理，输出域名，如：baidu
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入域名：");
		String host = scan.next();
		int start = host.indexOf(".")+1;
		int end = host.indexOf(".",start);
		String sub = host.substring(start,end);
		System.out.println("域名："+sub);
	}

}
