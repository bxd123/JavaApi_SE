package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ����������ص㣺���ж�ȡ�ַ���
 * @author Administrator
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/day08/BRDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * BufferedRead�ṩ�˰��ж�ȡ�ķ���
		 * String readLine()
		 * ������ȡ���ɸ��ַ���֪����ȡ�����з�
		 * Ϊֹ���������з�֮���ȡ���ַ���һ��
		 * �ַ������ء�������ֵΪNULL�����ʾ
		 * ��ȡ��ĩβ��
		 * ע�⣺���ַ������������Ļ��з�
		 */
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
