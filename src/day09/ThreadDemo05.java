package day09;
/**
 * ��ȡ�߳������Ϣ�ķ���
 * @author Administrator
 *
 */
public class ThreadDemo05 {
	public static void main(String[] args) {
		//��ȡ����main�������߳�
		Thread main = Thread.currentThread();
		long id = main.getId();
		System.out.println("id:"+id);
		
		String name = main.getName();
		System.out.println("name:"+name);
		
		int priority = main.getPriority();
		System.out.println("���ȼ���"+priority);
		
		boolean isAlive = main.isAlive();
		System.out.println("�Ƿ��"+isAlive);
		
		boolean isInterrupted = main.isInterrupted();
		System.out.println("�Ƿ��жϣ�"+isInterrupted);
		
		boolean isDaemon = main.isDaemon();
		System.out.println("�Ƿ�Ϊ�ػ��̣߳�"+isDaemon);
		
		
	}
}
