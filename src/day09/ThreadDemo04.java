package day09;
/**
 * static Thread currentThread()
 * ��ȡ���е�ǰ�������߳�
 * @author Administrator
 *
 */
public class ThreadDemo04 {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("����main�������߳��ǣ�"+main);
		dosome();
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("�Զ����̣߳�"+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("����dosome�������߳��ǣ�"+t);
	}
}