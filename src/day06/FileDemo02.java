package day06;

import java.io.File;
import java.io.IOException;
/**
 * 创建一个文件
 * @author Administrator
 *
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录下创建文件test.text
		 * 默认路径就是当前目录，即"./"
		 * 所以可以不写
		 */
		File file = new File("."+File.separator+"test.txt");
		/*
		 * boolean exists()
		 * 判断该文件是否真实存在
		 */
		if(file.exists()){
			System.out.println("该文件已存在！");
		}else{
			file.createNewFile();
			System.out.println("创建完毕！");
		}
	}
}
