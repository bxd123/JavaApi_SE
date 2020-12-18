package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 若想提高读写效率，可以通过提高每次读写的数据量
 * 来减少读写次数达到。
 * @author Administrator
 *
 */
public class CopyDemo02 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile scr = new RandomAccessFile("源码.jar","r");
		RandomAccessFile desc = new RandomAccessFile("源码-.jar","rw");
		/*
		 * int read(byte[] data)
		 * 一次性尝试读取给定的字节数组总长度的字节量
		 * 并存入到该数组中，返回值为实际读取到的字节
		 * 量，若返回值为-1，则表示本次没有读取到任何
		 * 数据(文件末尾)
		 */
		//10k缓冲
		byte[] buf= new byte[1024*10];
		int len = -1;
		long start = System.currentTimeMillis();
		while((len = scr.read(buf))!=-1){
			/*
			 * void writer(byte[] data)
			 * 一次性将给定的字节数组中的所有
			 * 字节写出
			 * 
			 * void write(byte[] d,int start,int end)
			 * 将给定数组中从下标start处开始的连续len个字节
			 * 一次性写出
			 */
			desc.write(buf,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)+"毫秒");
		scr.close();
		desc.close();
	}
}
