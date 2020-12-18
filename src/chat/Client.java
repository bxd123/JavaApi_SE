package chat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
//
/**
 * ����ͻ���
 * @author Administrator
 *
 */
public class Client {
	/*
	 * �׽���(�绰)
	 * java.net.Socket
	 * ��װ��TCPЭ�飬ʹ�����Ϳ��Ի���TCPЭ�����
	 * ����ͨѶ
	 * Socket�������ڿͻ��˵ġ�
	 */
	
	private Socket socket;
	/*
	 * ���췽��������ʼ���ͻ���
	 * ʵ����Socket��ʱ����Ҫ��������������
	 * 1.����˵�ַ��ͨ��IP��ַ�����ҵ�����˵ļ����
	 * 2.����˶˿ڣ�ͨ���˿ڿ����ҵ�����˼����
	 * �ϵķ����Ӧ�ó���
	 * ʵ����Socket�Ĺ��̾������ӵĹ��̣���Զ�˼����
	 * û����Ӧ���׳��쳣��
	 */
	BufferedReader br = new BufferedReader(
			new InputStreamReader(
					new FileInputStream("doc.txt")));
	String ip = br.readLine();
	int port = Integer.parseInt(br.readLine());
	public Client()throws Exception{
		System.out.println("�������ӷ����...");
		socket = new Socket("localhost",8088);
		
		System.out.println("�������˽������ӣ�");
	}
	/*
	 * �����ͻ��˵ķ���
	 */
	public void start(){
		try {
			String nickName = null;
			Scanner scanner = new Scanner(System.in);
			/*
			 * ��Ҫ���û�����һ���ǳ�
			 */
			while(true){
				System.out.println("�������û�����");
				nickName = scanner.nextLine();
				if(nickName.length()>0){
					break;
				}
				System.out.println("��������");
			}
			System.out.println("��ӭ��"+nickName+"����ʼ����ɣ�");
			
			/*
			 * Socket�ṩ�ķ�����
			 * OutputStream getOutputStream��ȡ
			 * һ���ֽ��������ͨ������д�������ݻᱻ
			 * ������Զ�˼������
			 */
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
			
			PrintWriter pw = new PrintWriter(osw,true);
			//�ֽ��ǳƷ��͸�������
			pw.println(nickName);
			/*
			 * ������ȡ�������˷��͹�����Ϣ���߳�
			 */
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			/*
			 * ���ַ��������������
			 */
			while(true){
				pw.println(scanner.nextLine());
				}
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
		} catch (Exception e ) {
			e.printStackTrace();
			System.out.println("�ͻ�������ʧ�ܣ�");
		}
	}
	/*
	 * ���߳�������ȡ����˷��͹�������Ϣ
	 * ��������ͻ��˿���̨��ʾ��
	 */
	class ServerHandler implements Runnable{
		public void run(){
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTf-8");
				BufferedReader br = new BufferedReader(isr);
		
				String message = null;
				while((message = br.readLine())!=null){
					System.out.println(message);
				}
			} catch (Exception e) {
			}
		}
	}
}

