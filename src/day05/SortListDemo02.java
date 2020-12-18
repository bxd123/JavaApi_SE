package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		list.add("魏七");
		System.out.println(list);
		MyComparator com = new MyComparator();
		/*
		 * 重载的sort方法要求传入一个额外的比较器
		 * 该方法不再要求集合元素必须实现Complarable
		 * 接口，并且也不再使用集合元素自身的比较规则
		 * 排序了，而是根据给定的这个额外的比较器的比较
		 * 规则对集合元素进行排序。
		 * 实际开发中也推荐使用这种方式排序集合元素，若
		 * 集合元素是自定义的。
		 * 创建比较器时也推荐使用匿名内部类的形式。
		 */
		Collections.sort(list,com);
		System.out.println(list);
		//匿名内部类形式创建
		
		Comparator<String> com1 = new Comparator<String>(){
			public int compare(String o1,String o2){
				return o2.length()-o1.length();
			}
			
		};
		Collections.sort(list,com1);
		System.out.println(list);
		
	}
}
class MyComparator implements Comparator<String>{
	
	/**
	 * 该方法用来定义o1和o2的比较
	 * 若返回值>0:o1>02
	 * 若返回值<0:o1<02
	 * 若返回值=0:o1=o2
	 * 
	 */
	public int compare(String o1, String o2) {
		/*
		 *字符串中字符多的大 	
		 */
		return o1.length()-o2.length();
	}
	
}