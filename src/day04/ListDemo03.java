package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 取子集
 * List subList(int start,int end)
 * 获取当前集合中指定范围内的子集。同样含头不含尾
 * @author Administrator
 *
 */
public class ListDemo03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		//获取3-7
		List<Integer> sublist = list.subList(3, 8);
		System.out.println(sublist);
		
		//将子集中每个元素扩大10倍
		for(int i=0;i<sublist.size();i++){
			int n = sublist.get(i);
			n *= 10;
			sublist.set(i, n);
		}
		System.out.println(sublist);
		/*
		 * 对子集的修改，就是修改原集合相应内容
		 */
		System.out.println(list);
		/*
		 * 删除集合中2-8的元素
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}
