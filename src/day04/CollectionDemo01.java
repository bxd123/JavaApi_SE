package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * 删除集合元素
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
		 * 从集合中删除指定元素。删除成功返回true
		 * 只删除集合中第一个与给定元素equals比较
		 * 为true的元素。
		 * 
		 */
		c.remove(p);
		System.out.println("删除完毕！");
		System.out.println(c);
	}
}
