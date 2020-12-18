package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author Administrator
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 创建一个RAF读取原文件，在创建一个
		 * RAF向目标文件中写出。
		 * 顺序从原文件中读取每一个字节并写入
		 * 到目标文件中即可。
		 */
		RandomAccessFile scr = new RandomAccessFile("源码.jar","r");
		RandomAccessFile desc = new RandomAccessFile("源码_.jar","rw");
		//用来保存读取的字节
		int d = -1;
		long start = System.currentTimeMillis();
		while((d=scr.read())!=-1){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+((end-start)/1000)+"秒");
		scr.close();
		desc.close();
	}
}
