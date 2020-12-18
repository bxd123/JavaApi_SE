package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室服务端
 * @author Administrator
 *
 */
public class Server {
	/*
	 * 运行在服务器端的ServerSocket主要负责：
	 * 1.向系统申请服务端口
	 * 	 客户端就是通过这个端口与之连接的
	 * 2.监听申请的服务端口，当一个客户端通过
	 *   该端口尝试建立连接时，ServerSocket
	 *   会在服务器端创建一个Socket与客户端建立
	 *   连接。
	 */
	private ServerSocket server;
	/*
	 * 保存所有客户端输出流的集合
	 */
	private List<PrintWriter> allOut;
	
	/*
	 * 用来初始化服务端
	 */
	public Server()throws Exception{
		/*
		 * 初始化的同时申请服务器端口
		 */
		server = new ServerSocket(8088);
		
		allOut = new ArrayList<PrintWriter>();
	}
	/**
	 * 将给定的输出流存入共享集合
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out){
		allOut.add(out);
	}
	/**
	 * 将给定的输出流从共享集合中删除
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out){
		allOut.remove(out);
	}
	/**
	 * 将给定的消息发送给所有客户端
	 * @param message
	 */
	private synchronized void sendMessage(String message){
		for (PrintWriter out : allOut) {
			out.println(message);
		}
	}
	/*
	 * 服务端开始工作的方法
	 */
	public void start(){
		try {
			/*
			 * ServerSocket的accept方法是一个
			 * 阻塞方法，作用是监听服务端口，直到一个
			 * 客户端连接并创建一个Socket，使用该
			 * Socket即可与刚连接的客户端进行交互。
			 */
			while(true){
			System.out.println("等待客户端连接...");
			Socket socket = server.accept();
			System.out.println("一个客户端连接了！");
			/*
			 * 启动一个线程，来完成与客户端的交互
			 */
			ClientHandler handler = new ClientHandler(socket);
			final Thread t = new Thread(handler);
			t.start();	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" 服务器启动失败！");
		}
	}
	/**
	 * 该线程负责处理一个客户端的交互
	 * @author Administrator
	 *
	 */
	class ClientHandler implements Runnable{
		/*
		 * 该线程处理客户端的Socket
		 */
		private Socket socket;
		//客户端的地址信息
		private String host;
		
		//该用户的昵称
		private String nickName;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			/*
			 * 通过Socket可以获取远端计算机的地址信息。
			 */
			InetAddress address = socket.getInetAddress();
			//获取IP地址
			host = address.getHostAddress();
		}
		public void run(){
			PrintWriter pw = null;
			try {
				
				//System.out.println(host+"上线了！");
				/*
				 * Socket提供的方法：
				 * InputStream getInputStream()
				 * 该方法可以获取一个输入流，从输入流读取的
				 * 数据就是从远端计算机发送过来的。
				 */
				InputStream in = socket.getInputStream();
				
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				
				BufferedReader br = new BufferedReader(isr);
				//首先读取一行字符串为昵称
				nickName = br.readLine();
				sendMessage(nickName+"上线了！");
				/*
				 * 通过Socket创建输出流用于将消息发送、
				 * 给客户端
				 */
				OutputStream out = socket.getOutputStream();
				
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				
				pw = new PrintWriter(osw,true);
				
				/*
				 * 将该客户端的输出流存入到共享集合中
				 */
				addOut(pw);
				String message = null;
				/*
				 * br.readLine在读取客户端发送过来的字符串
				 * 如果不为空的话输出该字符串到服务器端
				 * 为空，则不输出
				 */
				while((message = br.readLine())!=null){
					//System.out.println(host+"说："+message);
					//pw.println(host+"说："+message);
					//广播消息
					sendMessage(nickName+"说:"+message);
				}	
				} catch (IOException e) {
				//e.printStackTrace();
				}finally{
					/*
					 * 处理当前客户端断开的逻辑
					 */
					//将该客户端的输出流从共享集合中删除
					removeOut(pw);
					//System.out.println(host+"下线了！");
					sendMessage(nickName+"下线了！");
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}