package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *��ѭ����������
 * @author Administrator
 *
 */
public class NewForDemo2 {
public static void main(String[] args) {
	Collection c = new ArrayList();
	c.add("one");
	c.add("#");
	c.add("two");
	c.add("#");
	c.add("three");
	System.out.println(c);
	/*
	 * ��ѭ�������µ��﷨����ѭ���Ǳ������Ͽɣ�
	 * ������������Ͽɡ�
	 * ʹ����ѭ����������ʱ���������Ὣ����Ϊ
	 * ��������ʽ������������ʹ����ѭ����������
	 * ʱ������ͨ�����ϵķ�����ɾԪ�ء�
	 */
	//Iterator it = c.iterator();
	//Object l = it.next();
	for(Object o :c){
		//while(it.hasNext()){
			String str = (String)o;
			System.out.println(str);
			if("#".equals(str)){	
				//it.remove();
			}
		}
	}
}