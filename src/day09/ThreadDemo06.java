package day09;
/**
 * �߳����ȼ�
 * �̵߳�ʱ��Ƭ������ȫ���̵߳��ȵġ��߳�ֻ�ܱ���
 * �ı�����ʱ�� �������̵߳��ȵĹ������ܸ�Ԥ��
 * 
 * ���ǿ���ͨ������̵߳����ȼ����ﵽ�����ܸ�Ԥ����Ŀ��
 * �����ϣ����ȼ�Խ�ߵ��̣߳���ȡCPUʱ��Ƭ�Ĵ�����Խ�ࡣ
 * @author Administrator
 *
 */
public class ThreadDemo06 {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		Thread nor = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("min");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		//nor.setPriority(Thread.NORM_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		max.start();
		nor.start();
		min.start();
		
	}
}
