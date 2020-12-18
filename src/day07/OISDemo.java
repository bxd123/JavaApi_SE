package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * 对象输入流，作用是可以进行对象反序列化
 * 读取一组字节并还原为对象
 * OIS读取的字节必须是由OOS将对象序列化得到
 * 的字节，否则会抛出异常。
 * @author Administrator
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//对象反序列化
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}
