package day05;
/**
 * ����������Ϊ���ϵ�Ԫ��
 * @author Administrator
 *
 */
public class Point implements Comparable<Point>{
	private int x;	
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString(){	
		return "("+x+","+y+")";
	}
	/*
	 * ��ʵ����Comparable�ӿں���Ҫ��д����ķ���
	 * �÷����������Ƕ��嵱ǰ�����������������Ƚϴ�С
	 * �Ĺ���
	 * ����ֵ��һ��intֵ����ֵ��ʾ��С��ϵ��������ע��
	 * ���ȡֵ�Ƕ��٣�����ע����ȡֵ��Χ��
	 * ������ֵ>0ʱ����ǰ����Ȳ��������
	 * ������ֵ<0ʱ����ǰ����Ȳ�������С��
	 * ������ֵ=0ʱ����ǰ����Ͳ�����ȡ�
	 */
	public int compareTo(Point p) {
		/*
		 * �ȽϹ��򣬵㵽ԭ��ľ��볤�Ĵ�
		 */
		int len = this.x*this.x+this.y*this.y;
		int plen = p.x*p.x+p.y*p.y;
		
		return len-plen;
	}
}
