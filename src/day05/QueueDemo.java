package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ����
 * ����Ҳ���Դ��һ��Ԫ�أ����Ǵ�ȡԪ��
 * ��ѭ���Ƚ��ȳ�ԭ��
 * LinkedListҲʵ���˶��нӿڣ���Ϊ������
 * ����һ��Ԫ�أ�������β��ɾ�졣���÷��϶���
 * ���ص㡣
 * @author Administrator
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
	Queue<String> queue = new LinkedList<String>();
	/*
	 * boolean offer(E e)
	 * ��Ӳ��������β׷��һ����Ԫ��
	 */
	queue.offer("one");
	queue.offer("two");
	queue.offer("three");
	queue.offer("four");
	System.out.println(queue);
	/*
	 * E poll()
	 * ���Ӳ������Ӷ��׻�ȡԪ�أ���ȡ���Ԫ��
	 * �ʹӶ����б�ɾ���ˡ�
	 */
	String str = queue.poll();
	System.out.println(str);
	System.out.println(queue);
	/*
	 * E peek()
	 * ���ö���Ԫ�أ����ǲ������Ӳ���
	 */
	str = queue.peek();
	System.out.println(str);
	System.out.println(queue);
	//��ʼ����
	System.out.println("������ʼ��");
	System.out.println("size:"+queue.size());
//	for(int i=queue.size();i>0;i--){
//		str = queue.poll();
//		System.out.println("Ԫ�أ�"+str);
//}
	while(queue.size()>0){
		str = queue.poll();
		System.out.println("Ԫ�أ�"+str);
	}
	System.out.println("����������");
	System.out.println(queue);
	}
}
