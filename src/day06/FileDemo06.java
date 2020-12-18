package day06;

import java.io.File;

/**
 * 删除目录
 * delete方法可以删除一个目录，但是前提是该目录
 * 必须是一个空目录
 * @author Administrator
 *
 */
public class FileDemo06 {
	public static void main(String[] args) {
		File dir = new File("demo");
		if(dir.exists()){
			dir.delete();
			System.out.println("删除完毕！");
		}else{
			System.out.println("已经删除！");
		}
	}
}
