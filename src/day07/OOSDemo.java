package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * ��������һ�Ը߼����������Ƿ����дjava�е�
 * ����
 * java.io.ObjectOutputStream
 * ��������������Խ������Ķ���ת��Ϊһ���ֽ�
 * ��д����
 * @author Administrator
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("���Ķ�");
		p.setAge(23);
		p.setGender("��");
		List<String> otherInfo = new ArrayList<String>();
		otherInfo.add("��һ����Ա");
		otherInfo.add("����д����");
		otherInfo.add("�ٽ��Ļ�����");
		p.setOtherInfo(otherInfo);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * ObjectOutputStream��writeObject
		 * �������Խ���������ת��Ϊһ���ֽ�
		 * ��д������Щ�ֽڱȸö���ʵ������Ҫ��
		 * ��Ϊ���������⻹�нṹ��������Ϣ��
		 * 
		 * ����Ĵ���ʵ���Ͼ���������������
		 * 1��oos��Person����ת��Ϊһ���ֽ�
		 * 	 ��һ������ת��һ���ֽڵĹ��̳�Ϊ��
		 * 	 �������л�
		 * 2����ͨ��fos�������ֽ�д�뵽Ӳ�̽�
		 * 	 �ö���ת�����ֽ�д�뵽Ӳ�������ñ�
		 * 	 ��Ĺ��̳�Ϊ������־û�
		 */
		oos.writeObject(p);
		System.out.println("д��������ϣ�");
		
		oos.close();
	}
}
