package day06;

import java.io.File;

/**
 * ʵ�ַ�������ɾ���������ļ���Ŀ¼
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
			//����������ɾ��
			File[] subs = file.listFiles();
			for(File sub:subs){
				delete(sub);//�ݹ�
			}
		}
		file.delete();
		
	}
}
