package day02;
/**
 * ʹ�ø���������Object��ط�������д��
 * �����ÿ��ʵ����ʾֱ������ϵ�ϵ�һ���㡣
 * @author Administrator
 *
 */
public class Point {
	private int x;
	private int y;
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y = y;
		
	}
	public int getY(){
		return y;
	}
	public Point(){
		
	}
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	/**
	 * ͨ������Ҫʹ��һ�����toString����ʱ��
	 * ��Ӧ����д�÷�����
	 * Object�����toString���������ǣ�����@��ַ
	 * �����ַ���û��ʲôʵ�����塣
	 * ��д�÷����󣬷��ص��ַ���û���ϸ�ĸ�ʽҪ��
	 * �������Ը����������������ԭ���ϸ��ַ�����Ӧ��
	 * ������ǰ�����������Ϣ��
	 * ֻ�������Զ��������Ҫ��д�÷�����JAVA API
	 * �ṩ����ͨ���Ѿ���д�˸÷�����
	 */
	public String toString(){
		return x+"��"+y;
	}
	/**
	 * ͨ������������Ҫʹ��һ�����equals����ʱ��
	 * ��Ӧ����д����
	 * equals�����������ǱȽϵ�ǰ�����������������
	 * �Ƿ�һ������������
	 * Object�ṩ��equals�����ڲ�������"=="ʵ�ֵ�
	 * ����û�����塣
	 * equals�Ƚ�ʱ��һ��Ҫ����������ֵ����ͬ����
	 * Ҫ���ʵ�����������
	 * ֻ���Լ����������Ҫ��д��JAVA API�ṩ����
	 * ��������д��equals
	 */
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof Point){
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
			
		}
		return false;
	}
}
	