package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 是用来读写文件数据
 * RAF是基于指针进行读写的，即，RAF
 * 总是在指针指向的位置读写字节，并且
 * 读写后指针会自动向后移动。
 * RAF即可以读写文件数据也可以向文件中
 * 写入数据。
 * @author Administrator
 *
 */
public class RandomAccessFileDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * 第二个参数为模式：常用有	
		 * r：只读模式
		 * rw:读写模式
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		/*
		 * void write(int d)
		 * 写出给定的int值对应的二进制的低八位
		 */
		raf.write(1);
		System.out.println("写出完毕！0");
		raf.close();
		
	}
}
