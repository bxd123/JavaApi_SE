package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * ��ȡһ��Ŀ¼�з��������Ĳ�������
 * ʹ�����ص�listFiles��������Ҫ����һ������
 * ���ļ����������ļ���������һ���ӿڣ�FileFilter
 * @author Administrator
 *
 */
public class FileDemo08 {
	public static void main(String[] args) {
		File dir = new File(".");
		/*
		 * ��ȡ������"."��ͷ������
		 */
		File[] subs = dir.listFiles(new FileFilter(){

			public boolean accept(File file) {
				System.out.println("���ڹ��ˣ�"+file.getName());
				return file.getName().startsWith(".");
			}});
		for(File sub:subs){
			System.out.println(sub.getName());
		}
	}
}
