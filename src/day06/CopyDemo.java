package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ�
 * @author Administrator
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ����һ��RAF��ȡԭ�ļ����ڴ���һ��
		 * RAF��Ŀ���ļ���д����
		 * ˳���ԭ�ļ��ж�ȡÿһ���ֽڲ�д��
		 * ��Ŀ���ļ��м��ɡ�
		 */
		RandomAccessFile scr = new RandomAccessFile("Դ��.jar","r");
		RandomAccessFile desc = new RandomAccessFile("Դ��_.jar","rw");
		//���������ȡ���ֽ�
		int d = -1;
		long start = System.currentTimeMillis();
		while((d=scr.read())!=-1){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+((end-start)/1000)+"��");
		scr.close();
		desc.close();
	}
}
