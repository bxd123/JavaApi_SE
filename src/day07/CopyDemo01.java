package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制文件
 * 
 * @author Administrator
 *
 */
public class CopyDemo01 {
	public static void main(String[] args) throws IOException {
	/*
	FileInputStream fis = new FileInputStream("fos.txt");
	byte[] data1 = new byte[100];
	int len = fis.read(data1);
	
	String str = new String(data1,0,len,"utf-8");
	System.out.println(str);
	FileOutputStream fos = new FileOutputStream("fos_1.txt");
	byte[] data2 = str.getBytes("utf-8");
	fos.write(data2);
	String str1 = new String(data2,"utf-8");
	System.out.println(str1);
	*/
		/*
		 * 使用文件输入流读取原文件，在使用
		 * 文件输出流向目标文件中写。
		 * 顺序从原文件中读取每个字节并写入
		 * 到目标文件即可完成复制。
		 */
		FileInputStream scr = new FileInputStream("fos.txt");
		FileOutputStream desc = new FileOutputStream("fos_2.txt");
		byte[] buf= new byte[1024*10];
		int len = -1;
		while((len = scr.read(buf))!=-1){
			desc.write(buf,0,len);
			//String str = new String(buf,0,len,"UTF-8");
			//System.out.println(str);
		}
		System.out.println("复制完毕！");
		scr.close();
		desc.close();
	}
}
