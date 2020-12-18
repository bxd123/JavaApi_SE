package day09;
/**
 * 使用匿名内部类来完成方式一与方式二的线程创建
 * @author Administrator
 *
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		//方式一
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊？");
				}
			}
		};
		t1.start();
		
		//方式二
		new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是修水表的！");
				}
			}
		}).start();
	}
}
