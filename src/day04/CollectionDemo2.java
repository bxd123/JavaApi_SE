package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import day02.Point;

/**
 * ���ϵ���������
 * @author Administrator
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add("c#");
		
		System.out.println(c1);
		
		Collection c2 = new HashSet();
		c2.add("android");
		c2.add("liuxe");
		c2.add("windows");
		System.out.println(c2);
		
		boolean flag = c1.addAll(c2);
		System.out.println(c1);
		System.out.println(flag);
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("android");
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("ȫ������"+contains);
		
		/*
		 * ��c1������ɾ���������Ϲ��е�Ԫ��
		 */
		c1.removeAll(c3);
		System.out.println(c1);
	}
}
