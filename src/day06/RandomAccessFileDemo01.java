package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ��������д�ļ�����
 * RAF�ǻ���ָ����ж�д�ģ�����RAF
 * ������ָ��ָ���λ�ö�д�ֽڣ�����
 * ��д��ָ����Զ�����ƶ���
 * RAF�����Զ�д�ļ�����Ҳ�������ļ���
 * д�����ݡ�
 * @author Administrator
 *
 */
public class RandomAccessFileDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * �ڶ�������Ϊģʽ��������	
		 * r��ֻ��ģʽ
		 * rw:��дģʽ
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		/*
		 * void write(int d)
		 * д��������intֵ��Ӧ�Ķ����ƵĵͰ�λ
		 */
		raf.write(1);
		System.out.println("д����ϣ�0");
		raf.close();
		
	}
}
