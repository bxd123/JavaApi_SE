package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ��������ļ�
 * 
 * @author Administrator
 *
 */
public class CopyDemo01 {
	public static void main(String[] args) throws IOException {
	/*
	FileInputStream fis = new FileInputStream("fos.txt");
	byte[] data1 = new byte[100];
	int len = fis.read(data1);
	
	String str = new String(data1,0,len,"utf-8");
	System.out.println(str);
	FileOutputStream fos = new FileOutputStream("fos_1.txt");
	byte[] data2 = str.getBytes("utf-8");
	fos.write(data2);
	String str1 = new String(data2,"utf-8");
	System.out.println(str1);
	*/
		/*
		 * ʹ���ļ���������ȡԭ�ļ�����ʹ��
		 * �ļ��������Ŀ���ļ���д��
		 * ˳���ԭ�ļ��ж�ȡÿ���ֽڲ�д��
		 * ��Ŀ���ļ�������ɸ��ơ�
		 */
		FileInputStream scr = new FileInputStream("fos.txt");
		FileOutputStream desc = new FileOutputStream("fos_2.txt");
		byte[] buf= new byte[1024*10];
		int len = -1;
		while((len = scr.read(buf))!=-1){
			desc.write(buf,0,len);
			//String str = new String(buf,0,len,"UTF-8");
			//System.out.println(str);
		}
		System.out.println("������ϣ�");
		scr.close();
		desc.close();
	}
}
