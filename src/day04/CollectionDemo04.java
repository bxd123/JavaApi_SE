package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合支持泛型，而泛型是用来约束集合中元素的类型。
 * @author Administrator
 *
 */
public class CollectionDemo04 {
	public static void main(String[] args) {
		Collection <String> c = new ArrayList<String>();
		//只能添加String类型的元素
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		//遍历集合元素
		for(String str:c){
			System.out.println(str);
		}
		/*
		 * 迭代器也应当指定泛型，而泛型的实际类型
		 * 应当与它遍历的集合的泛型类型一致。
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			//获取元素时不需再造型
			String str = it.next();
			System.out.println(str);
		}
	}
}
