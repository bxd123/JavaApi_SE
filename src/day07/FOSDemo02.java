package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * �ļ������
 * ׷��д����
 * @author Administrator
 *
 */
public class FOSDemo02 {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		/*
		 * �ڴ���FOSʱ����ָ���ڶ�������������
		 * ��ֵΪtrueʱ������׷��д��������ô
		 * ����ͨ��FOSд�������ݻᱻ׷�ӵ����ļ�
		 * ĩβ��
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		fos.write("�㲻��".getBytes("UTF-8"));
		System.out.println("д����ϣ�");
		fos.close();
	}
}
