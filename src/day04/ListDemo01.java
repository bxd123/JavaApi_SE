package day04;

import java.util.LinkedList;
import java.util.List;

/**
 * java.util.List
 * 可重复集，并且有序。
 * 特点是可以根据下标操作元素。
 * 常用实现类：
 * ArrayList:使用数组实现，查询更快
 * LinkedList:使用链表实现，增删更快(首尾增删效果明显)
 * @author Administrator
 *
 */
public class ListDemo01 {
	public static void main(String[] args) {
		/*
		 * E set(int index,E e)
		 * 将给定元素设置到指定位置上，返回值为
		 * 原位置的元素。所以是替换元素操作
		 */
		List<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		//[one , two ,three , four]
		System.out.println(list);
		//[one , 2, three, four ]
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println("old:"+old);
		
		//[one, 2, three, four, five]
		//list.set(4,"five");这样做下标越界
		
		/*
		 * E get(int index)
		 * 获取给定下标对应的元素
		 * 
		 */
		//获取第三个元素
		String str = list.get(2);
		System.out.println(str);
		
		/*for(String str1:list){
			System.out.println(str1);
		}*/
		//传统方法遍历List集合
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
	}
}
