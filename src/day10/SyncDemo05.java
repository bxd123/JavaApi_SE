package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 将集合或Map转换为线程安全的
 * @author Administrator
 *
 */
public class SyncDemo05 {
	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();	
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list = Collections.synchronizedList(list);
	System.out.println(list);
	
	/*
	 * HashSet不是线程安全的
	 * 
	 */
	Set<String> set = new HashSet<String>(list);
	//将给定的Set集合转换为线程安全的
	set = Collections.synchronizedSet(set);
	System.out.println(set);
	
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("数学", 77);
	map.put("英语", 98);
	map.put("语文", 89);
	System.out.println(map);
	map = Collections.synchronizedMap(map);
	System.out.println(map);
	
	
	/*
	 * API手册上有说明
	 * 就算是线程安全的集合那么其中对于元素的操作
	 * 如：add，remove等方法都不予迭代器遍历做互斥，
	 * 需要自行维护互斥关系。
	 * 
	 */
	}
}
