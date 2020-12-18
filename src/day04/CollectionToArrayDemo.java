package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * @author Administrator
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		/*
		 * �����ṩ��һ������toArray,���Խ�
		 * ��ǰ����ת��Ϊ����
		 */
		//Object[] array = c.toArray();
		/*
		 * ���������������(������Դ�ż�������Ԫ��)ʱ
		 * ��ʹ�ø����飬�������ã����Զ�����һ�������
		 * ����ͬ���͵�����
		 */
		String[] array = c.toArray(new String[c.size()]);
		System.out.println("len:"+array.length);
		for(String str:array){
			System.out.println(str);
		}
	}
}
