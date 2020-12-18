package day09;
/**
 * void join()
 * join方法可以使调用该方法的线程进入阻塞状态，
 * 直到该方法所属线程完成工作才会解除调用该方法
 * 线程的阻塞状态。
 * join方法一般用来完成多个线程之间的同步工作问题。
 * @author Administrator
 *
 */
public class ThreadDemo09 {
	//表示图片是否下载完毕
	public static boolean isFinish = false;
	public static void main(String[] args){
		
		final Thread download = new Thread(){
			public void run(){
				System.out.println("图片开始下载！");
				for(int i=1;i<100;i++){
					System.out.println("down"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("图片下载完毕！");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run(){
				System.out.println("开始显示图片...");
				/*
				 * 先等待download把图片下载完毕！
				 */
				try {
					download.join();
				} catch (InterruptedException e) {	
				}
				if(!isFinish){
					throw new RuntimeException("图片没有下载完毕！");
				}
				System.out.println("show:图片显示完毕！");
			}
		};
		download.start();
		show.start();
	}
}
