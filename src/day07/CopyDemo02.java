package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**������
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * �����ֽ������������һ�Ը߼�����ʹ������
 * ���Լӿ��дЧ��
 * 
 * �߼������Դ���������������������˶��ٸ߼�����
 * ����¶�Ҫ�еͼ�������Ϊ�ͼ�������ʵ��д���ݵ�
 * �����߼������Ǵ������ݵġ�
 * �߼����������������γ����������ӣ�������Ч
 * ����ϲ�ͬ�ĸ߼������Եõ����ӵ�Ч����
 * @author Administrator
 *
 */
public class CopyDemo02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("fox_3.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		/*
		 * �������ڲ���һ��������
		 * ��bis.read������ȡ��һ���ֽ�ʱ��
		 * ʵ����BIS��һ���Զ�ȡһ���ֽڲ�
		 * �����ڲ����ֽ������У�Ȼ�󽫵�һ��
		 * �ֽڷ��أ����ٴε���read����ʱ��BIS
		 * ֱ�Ӵ��ֽ������н��ڶ����ֽڷ��أ�
		 * ֱ���ֽ������������ֽ�ȫ�����غ�
		 * �Ż��ٴζ�ȡһ���ֽڡ�
		 * ���Ի�����Ҳ���������һ�ζ�д��
		 * ���������ٶ�д�������ﵽ��߶�д
		 * Ч�ʵġ�
		 */
		int d = -1;
		
		while((d = bis.read())!=-1){
			bos.write(d);
		}
		System.out.println("������ϣ�");
		System.out.println();
		bis.close();
		bos.close();
	}
}
