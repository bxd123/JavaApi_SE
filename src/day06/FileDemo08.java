package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中符合条件的部分子项
 * 使用重载的listFiles方法，需要传入一个额外
 * 的文件过滤器、文件过滤器是一个接口：FileFilter
 * @author Administrator
 *
 */
public class FileDemo08 {
	public static void main(String[] args) {
		File dir = new File(".");
		/*
		 * 获取名字以"."开头的子项
		 */
		File[] subs = dir.listFiles(new FileFilter(){

			public boolean accept(File file) {
				System.out.println("正在过滤："+file.getName());
				return file.getName().startsWith(".");
			}});
		for(File sub:subs){
			System.out.println(sub.getName());
		}
	}
}
