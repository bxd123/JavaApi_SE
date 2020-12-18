package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ������߶�дЧ�ʣ�����ͨ�����ÿ�ζ�д��������
 * �����ٶ�д�����ﵽ��
 * @author Administrator
 *
 */
public class CopyDemo02 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile scr = new RandomAccessFile("Դ��.jar","r");
		RandomAccessFile desc = new RandomAccessFile("Դ��-.jar","rw");
		/*
		 * int read(byte[] data)
		 * һ���Գ��Զ�ȡ�������ֽ������ܳ��ȵ��ֽ���
		 * �����뵽�������У�����ֵΪʵ�ʶ�ȡ�����ֽ�
		 * ����������ֵΪ-1�����ʾ����û�ж�ȡ���κ�
		 * ����(�ļ�ĩβ)
		 */
		//10k����
		byte[] buf= new byte[1024*10];
		int len = -1;
		long start = System.currentTimeMillis();
		while((len = scr.read(buf))!=-1){
			/*
			 * void writer(byte[] data)
			 * һ���Խ��������ֽ������е�����
			 * �ֽ�д��
			 * 
			 * void write(byte[] d,int start,int end)
			 * �����������д��±�start����ʼ������len���ֽ�
			 * һ����д��
			 */
			desc.write(buf,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"����");
		scr.close();
		desc.close();
	}
}
