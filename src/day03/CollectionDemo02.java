package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素。
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
		 * 集合判断是否包含指定元素是依靠元素的equals
		 * 比较的结果。只要集合中有元素与给定元素比较为
		 * true，则认为包含。
		 * 
		 */
		boolean contains = c.contains(p);
		System.out.println("包含"+contains);
	}
}
