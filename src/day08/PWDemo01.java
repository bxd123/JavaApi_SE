package day08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * �����ַ���
 * BufferedWriter,BufferedReader
 * �ص��ǿ��԰��ж�д�ַ���
 * 
 * java.io.PrintWriter
 * �����Զ���ˢ�µĻ����ַ������
 * ����PWʱ����һ�������ڲ�����BufferedWriter
 * ��Ϊ���幦�ܵĵ��ӡ�
 * @author Administrator
 *
 */
public class PWDemo01 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * �ṩ�˶��ֹ��췽��
		 * ��������������ֱ�Ӷ��ļ�����д��
		 * �����Ĺ��췽����
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		pw.write("�����յ��磬");
		pw.write("���κ�������");
		pw.write("˭֪���вͣ�");
		pw.write("���������ࡣ");
		System.out.println("д����ϣ�");
		System.out.println();
		pw.close();
	}
}
