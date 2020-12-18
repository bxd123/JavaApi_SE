package day08;
/**
 * 用来测试throw与throws
 * @author Administrator
 *
 */
public class Person {
	
	private int age;
	//private String name;
	public int getAge() {
		return age;
	}
	/**
	 * 当一个方法中使用throw抛出一个异常时
	 * 就要在方法上使用throws声明该类异常的
	 * 抛出以通知调用者解决。
	 * 只有RuntimeException及其子类异常使用
	 * throw抛出时不强制要求必须使用throws声明
	 * 其他异常都是强制要求的，否则编译不通过。
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age)throws IllegalAgeException {
		if(age<0||age>100){
			throw new IllegalAgeException("年龄不合法！");
		}
		this.age = age;
	}
	
	
}
