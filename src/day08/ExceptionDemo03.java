package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * finally对于流的处理
 * @author Administrator
 *
 */
public class ExceptionDemo03 {
	public static void main(String[] args) {
		//FileInputStream fos = new FileInputStream("");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("src/day08/ExceptionDemo03.java")));
			String line = null;
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("出错啦！");
		} finally{
			if(br!=null){
				//System.out.println(br);
				try {
					br.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
