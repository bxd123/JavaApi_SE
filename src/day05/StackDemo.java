package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ
 * ����һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ�Ƚ����ԭ��
 * ͨ��Ϊ��ʵ�ֺ��˹���ʱ��ʹ��ջ
 * @author Administrator
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		/*
		 * java.util.Deque
		 * ˫�˶��У����˶����Խ����ӡ�
		 * ��ֻ���ô�һ�˽����Ӳ���ʱ�����γ���
		 * ջ�ṹ��
		 * ��ˣ�˫�˶���Ϊվ�ṩ������������
		 * push,pop
		 */
		Deque<String> stack = new LinkedList<String>();
		/*
		 * void push(E e)
		 * ��ջ�����������ջ��Ԫ����ջ��(��һ��Ԫ��λ��)
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		
		System.out.println(stack);
		/*
		 * ��ջ����
		 * E pop()
		 */
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		str = stack.peek();
		System.out.println(str);
		System.out.println(stack);
		
		while(stack.size()>0){
			str = stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
	}
}
