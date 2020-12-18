package day07;

import java.io.Serializable;
import java.util.List;

/**
 * �������ڲ�����Ϊ��������д����ʹ��
 * 
 * ��һ������Ҫ����������д����ô�������
 * ʵ��java.io.Serializable�ӿڡ�
 * @author Administrator
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ����Serializable�ӿں�
	 * Ӧ�����һ��������serialVersionUID
	 * �ó���Ϊ��ǰ������л��汾�ţ���������
	 * ϵͳ����ݵ�ǰ��Ľṹ���ɣ�����ֻҪ��
	 * �Ľṹ�����ı䣬�汾��Ҳ����Ӧ�����ı䡣
	 * 
	 * �汾��Ӱ���ŷ����л��Ľ��.����
	 * ��OIS��һ��������з����л�ʱ������
	 * �ö�������İ汾�Ƿ�һ�£�
	 * ��һ�£������л��ɹ����������ö�������
	 * �Ļ�����һ��ʱ������ü���ģʽ���ܻ�ԭ��
	 * ���Զ���ԭ��
	 * ����һ�£������л�ֱ���׳���һ���쳣
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * transient�ؼ���������������
	 * �������κ󣬸���ʵ����ʹ��OOS���ж���
	 * ���л�ʱ��������ֵ�����ԣ��Ӷ��ﵽ����
	 * "����"��Ŀ�ġ�
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
