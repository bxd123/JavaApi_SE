package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * ��Ҫע�⣬ת��ֻ��ת��ΪList����
 * ʹ�õ�������Ĺ�����Arrays�ľ�̬����asList
 * ֻ��ת��ΪList���ϵ���Ҫԭ���ǣ�Set���ܴ���ظ�
 * Ԫ�ء�������ת��ΪSet���Ͽ��ܳ��ֶ�ʧԪ�ص������
 * @author Administrator
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five","six","seven","eight"};
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		
		/*
		 * �򼯺������һ��Ԫ��
		 * 
		 * ʵ��������Ĵ�����׳��쳣��ԭ�����ڣ��ü���
		 * ��������ת�������ģ���ô�ü��Ͼͱ�ʾԭ�������飬
		 * ���ԶԼ��ϵĲ������Ƕ�����Ĳ�������ô���Ԫ��
		 * �ᵼ��ԭ�������ݣ���ô�Ͳ��ܱ�ʾԭ���������ˡ�
		 * ���Բ�������ü��������Ԫ�ء�
		 */
		//list.add("five");
		//System.out.println(list);
		list.set(1, "2");
		System.out.println(list);
		for(String str:array){
			System.out.println(str);
			/*
			 * ��ϣ����ɾԪ�أ���Ҫ����һ������
			 */
			//List<String> list1 = new ArrayList<String>();
			//list1.addAll(list);
			/*
			 * ���еļ��϶��ṩ��һ������Collection
			 * ���Ͳ����Ĺ��췽����
			 * �ù��췽����Ϊ�����ƹ�����
			 * �������ڴ�����ǰ���ϵ�ͬʱ�������а���
			 * ���������е�����Ԫ�ء�
			 */
			List<String> list1 = new ArrayList<String>(list);
			list1.add("five");
			System.out.println(list1);
		}
	}
}
