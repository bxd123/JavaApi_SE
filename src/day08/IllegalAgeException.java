package day08;
/**
 * ���䲻�Ϸ��쳣
 * 
 * �Զ����쳣��ͨ��������ĳ��ҵ���߼���
 * ���ֵ����⡣
 * �Զ����쳣������Ӧ����������֪��
 * @author Administrator
 *
 */
public class IllegalAgeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
}
