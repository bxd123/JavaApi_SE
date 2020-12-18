package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列
 * 队列也可以存放一组元素，但是存取元素
 * 遵循：先进先出原则。
 * LinkedList也实现了队列接口，因为它可以
 * 保存一组元素，并且首尾增删快。正好符合队列
 * 的特点。
 * @author Administrator
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
	Queue<String> queue = new LinkedList<String>();
	/*
	 * boolean offer(E e)
	 * 入队操作，向队尾追加一个新元素
	 */
	queue.offer("one");
	queue.offer("two");
	queue.offer("three");
	queue.offer("four");
	System.out.println(queue);
	/*
	 * E poll()
	 * 出队操作，从队首获取元素，获取后该元素
	 * 就从队列中被删除了。
	 */
	String str = queue.poll();
	System.out.println(str);
	System.out.println(queue);
	/*
	 * E peek()
	 * 引用队首元素，但是不做出队操作
	 */
	str = queue.peek();
	System.out.println(str);
	System.out.println(queue);
	//开始遍历
	System.out.println("遍历开始！");
	System.out.println("size:"+queue.size());
//	for(int i=queue.size();i>0;i--){
//		str = queue.poll();
//		System.out.println("元素："+str);
//}
	while(queue.size()>0){
		str = queue.poll();
		System.out.println("元素："+str);
	}
	System.out.println("遍历结束！");
	System.out.println(queue);
	}
}
