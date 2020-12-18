package day07;

import java.io.Serializable;
import java.util.List;

/**
 * 该类用于测试作为对象流读写对象使用
 * 
 * 当一个类需要被对象流读写，那么该类必须
 * 实现java.io.Serializable接口。
 * @author Administrator
 *
 */
public class Person implements Serializable{
	/**
	 * 当一个类实现了Serializable接口后
	 * 应当添加一个常量：serialVersionUID
	 * 该常量为当前类的序列化版本号，若不定义
	 * 系统会根据当前类的结构生成，但是只要类
	 * 的结构发生改变，版本号也会相应发生改变。
	 * 
	 * 版本号影响着反序列化的结果.即：
	 * 当OIS对一个对象进行反序列化时，会检查
	 * 该对象与类的版本是否一致：
	 * 若一致：反序列化成功，但是若该对象与类
	 * 的机构不一致时，则采用兼容模式，能还原的
	 * 属性都还原。
	 * 若不一致：反序列化直接抛出不一致异常
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * transient关键字用来修饰属性
	 * 当被修饰后，该类实例在使用OOS进行对象
	 * 序列化时，该属性值被忽略，从而达到对象
	 * "瘦身"的目的。
	 */
	private transient List<String> otherInfo;
	
	public Person(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String toString(){
		return name+","+age+","+gender+","+otherInfo;
	}
	
}
