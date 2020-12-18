package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * �����������������ǿ��Խ��ж������л�
 * ��ȡһ���ֽڲ���ԭΪ����
 * OIS��ȡ���ֽڱ�������OOS���������л��õ�
 * ���ֽڣ�������׳��쳣��
 * @author Administrator
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//�������л�
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}
