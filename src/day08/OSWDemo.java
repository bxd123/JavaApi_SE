package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * �ַ����Ķ�д��λΪ�ַ���
 * �ַ������Ǹ߼�������Ȼ���ַ�Ϊ��λ��д����
 * ����ʵ�ʵײ㻹�Ƕ�д�ֽڣ�ֻ�Ǵ��ֽ����ַ�
 * ��ת�������������ַ�������ɡ�
 * java.io.Reader:�ַ��������Ķ�������
 * java.io.Writer:�ַ�������Ķ�������
 * 
 * ת����
 * java.io.OutputStreamWriter
 * �ص��ǿ��԰���ָ�����ַ���д���ַ�
 * 
 * ֮���Գ�OutputStreamWriter��InputStreamReader
 * Ϊת����������Ϊ��������ַ�����ֻ���������ַ�����
 * ���ͼ��������ֽ�������͵����ַ������ܴ����ֽ�����
 * ���⣬ת�����൱����һ��ת���������ã����ǿ��Խ�
 * �ֽ�����ת��Ϊ�ַ����������������ַ����Ϳ��Դ����ˡ�
 * 
 * @author Administrator
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("�Ұ������찲�ţ�");
		osw.write("�찲����̫����");
		
		System.out.println("д����ϣ�");
		osw.close();
	}
}
