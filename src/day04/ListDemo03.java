package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * ȡ�Ӽ�
 * List subList(int start,int end)
 * ��ȡ��ǰ������ָ����Χ�ڵ��Ӽ���ͬ����ͷ����β
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
		//��ȡ3-7
		List<Integer> sublist = list.subList(3, 8);
		System.out.println(sublist);
		
		//���Ӽ���ÿ��Ԫ������10��
		for(int i=0;i<sublist.size();i++){
			int n = sublist.get(i);
			n *= 10;
			sublist.set(i, n);
		}
		System.out.println(sublist);
		/*
		 * ���Ӽ����޸ģ������޸�ԭ������Ӧ����
		 */
		System.out.println(list);
		/*
		 * ɾ��������2-8��Ԫ��
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}
