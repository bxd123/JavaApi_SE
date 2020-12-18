package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合提供了一对重载的add，remove方法
 * void add(int index,E e)
 * 将给定元素插入到指定位置。
 * 
 * E remove(int index)
 * 从集合中删除指定位置的元素，并将其返回。
 * 
 * @author Administrator
 *
 */
public class ListDemo02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		
		//[one ,two ,three ,four ,five ,six]
		System.out.println(list);
		//[one ,2 ,two ,three ,four ,five]
		list.add(1, "2");
		System.out.println(list);
		
		//[one ,2 ,three ,four ,five]
		String old = list.remove(2);
		System.out.println(list);
		System.out.println("old:"+old);
	}
}
