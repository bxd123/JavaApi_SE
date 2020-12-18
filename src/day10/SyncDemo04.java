package day10;
/**
 * ������
 * synchronizedҲ�л�����������
 * ʹ��synchronized���ζ�δ��룬ֻҪ���ǵ�ͬ��
 * ������������ͬ����ô�⼸�δ������ǻ����ϵ������
 * ����̲߳���ͬʱִ����Щ���롣 
 * @author Administrator
 *
 */
public class SyncDemo04 {
	public static void main(String[] args) {
		final Boo b = new Boo();
		Thread t1 = new Thread(){
			public void run(){
				b.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				b.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class Boo{
	public synchronized void methodA(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+"����ִ��A����...");
			Thread.sleep(5000);
			System.out.println(t.getName()+"ִ��A������ϣ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public  void methodB(){
		synchronized(this){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+"����ִ��B����...");
			Thread.sleep(5000);
			System.out.println(t.getName()+"ִ��B������ϣ�");
		} catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
}