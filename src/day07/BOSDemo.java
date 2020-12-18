package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲输出流
 * @author Administrator
 *
 */
public class BOSDemo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write("疯疯癫癫".getBytes("UTF-8"));
		//强制将缓冲区中的字节一次性写出
		bos.flush();
		System.out.println("写出完毕！");
		bos.close();
	}
}
