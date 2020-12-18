package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����Map
 * ����Map�����ַ�ʽ��
 * �������е�key
 * �������е�key-value��
 * �������е�value(��Բ�����)
 * @author Administrator
 *
 */
public class MapDemo02 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����",68);
		map.put("��ѧ",84);
		map.put("Ӣ��",94);
		map.put("����",54);
		map.put("��ѧ",85);
		map.put("����",48);
		System.out.println(map);
		
		/*
		 * �������е�key
		 * Set<K> keySet()
		 * �÷����Ὣ��ǰMap�����е�key����һ��
		 * Set���Ϻ󷵻ء���ô�����ü��Ͼ͵��ڱ���
		 * �����е�key
		 */
		Set<String> keySet = map.keySet();
		for(String key:keySet){
			System.out.println("key:"+key);
		}
		
		/*
		 * ����ÿһ���ֵ��
		 * Map��ÿһ���ֵ�Զ�����Map���ڲ��ࣺ
		 * java.util.Map.Entry��һ��ʵ����ʾ�ġ�
		 * Entry������������getKey.getValue,����
		 * �ֱ��ȡ��һ���ֵ���е�key��value��
		 * 
		 * Set<Entry> entrySet
		 * �÷����ὫMap��ÿһ���ֵ��(Entryʵ��)
		 * ����һ��Set���Ϻ󷵻ء�
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> e:entrySet){
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+":"+value);
		}
		/*
		 * ��������value
		 * Collection values()
		 * �÷����Ὣ��ǰMap�����е�value����һ��
		 * ���Ϻ󷵻ء�
		 */
		Collection<Integer> values = map.values();
		for(Integer value:values){
			System.out.println("values:"+value);
			
		}
	}
}
