package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * 字符流的读写单位为字符。
 * 字符流都是高级流，虽然以字符为单位读写数据
 * 但是实际底层还是读写字节，只是从字节与字符
 * 的转换工作交给了字符流来完成。
 * java.io.Reader:字符输入流的顶级父类
 * java.io.Writer:字符输出流的顶级父类
 * 
 * 转换流
 * java.io.OutputStreamWriter
 * 特点是可以按照指定的字符集写出字符
 * 
 * 之所以称OutputStreamWriter与InputStreamReader
 * 为转换流，是因为大多数的字符流都只处理其他字符流，
 * 而低级流又是字节流，这就导致字符流不能处理字节流的
 * 问题，转换流相当于是一个转换器的作用，他们可以将
 * 字节流先转换为字符流，这样其他的字符流就可以处理了。
 * 
 * @author Administrator
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("我爱北京天安门，");
		osw.write("天安门上太阳升");
		
		System.out.println("写出完毕！");
		osw.close();
	}
}
