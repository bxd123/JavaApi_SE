package day09;
/**
 * �ػ��̣߳��ֳ�Ϊ��̨�߳�
 * ��һ�������е�����ǰ̨�̶߳�����ʱ�����̾�Ҫ������
 * �����к�̨�߳����У���ô��̨�̻߳ᱻǿ�ƽ�����
 * @author Administrator
 *
 */
public class ThreadDear08 {
	public static void main(String[] args) {
		/*
		 * rose:ǰ̨�߳�
		 */
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("��Ҫ���ˣ������ˣ�");
				System.out.println("aaaaaa����������������");
			}
		};
		
		Thread jeck = new Thread(){
			public void run(){
				while(true){
					System.out.println("ject:you jump!I jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		//����Ϊ��̨���򣬲���Ҫ��startǰ����
		jeck.setDaemon(true);
		
		jeck.start();
		rose.start();
	}
}
