package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * �����ϻ�Mapת��Ϊ�̰߳�ȫ��
 * @author Administrator
 *
 */
public class SyncDemo05 {
	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();	
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list = Collections.synchronizedList(list);
	System.out.println(list);
	
	/*
	 * HashSet�����̰߳�ȫ��
	 * 
	 */
	Set<String> set = new HashSet<String>(list);
	//��������Set����ת��Ϊ�̰߳�ȫ��
	set = Collections.synchronizedSet(set);
	System.out.println(set);
	
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("��ѧ", 77);
	map.put("Ӣ��", 98);
	map.put("����", 89);
	System.out.println(map);
	map = Collections.synchronizedMap(map);
	System.out.println(map);
	
	
	/*
	 * API�ֲ�����˵��
	 * �������̰߳�ȫ�ļ�����ô���ж���Ԫ�صĲ���
	 * �磺add��remove�ȷ�����������������������⣬
	 * ��Ҫ����ά�������ϵ��
	 * 
	 */
	}
}
