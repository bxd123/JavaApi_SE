package day08;
/**
 * ��������throw��throws
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
	 * ��һ��������ʹ��throw�׳�һ���쳣ʱ
	 * ��Ҫ�ڷ�����ʹ��throws���������쳣��
	 * �׳���֪ͨ�����߽����
	 * ֻ��RuntimeException���������쳣ʹ��
	 * throw�׳�ʱ��ǿ��Ҫ�����ʹ��throws����
	 * �����쳣����ǿ��Ҫ��ģ�������벻ͨ����
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age)throws IllegalAgeException {
		if(age<0||age>100){
			throw new IllegalAgeException("���䲻�Ϸ���");
		}
		this.age = age;
	}
	
	
}
