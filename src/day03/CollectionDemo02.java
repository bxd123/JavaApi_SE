package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ�ء�
 * @author Administrator
 *
 */
public class CollectionDemo02 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		System.out.println(c);
		
		Point p = new Point(3,4);
		//c.add(p);
		/*
		 * �����ж��Ƿ����ָ��Ԫ��������Ԫ�ص�equals
		 * �ȽϵĽ����ֻҪ��������Ԫ�������Ԫ�رȽ�Ϊ
		 * true������Ϊ������
		 * 
		 */
		boolean contains = c.contains(p);
		System.out.println("����"+contains);
	}
}
