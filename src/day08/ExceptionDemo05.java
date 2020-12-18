package day08;

import java.awt.AWTException;
import java.io.IOException;

/**
 * 重写父类一个含有throws异常抛出声明的
 * 方法时，子类该方法的throws的重写原则
 * @author Administrator
 *
 */
public class ExceptionDemo05 {
	public void dosome()throws IOException,AWTException{
		
	}
			
}
class Son extends ExceptionDemo05{
	public void dosome()throws IOException,AWTException{
		
	}
}