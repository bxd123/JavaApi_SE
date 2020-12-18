package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *读取文件数据
 * @author Administrator
 *
 */
public class RandomAccessFileDemo02 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf= new RandomAccessFile("raf.dat","r");
		/*
		 * int read()
		 * 读取一个字节，并以10进制的int型返回
		 * 若返回值为-1，则表示读取到了文件末尾
		 */
		int d = raf.read();
		System.out.println("读取文件数据完毕！");
		System.out.println(d);
		raf.close();
	}
}
