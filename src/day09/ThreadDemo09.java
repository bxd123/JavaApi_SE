package day09;
/**
 * void join()
 * join��������ʹ���ø÷������߳̽�������״̬��
 * ֱ���÷��������߳���ɹ����Ż������ø÷���
 * �̵߳�����״̬��
 * join����һ��������ɶ���߳�֮���ͬ���������⡣
 * @author Administrator
 *
 */
public class ThreadDemo09 {
	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish = false;
	public static void main(String[] args){
		
		final Thread download = new Thread(){
			public void run(){
				System.out.println("ͼƬ��ʼ���أ�");
				for(int i=1;i<100;i++){
					System.out.println("down"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("ͼƬ������ϣ�");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run(){
				System.out.println("��ʼ��ʾͼƬ...");
				/*
				 * �ȵȴ�download��ͼƬ������ϣ�
				 */
				try {
					download.join();
				} catch (InterruptedException e) {	
				}
				if(!isFinish){
					throw new RuntimeException("ͼƬû��������ϣ�");
				}
				System.out.println("show:ͼƬ��ʾ��ϣ�");
			}
		};
		download.start();
		show.start();
	}
}
