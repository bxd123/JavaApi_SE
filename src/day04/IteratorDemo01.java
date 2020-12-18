package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������
 * Collection�ṩ��ͳһ�ı�������Ԫ�ص�
 * ��ʽ��������ģʽ
 * 
 * Iterator iterator()
 * ��ȡ���ڱ�����ǰ���ϵĵ�����
 * 
 * java.util.Iterator��һ���ӿڣ��涨�����ڱ���
 * ����Ԫ�ص���ط�������ͬ�ļ����ṩ����Ӧ��ʵ���ࡣ
 * �����ס��Щʵ��������֣�ֻ�����ǵ���Iterator���ɡ�
 * 
 * ����������ѭ���ʣ�ȡ��ɾ�Ĳ��裬����ɾ�����Ǳ��������
 * @author Administrator
 *
 */
public class IteratorDemo01 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("one");
		c1.add("#");
		c1.add("two");
		c1.add("#");
		c1.add("three");
		c1.add("#");
		c1.add("four");
		//��ȡ���ڱ�����ǰԪ�صĵ�����
		Iterator it = c1.iterator();
		/*
		 * boolean hasNext();
		 * �÷������жϼ������Ƿ���Ԫ�ؿ���ȡ��
		 * 
		 * E next() ȡ�Ĺ���
		 * ��ȡ��������һ��Ԫ�ء�
		 */
		while(it.hasNext()){
			String str = (String)it.next();
			if("#".equals(str)){
				/*
				 * ��ʹ�õ�������������ʱ����Ҫ
				 * ʹ�ü��ϵķ�����ɾԪ�أ�����
				 * �������쳣��
				 */
				//c1.remove(str);
				it.remove();
			}
			System.out.println(str);
			
		}
		System.out.println(c1);
	}
}
