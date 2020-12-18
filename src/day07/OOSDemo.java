package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 对象流
 * 对象流是一对高级流，作用是方便读写java中的
 * 对象。
 * java.io.ObjectOutputStream
 * 对象输出流，可以将给定的对象转换为一组字节
 * 后写出。
 * @author Administrator
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("奇文东");
		p.setAge(23);
		p.setGender("男");
		List<String> otherInfo = new ArrayList<String>();
		otherInfo.add("是一名演员");
		otherInfo.add("爱好写大字");
		otherInfo.add("促进文化交流");
		p.setOtherInfo(otherInfo);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * ObjectOutputStream的writeObject
		 * 方法可以将给定对象转换为一组字节
		 * 后写出，这些字节比该对象实际内容要大，
		 * 因为除了数据外还有结构等描述信息。
		 * 
		 * 下面的代码实际上经历了两个操作：
		 * 1：oos将Person对象转换为一组字节
		 * 	 将一个对象转换一组字节的过程称为：
		 * 	 对象序列化
		 * 2：再通过fos将这组字节写入到硬盘将
		 * 	 该对象转换的字节写入到硬盘做长久保
		 * 	 存的过程称为：对象持久化
		 */
		oos.writeObject(p);
		System.out.println("写出对象完毕！");
		
		oos.close();
	}
}
