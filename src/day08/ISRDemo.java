package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * java.io.InputStreamReader
 * 字符输入流，可以按照给定的字符集读取字符
 * @author Administrator
 *
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		
		int d = -1;
		while((d = isr.read())!=-1){
			System.out.print((char)d);
		}
		isr.close();
	}
}
