package day04;

import java.util.LinkedList;
import java.util.List;

/**
 * java.util.List
 * ���ظ�������������
 * �ص��ǿ��Ը����±����Ԫ�ء�
 * ����ʵ���ࣺ
 * ArrayList:ʹ������ʵ�֣���ѯ����
 * LinkedList:ʹ������ʵ�֣���ɾ����(��β��ɾЧ������)
 * @author Administrator
 *
 */
public class ListDemo01 {
	public static void main(String[] args) {
		/*
		 * E set(int index,E e)
		 * ������Ԫ�����õ�ָ��λ���ϣ�����ֵΪ
		 * ԭλ�õ�Ԫ�ء��������滻Ԫ�ز���
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
		//list.set(4,"five");�������±�Խ��
		
		/*
		 * E get(int index)
		 * ��ȡ�����±��Ӧ��Ԫ��
		 * 
		 */
		//��ȡ������Ԫ��
		String str = list.get(2);
		System.out.println(str);
		
		/*for(String str1:list){
			System.out.println(str1);
		}*/
		//��ͳ��������List����
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
	}
}
