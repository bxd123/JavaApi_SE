package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 集合，用于存储一组元素，提供了维护集合的相关操作。
 * 其派生出了两个接口：
 * List：可重复集
 * Set：不可重复集
 * 元素是否重复是依靠自身equals方法比较的结果
 * 而定。
 * @author Administrator
 *
 */
public class CollectionDemo01 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * 向集合中添加元素。
		 * 当元素成功添加到集合后返回true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println(c);
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 */
		System.out.println("size:"+c.size());
		
		/*
		 * boolean isEmpty()
		 * 判断当前集合是否不含任何元素
		 * 空集合
		 * 
		 */
		  boolean isEmpty=c.isEmpty();
		  System.out.println("是否是空集："+isEmpty);
		  
		  /*
		   * void clear()
		   * 清空集合元素
		   */
		  System.out.println("清空集合");
		  c.clear();
		  
		  System.out.println("size:"+c.size());
		  System.out.println("是否是空集："+c.isEmpty());
	}
}
