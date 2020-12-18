package day06;

import java.io.File;

/**
 * 实现方法，来删除给定的文件或目录
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	public static void delete(File file){
		if(file.isDirectory()){
			//将其余子项删除
			File[] subs = file.listFiles();
			for(File sub:subs){
				delete(sub);//递归
			}
		}
		file.delete();
		
	}
}
