package day06;

import java.io.File;

/**
 * ����һ����Ŀ¼
 * @author Administrator
 *
 */
public class FileDemo04 {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´���һ����Ϊdemo��Ŀ¼
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("����Ŀ¼��ϣ�");
		}else{
			System.out.println("��Ŀ¼�Ѿ����ڣ�");
		}
	}
}
