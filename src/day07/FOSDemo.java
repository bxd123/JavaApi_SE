package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 流
 * 流根据方向不同分为输入流和输出流，参照点为
 * 当前程序
 * 输入流用来读取数据，输出流用来写出数据
 * java.io.InputStream
 * 抽象类，定义了输入流的读取字节的方法，所有的
 * 字节输出流都继承自它
 * 
 * java.io.OutputStream则是所有字节输出流的
 * 父类
 * 
 * 流分为节点流和处理流
 * 节点流，也叫低级流。是真实负责读写数据的流
 * 读写操作中必须要有低级流。数据源明确。
 * 
 * 处理流，也叫高级流。读写可以没有高级流，高级流
 * 也不能独立存在，必须用于处理其他流，处理其他流的
 * 目的是简化读写数据中的操作。
 * 
 * java.io.FileOutputStream
 * 文件输出流，是一个低级流，作用是向文件中写出字节。
 * 
 * @author Administrator
 *
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 默认创建的FOS是覆盖写操作
		 * FOS会先将文件数据(若有数据)
		 * 全部删除，然后在开始写。
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt");
		String str = "你送饭，反了天了！";
		/*
		 * String->byte[]
		 * byte getBytes()
		 * 将当前字符串按照系统默认字符集转换
		 * 为一组字节
		 * byte getBytes(String csn)
		 * 按照给定字符集将当前字符串转换为
		 * 一组字节
		 */
		byte[] data = str.getBytes("UTF-8");
		fos.write(data);
		System.out.println("写出完毕！");
		fos.close();
	}
}
