package day08;
/**
 * 年龄不合法异常
 * 
 * 自定义异常，通常是用来某个业务逻辑上
 * 出现的问题。
 * 自定义异常的名字应当做到见名知义
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
