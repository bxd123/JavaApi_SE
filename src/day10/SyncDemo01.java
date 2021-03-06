package day10;
/**
 * 多线程并发访问同一资源时，就会形成"抢"的现象、
 * 由于线程切换时机不确定，可能导致执行代码顺序的
 * 混乱，严重会导致系统瘫痪。
 * @author Administrator
 *
 */
public class SyncDemo01 {
	public static void main(String[] args) {
	final Table table = new Table();
	Thread t1 = new Thread(){
		public void run(){
			while(true){
				int bean = table.getBean();
				Thread.yield();
				System.out.println(getName()+":"+bean);
			}
		}
	};
	Thread t2 = new Thread(){
		public void run(){
			while(true){
				int bean = table.getBean();
				Thread.yield();
				System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	
	}
}
class Table{
	//桌上有20颗豆子
	private int beans = 20;
	/*
	 * 当一个方法被synchronized修饰后，该方法为
	 * 同步方法，即：多个线程不能同时进入方法内部执行。
	 * 对于成员方法而言，synchronized会在一个线程
	 * 调用该方法时将该方法所属对象加锁，其他线程在执行
	 * 该方法时由于执行方法的线程没有释放锁，所以只能在
	 * 方法外阻塞，直到持有方法锁的线程将方法执行完毕。
	 * 所以，解决多线程并发执行安全问题的方法就是将"抢"
	 * 变为"排队".
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了！");
		}
		Thread.yield();
		return beans--;
	}
}