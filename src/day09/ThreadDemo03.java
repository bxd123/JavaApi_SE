package day09;
/**
 * ʹ�������ڲ�������ɷ�ʽһ�뷽ʽ�����̴߳���
 * @author Administrator
 *
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		//��ʽһ
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭����");
				}
			}
		};
		t1.start();
		
		//��ʽ��
		new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("������ˮ��ģ�");
				}
			}
		}).start();
	}
}
