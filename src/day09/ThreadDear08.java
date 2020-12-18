package day09;
/**
 * 守护线程，又称为后台线程
 * 当一个进程中的所有前台线程都结束时，进程就要结束、
 * 若还有后台线程运行，那么后台线程会被强制结束。
 * @author Administrator
 *
 */
public class ThreadDear08 {
	public static void main(String[] args) {
		/*
		 * rose:前台线程
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
				System.out.println("我要跳了，我死了！");
				System.out.println("aaaaaa啊啊啊啊啊！！！");
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
		//设置为后台程序，并且要在start前调用
		jeck.setDaemon(true);
		
		jeck.start();
		rose.start();
	}
}
