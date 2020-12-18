package day06;

import java.io.File;

/**
 * 创建一个新目录
 * @author Administrator
 *
 */
public class FileDemo04 {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建一个名为demo的目录
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("创建目录完毕！");
		}else{
			System.out.println("该目录已经存在！");
		}
	}
}
