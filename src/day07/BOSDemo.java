package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * ���������
 * @author Administrator
 *
 */
public class BOSDemo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write("�����".getBytes("UTF-8"));
		//ǿ�ƽ��������е��ֽ�һ����д��
		bos.flush();
		System.out.println("д����ϣ�");
		bos.close();
	}
}
