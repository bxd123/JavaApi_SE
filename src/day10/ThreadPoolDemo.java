package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ���������ã�
 * 1.�����߳�
 * 2.�����߳�����
 * �����ǵ�Ӧ����Ҫ���������̻߳��߷����̻߳�
 * Ƶ���Ĵ���������ʱ����Ӧ������ʹ���̳߳���
 * ά���̡߳�
 * @author Administrator
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					try {
						System.out.println(t+"������������...");
						Thread.sleep(5000);
						System.out.println(t+"�������������");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			threadPool.execute(runn);
			System.out.println("ָ����һ�����񽻸��̳߳�");
		}
		//threadPool.shutdownNow();
		threadPool.shutdown();
		System.out.println("ֹͣ�̳߳أ�");
	}
}
