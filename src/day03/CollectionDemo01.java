package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * ���ϣ����ڴ洢һ��Ԫ�أ��ṩ��ά�����ϵ���ز�����
 * ���������������ӿڣ�
 * List�����ظ���
 * Set�������ظ���
 * Ԫ���Ƿ��ظ�����������equals�����ȽϵĽ��
 * ������
 * @author Administrator
 *
 */
public class CollectionDemo01 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * �򼯺������Ԫ�ء�
		 * ��Ԫ�سɹ���ӵ����Ϻ󷵻�true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println(c);
		/*
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		System.out.println("size:"+c.size());
		
		/*
		 * boolean isEmpty()
		 * �жϵ�ǰ�����Ƿ񲻺��κ�Ԫ��
		 * �ռ���
		 * 
		 */
		  boolean isEmpty=c.isEmpty();
		  System.out.println("�Ƿ��ǿռ���"+isEmpty);
		  
		  /*
		   * void clear()
		   * ��ռ���Ԫ��
		   */
		  System.out.println("��ռ���");
		  c.clear();
		  
		  System.out.println("size:"+c.size());
		  System.out.println("�Ƿ��ǿռ���"+c.isEmpty());
	}
}
