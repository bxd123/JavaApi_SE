package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * static void sleep(long ms)
 * 线程提供的静态方法sleep可以使运行该方法
 * 的线程进入阻塞状态指定毫秒。超时后线程会
 * 自动回到RUNNABLE状态。
 * @author Administrator
 *
 */
public class ThreadDemo07 {
	public static void main(String[] args) {
		/*
		 * 完成电子表功能
		 * 每秒输出一次当前系统时间
		 *  hh-mm-ss
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
		while(true){
			System.out.println(sdf.format(new Date()));
			//System.out.println(System.currentTimeMillis());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
