package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 完成记事本功能
 * 要求：
 * 程序启动后，要求用户输入一个文件名，然后
 * 创建该文件，之后提示用户开始输入内容
 * 并将用户输入的每一行内容都按行写入到该文件。
 * 当用户输入"exit"时，退出程序。
 * @author Administrator
 *
 */
public class Note {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个文件名：");
		FileOutputStream fos = new FileOutputStream(scanner.nextLine()+"."+"txt");
		System.out.println("请输入文件内容：");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		PrintWriter pw = new PrintWriter(osw,true);
		String line = null;
		while(true){
			line = scanner.nextLine();
		if("exit".equals(line)){
			System.out.println("再见！");
			break;
		}
		/*
		 * 若PrintWriter具有自动行刷新功能
		 * 那么每当调用println方法后就会自动
		 * flush.
		 */
		pw.print(line);
		System.out.println("写出完毕！");
		}
		pw.close();
	}
}
