package day10;
/**
 * ͬ����
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ͬʱ
 * ��������߲���Ч�ʡ�
 * @author Administrator
 *
 */
public class SyncDemo02 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}
class Shop{
	public void buy(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+"���������·�...");
			t.sleep(5000);
			/*
			 * ͬ�������Ҫ�����̶߳Ըÿ��ڵĴ����Ŷ�ִ��
			 * ����ǰ��������ͬ�����������󣬼�(�����Ķ���)
			 * Ҫ�����߳̿����ı�����ͬһ����
			 * synchronized(ͬ������������){��Ҫͬ���Ĵ���}
			 * ��νͬ��ִ�м�������̱߳����Ŷ�ִ��
			 * ��ν�첽ִ�м�������߳̿���ͬʱִ��
			 */
			synchronized (this){
			System.out.println(t.getName()+"���������·�...");
			t.sleep(5000);
			}
			System.out.println(t.getName()+"�����ˣ�����");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}