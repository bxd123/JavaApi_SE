package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ�������Ԫ�صļ���
 * @author Administrator
 *
 */
public class SortListDemo01 {
	public static void main(String[] args) {
		List<Point>	list = new ArrayList<Point>();
		
		list.add(new Point(6,4));
		list.add(new Point(2,3));
		list.add(new Point(1,4));
		list.add(new Point(6,3));
		list.add(new Point(2,4));
		list.add(new Point(5,7));
		
		System.out.println(list);
		/*
		 * sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparable
		 * �ӿڣ��ýӿ����ڹ涨ʵ�����ǿ��ԱȽϵġ�
		 * ������һ�����󷽷�����������Ƚϴ�С�Ĺ���
		 *
		 *������ʹ��sort�������򣬵��Ǹ÷���Ҫ��
		 *���ǵļ���Ԫ�ر���ʵ��Comparable�ӿڲ���
		 *����ȽϹ�������������ʹ��ĳ�����ܣ�����
		 *Ҫ�������޸ĳ���������Ϊ"������"��
		 *�޸ĵĴ���Խ�࣬������Խǿ��Խ�����ڳ����
		 *��չ��
		 */
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
