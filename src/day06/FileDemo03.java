package day06;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author Administrator
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		/*
		 * ɾ����ǰĿ¼�е�test.txt�ļ�
		 */
		File file = new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("ɾ����ϣ�");
		}else{
			System.out.println("�ļ������ڣ�");
		}
		
	}
}
