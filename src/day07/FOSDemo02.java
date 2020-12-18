package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 文件输出流
 * 追加写操作
 * @author Administrator
 *
 */
public class FOSDemo02 {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		/*
		 * 在创建FOS时，若指定第二个参数，并且
		 * 该值为true时，则是追加写操作，那么
		 * 本次通过FOS写出的内容会被追加到该文件
		 * 末尾。
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		fos.write("你不行".getBytes("UTF-8"));
		System.out.println("写出完毕！");
		fos.close();
	}
}
