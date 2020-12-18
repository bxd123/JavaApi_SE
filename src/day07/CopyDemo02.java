package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**缓冲流
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 缓冲字节输入输出流是一对高级流，使用它们
 * 可以加快读写效率
 * 
 * 高级流可以处理其他流，但无论添加了多少高级流，
 * 最底下都要有低级流，因为低级流是真实读写数据的
 * 流，高级流都是处理数据的。
 * 高级流处理其他流就形成了流的链接，并且有效
 * 的组合不同的高级流可以得到叠加的效果。
 * @author Administrator
 *
 */
public class CopyDemo02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("fox_3.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		/*
		 * 缓冲流内部有一个缓冲区
		 * 当bis.read方法读取第一个字节时，
		 * 实际上BIS会一次性读取一组字节并
		 * 存入内部的字节数组中，然后将第一个
		 * 字节返回，当再次调用read方法时，BIS
		 * 直接从字节数组中将第二个字节返回，
		 * 直到字节数组中所有字节全部返回后，
		 * 才会再次读取一组字节。
		 * 所以缓冲流也是依靠提高一次读写的
		 * 数据量减少读写次数来达到提高读写
		 * 效率的。
		 */
		int d = -1;
		
		while((d = bis.read())!=-1){
			bos.write(d);
		}
		System.out.println("复制完毕！");
		System.out.println();
		bis.close();
		bos.close();
	}
}
