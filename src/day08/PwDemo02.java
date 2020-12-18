package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriter也提供了可以处理其他流的构造方法
 * 提供的方法可以传入字节流，也可以处理字符流并且，
 * 当使用这类构造方法时，可以再传入第二个参数，该
 * 参数为boolean值，该值为true时，则具有了自动
 * 行刷新功能。
 * @author  Administrator
 *
 */
public class PwDemo02 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		PrintWriter pw = new PrintWriter(osw);
		
		pw.println("了就哦");
		pw.println("女的佛");
		
		System.out.println("写出完毕！");
		
		pw.close();
	}
}
