package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * ɾ������Ԫ��
 * @author Administrator
 *
 */
public class CollectionDemo01 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/*
		 * boolean remove(E e)
		 * �Ӽ�����ɾ��ָ��Ԫ�ء�ɾ���ɹ�����true
		 * ֻɾ�������е�һ�������Ԫ��equals�Ƚ�
		 * Ϊtrue��Ԫ�ء�
		 * 
		 */
		c.remove(p);
		System.out.println("ɾ����ϣ�");
		System.out.println(c);
	}
}
