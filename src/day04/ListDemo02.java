package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List�����ṩ��һ�����ص�add��remove����
 * void add(int index,E e)
 * ������Ԫ�ز��뵽ָ��λ�á�
 * 
 * E remove(int index)
 * �Ӽ�����ɾ��ָ��λ�õ�Ԫ�أ������䷵�ء�
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
