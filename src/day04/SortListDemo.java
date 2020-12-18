package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 排序集合元素
 * 排序集合使用的是集合的工具类Collections
 * 的静态方法sort。
 * 排序仅能对List集合进行。因为Set部分实现类是无序的。
 * 
 */
public class SortListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		/*
		 * 对集合进行自然排序，从小到大
		 */
		Collections.sort(list);
		
		System.out.println(list);
	}
}
