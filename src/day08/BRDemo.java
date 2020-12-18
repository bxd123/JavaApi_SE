package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流，特点：按行读取字符串
 * @author Administrator
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/day08/BRDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * BufferedRead提供了按行读取的方法
		 * String readLine()
		 * 连续读取若干个字符，知道读取到换行符
		 * 为止，并将换行符之间读取的字符以一个
		 * 字符串返回。若返回值为NULL，则表示
		 * 读取到末尾。
		 * 注意：该字符串不包含最后的换行符
		 */
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
