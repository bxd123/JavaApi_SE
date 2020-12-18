package day05;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File的每一个实例可以表示文件系统中的一个文件或
 * 目录
 * 使用File可以：
 * 1.访问文件或目录的属性(如：大小，名字，修改时间等)
 * 2.操作文件或目录(创建，删除文件和目录)
 * 3.访问目录中的所有内容
 * 但是不可以：
 * 访问文件数据。
 * @author Administrator
 *
 */
public class FileDemo01 {
	public static void main(String[] args) {
					//			层级分隔符，用常量表示
		File file = new File("."+File.separator+"demo.txt");
		//获取文件名
		String name = file.getName();
		System.out.println("name:"+name);
		
		//大小(占用字节量)
		long length = file.length();
		System.out.println("大小"+length+"字节");
		 
		//是否为文件
		boolean isFile = file.isFile();
		System.out.println("是文件"+isFile);
		
		//是否为目录
		boolean isDir = file.isDirectory();
		System.out.println("是目录"+isDir);
		
		//是否隐藏
		boolean isHidden = file.isHidden();
		System.out.println("是否隐藏"+isHidden);
		
		//最后修改时间
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		//是否可读
		boolean canRead = file.canRead();
		System.out.println("是否可读："+canRead);
		//是否可写
		boolean canWrite = file.canWrite();
		System.out.println("是否可写："+canWrite);
		//是否可执行
		boolean canExecute = file.canExecute();
		System.out.println("是否可执行"+canExecute);
	}
}
