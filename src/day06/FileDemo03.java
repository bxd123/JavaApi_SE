package day06;

import java.io.File;

/**
 * 删除一个文件
 * @author Administrator
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		/*
		 * 删除当前目录中的test.txt文件
		 */
		File file = new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("删除完毕！");
		}else{
			System.out.println("文件不存在！");
		}
		
	}
}
