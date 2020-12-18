package day09;
/**
 * 第一种创建线程的方式
 * 继承Thread并重写run方法来定义线程要执行的
 * 任务。
 * @author Administrator
 *
 */
public class ThreadDemo01 {
	public static void main(String[] args) {
	Thread t1 = new Thread1();
	Thread t2 = new Thread2();
	/*
	 * 启动线程要指定start方法，而不是直接
	 * 调用run方法，run方法是线程要执行的任务。
	 * 当线程的start方法被调用后，线程进入runnable
	 * 状态，一旦获取cpu时间，run方法会自动被调用。
	 */
	t1.start();
	t2.start();
	}
}
/**
 * 第一种创建线程的方式有两个不足：
 * 1.由于java是单继承，那么继承了Thread后就无法在继承
 * 其他类。
 * 2.由于继承Thread后重写run方法规定了线程执行的任务，
 * 这导致线程与任务有一个必然的耦合关系，不利于线程的
 * 重用。
 * @author Administrator
 *
 */
class Thread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊？");
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是修电表的！");
		}
	}
}