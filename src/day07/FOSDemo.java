package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * ��
 * �����ݷ���ͬ��Ϊ������������������յ�Ϊ
 * ��ǰ����
 * ������������ȡ���ݣ����������д������
 * java.io.InputStream
 * �����࣬�������������Ķ�ȡ�ֽڵķ��������е�
 * �ֽ���������̳�����
 * 
 * java.io.OutputStream���������ֽ��������
 * ����
 * 
 * ����Ϊ�ڵ����ʹ�����
 * �ڵ�����Ҳ�еͼ���������ʵ�����д���ݵ���
 * ��д�����б���Ҫ�еͼ���������Դ��ȷ��
 * 
 * ��������Ҳ�и߼�������д����û�и߼������߼���
 * Ҳ���ܶ������ڣ��������ڴ�����������������������
 * Ŀ���Ǽ򻯶�д�����еĲ�����
 * 
 * java.io.FileOutputStream
 * �ļ����������һ���ͼ��������������ļ���д���ֽڡ�
 * 
 * @author Administrator
 *
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * Ĭ�ϴ�����FOS�Ǹ���д����
		 * FOS���Ƚ��ļ�����(��������)
		 * ȫ��ɾ����Ȼ���ڿ�ʼд��
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt");
		String str = "���ͷ����������ˣ�";
		/*
		 * String->byte[]
		 * byte getBytes()
		 * ����ǰ�ַ�������ϵͳĬ���ַ���ת��
		 * Ϊһ���ֽ�
		 * byte getBytes(String csn)
		 * ���ո����ַ�������ǰ�ַ���ת��Ϊ
		 * һ���ֽ�
		 */
		byte[] data = str.getBytes("UTF-8");
		fos.write(data);
		System.out.println("д����ϣ�");
		fos.close();
	}
}
