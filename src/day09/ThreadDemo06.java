package day09;
/**
 * 线程优先级
 * 线程的时间片分配完全听线程调度的。线程只能被动
 * 的被分配时间 ，对于线程调度的工作不能干预。
 * 
 * 但是可以通过提高线程的优先级来达到尽可能干预到的目的
 * 理论上，优先级越高的线程，获取CPU时间片的次数就越多。
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
