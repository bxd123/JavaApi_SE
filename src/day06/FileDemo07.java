package day06;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е���������
 * @author Administrator
 * 
 */
public class FileDemo07 {
	public static void main(String[] args) {
		/*
		 * 	��ȡ��ǰĿ¼�е���������
		 */
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * �ж��Ƿ�Ϊһ���ļ�
		 * 
		 * boolean isDirectory()
		 * �ж��Ƿ�Ϊһ��Ŀ¼
		 */
		if(dir.isDirectory()){
			/*
			 * File[] listFiles()
			 * ��ȡ��������
			 */
			File[] subs = dir.listFiles();
			for(File sub : subs){
				if(sub.isFile()){
					System.out.print("�ļ���");
				}else{
					System.out.print("Ŀ¼��");
				}
				System.out.println(sub);
			}
		}
	}
}
