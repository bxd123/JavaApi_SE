package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * static void sleep(long ms)
 * �߳��ṩ�ľ�̬����sleep����ʹ���и÷���
 * ���߳̽�������״ָ̬�����롣��ʱ���̻߳�
 * �Զ��ص�RUNNABLE״̬��
 * @author Administrator
 *
 */
public class ThreadDemo07 {
	public static void main(String[] args) {
		/*
		 * ��ɵ��ӱ���
		 * ÿ�����һ�ε�ǰϵͳʱ��
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
