package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ��ɼ��±�����
 * Ҫ��
 * ����������Ҫ���û�����һ���ļ�����Ȼ��
 * �������ļ���֮����ʾ�û���ʼ��������
 * �����û������ÿһ�����ݶ�����д�뵽���ļ���
 * ���û�����"exit"ʱ���˳�����
 * @author Administrator
 *
 */
public class Note {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ļ�����");
		FileOutputStream fos = new FileOutputStream(scanner.nextLine()+"."+"txt");
		System.out.println("�������ļ����ݣ�");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		PrintWriter pw = new PrintWriter(osw,true);
		String line = null;
		while(true){
			line = scanner.nextLine();
		if("exit".equals(line)){
			System.out.println("�ټ���");
			break;
		}
		/*
		 * ��PrintWriter�����Զ���ˢ�¹���
		 * ��ôÿ������println������ͻ��Զ�
		 * flush.
		 */
		pw.print(line);
		System.out.println("д����ϣ�");
		}
		pw.close();
	}
}
