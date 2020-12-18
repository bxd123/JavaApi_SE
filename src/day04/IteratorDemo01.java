package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合
 * Collection提供了统一的遍历集合元素的
 * 方式：迭代器模式
 * 
 * Iterator iterator()
 * 获取用于遍历当前集合的迭代器
 * 
 * java.util.Iterator是一个接口，规定了用于遍历
 * 集合元素的相关方法，不同的集合提供了相应的实现类。
 * 无需记住那些实现类的名字，只将他们当作Iterator即可。
 * 
 * 遍历集合遵循：问，取，删的步骤，其中删除不是必须操作。
 * @author Administrator
 *
 */
public class IteratorDemo01 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("one");
		c1.add("#");
		c1.add("two");
		c1.add("#");
		c1.add("three");
		c1.add("#");
		c1.add("four");
		//获取用于遍历当前元素的迭代器
		Iterator it = c1.iterator();
		/*
		 * boolean hasNext();
		 * 该方法是判断集合中是否还有元素可以取出
		 * 
		 * E next() 取的过程
		 * 获取集合中下一个元素。
		 */
		while(it.hasNext()){
			String str = (String)it.next();
			if("#".equals(str)){
				/*
				 * 在使用迭代器遍历集合时，不要
				 * 使用集合的方法增删元素，否则
				 * 会引发异常。
				 */
				//c1.remove(str);
				it.remove();
			}
			System.out.println(str);
			
		}
		System.out.println(c1);
	}
}
