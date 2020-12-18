package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import day02.Point;

/**
 * 集合的批量操作
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
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("全包含："+contains);
		
		/*
		 * 从c1集合中删除两个集合共有的元素
		 */
		c1.removeAll(c3);
		System.out.println(c1);
	}
}
