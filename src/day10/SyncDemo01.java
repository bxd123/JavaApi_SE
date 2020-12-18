package day10;
/**
 * ���̲߳�������ͬһ��Դʱ���ͻ��γ�"��"������
 * �����߳��л�ʱ����ȷ�������ܵ���ִ�д���˳���
 * ���ң����ػᵼ��ϵͳ̱����
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
	//������20�Ŷ���
	private int beans = 20;
	/*
	 * ��һ��������synchronized���κ󣬸÷���Ϊ
	 * ͬ����������������̲߳���ͬʱ���뷽���ڲ�ִ�С�
	 * ���ڳ�Ա�������ԣ�synchronized����һ���߳�
	 * ���ø÷���ʱ���÷���������������������߳���ִ��
	 * �÷���ʱ����ִ�з������߳�û���ͷ���������ֻ����
	 * ������������ֱ�����з��������߳̽�����ִ����ϡ�
	 * ���ԣ�������̲߳���ִ�а�ȫ����ķ������ǽ�"��"
	 * ��Ϊ"�Ŷ�".
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("û�ж����ˣ�");
		}
		Thread.yield();
		return beans--;
	}
}