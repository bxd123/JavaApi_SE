package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *新循环遍历集合
 * @author Administrator
 *
 */
public class NewForDemo2 {
public static void main(String[] args) {
	Collection c = new ArrayList();
	c.add("one");
	c.add("#");
	c.add("two");
	c.add("#");
	c.add("three");
	System.out.println(c);
	/*
	 * 新循环并非新的语法，新循环是编译器认可，
	 * 而不是虚拟机认可。
	 * 使用新循环遍历集合时，编译器会将它改为
	 * 迭代器方式遍历。所以在使用新循环遍历集合
	 * 时，不能通过集合的方法增删元素。
	 */
	//Iterator it = c.iterator();
	//Object l = it.next();
	for(Object o :c){
		//while(it.hasNext()){
			String str = (String)o;
			System.out.println(str);
			if("#".equals(str)){	
				//it.remove();
			}
		}
	}
}