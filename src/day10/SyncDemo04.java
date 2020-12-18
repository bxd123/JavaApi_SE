package day10;
/**
 * 互斥锁
 * synchronized也叫互斥锁，即：
 * 使用synchronized修饰多段代码，只要他们的同步
 * 监视器对象相同，那么这几段代码间就是互斥关系，即：
 * 多个线程不能同时执行这些代码。 
 * @author Administrator
 *
 */
public class SyncDemo04 {
	public static void main(String[] args) {
		final Boo b = new Boo();
		Thread t1 = new Thread(){
			public void run(){
				b.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				b.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class Boo{
	public synchronized void methodA(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+"正在执行A方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+"执行A方法完毕！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public  void methodB(){
		synchronized(this){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+"正在执行B方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+"执行B方法完毕！");
		} catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
}