package day05;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File��ÿһ��ʵ�����Ա�ʾ�ļ�ϵͳ�е�һ���ļ���
 * Ŀ¼
 * ʹ��File���ԣ�
 * 1.�����ļ���Ŀ¼������(�磺��С�����֣��޸�ʱ���)
 * 2.�����ļ���Ŀ¼(������ɾ���ļ���Ŀ¼)
 * 3.����Ŀ¼�е���������
 * ���ǲ����ԣ�
 * �����ļ����ݡ�
 * @author Administrator
 *
 */
public class FileDemo01 {
	public static void main(String[] args) {
					//			�㼶�ָ������ó�����ʾ
		File file = new File("."+File.separator+"demo.txt");
		//��ȡ�ļ���
		String name = file.getName();
		System.out.println("name:"+name);
		
		//��С(ռ���ֽ���)
		long length = file.length();
		System.out.println("��С"+length+"�ֽ�");
		 
		//�Ƿ�Ϊ�ļ�
		boolean isFile = file.isFile();
		System.out.println("���ļ�"+isFile);
		
		//�Ƿ�ΪĿ¼
		boolean isDir = file.isDirectory();
		System.out.println("��Ŀ¼"+isDir);
		
		//�Ƿ�����
		boolean isHidden = file.isHidden();
		System.out.println("�Ƿ�����"+isHidden);
		
		//����޸�ʱ��
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		//�Ƿ�ɶ�
		boolean canRead = file.canRead();
		System.out.println("�Ƿ�ɶ���"+canRead);
		//�Ƿ��д
		boolean canWrite = file.canWrite();
		System.out.println("�Ƿ��д��"+canWrite);
		//�Ƿ��ִ��
		boolean canExecute = file.canExecute();
		System.out.println("�Ƿ��ִ��"+canExecute);
	}
}
