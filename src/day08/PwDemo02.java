package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriterҲ�ṩ�˿��Դ����������Ĺ��췽��
 * �ṩ�ķ������Դ����ֽ�����Ҳ���Դ����ַ������ң�
 * ��ʹ�����๹�췽��ʱ�������ٴ���ڶ�����������
 * ����Ϊbooleanֵ����ֵΪtrueʱ����������Զ�
 * ��ˢ�¹��ܡ�
 * @author  Administrator
 *
 */
public class PwDemo02 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		PrintWriter pw = new PrintWriter(osw);
		
		pw.println("�˾�Ŷ");
		pw.println("Ů�ķ�");
		
		System.out.println("д����ϣ�");
		
		pw.close();
	}
}
