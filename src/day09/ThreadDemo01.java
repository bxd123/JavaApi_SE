package day09;
/**
 * ��һ�ִ����̵߳ķ�ʽ
 * �̳�Thread����дrun�����������߳�Ҫִ�е�
 * ����
 * @author Administrator
 *
 */
public class ThreadDemo01 {
	public static void main(String[] args) {
	Thread t1 = new Thread1();
	Thread t2 = new Thread2();
	/*
	 * �����߳�Ҫָ��start������������ֱ��
	 * ����run������run�������߳�Ҫִ�е�����
	 * ���̵߳�start���������ú��߳̽���runnable
	 * ״̬��һ����ȡcpuʱ�䣬run�������Զ������á�
	 */
	t1.start();
	t2.start();
	}
}
/**
 * ��һ�ִ����̵߳ķ�ʽ���������㣺
 * 1.����java�ǵ��̳У���ô�̳���Thread����޷��ڼ̳�
 * �����ࡣ
 * 2.���ڼ̳�Thread����дrun�����涨���߳�ִ�е�����
 * �⵼���߳���������һ����Ȼ����Ϲ�ϵ���������̵߳�
 * ���á�
 * @author Administrator
 *
 */
class Thread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭����");
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("�����޵��ģ�");
		}
	}
}