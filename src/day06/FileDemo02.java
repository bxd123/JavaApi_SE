package day06;

import java.io.File;
import java.io.IOException;
/**
 * ����һ���ļ�
 * @author Administrator
 *
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼�´����ļ�test.text
		 * Ĭ��·�����ǵ�ǰĿ¼����"./"
		 * ���Կ��Բ�д
		 */
		File file = new File("."+File.separator+"test.txt");
		/*
		 * boolean exists()
		 * �жϸ��ļ��Ƿ���ʵ����
		 */
		if(file.exists()){
			System.out.println("���ļ��Ѵ��ڣ�");
		}else{
			file.createNewFile();
			System.out.println("������ϣ�");
		}
	}
}
