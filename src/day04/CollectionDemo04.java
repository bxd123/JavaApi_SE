package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ����֧�ַ��ͣ�������������Լ��������Ԫ�ص����͡�
 * @author Administrator
 *
 */
public class CollectionDemo04 {
	public static void main(String[] args) {
		Collection <String> c = new ArrayList<String>();
		//ֻ�����String���͵�Ԫ��
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		//��������Ԫ��
		for(String str:c){
			System.out.println(str);
		}
		/*
		 * ������ҲӦ��ָ�����ͣ������͵�ʵ������
		 * Ӧ�����������ļ��ϵķ�������һ�¡�
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			//��ȡԪ��ʱ����������
			String str = it.next();
			System.out.println(str);
		}
	}
}
