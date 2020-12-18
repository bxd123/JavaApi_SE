package day08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * BufferedWriter,BufferedReader
 * 特点是可以按行读写字符串
 * 
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流
 * 创建PW时，它一定会在内部创建BufferedWriter
 * 作为缓冲功能的叠加。
 * @author Administrator
 *
 */
public class PWDemo01 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * 提供了多种构造方法
		 * 其中有两个可以直接对文件进行写出
		 * 操作的构造方法：
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		pw.write("锄禾日当午，");
		pw.write("汗滴禾下土。");
		pw.write("谁知盘中餐，");
		pw.write("粒粒皆辛苦。");
		System.out.println("写出完毕！");
		System.out.println();
		pw.close();
	}
}
