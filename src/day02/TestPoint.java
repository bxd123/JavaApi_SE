package day02;
/**
 * ����Point��дObject��ط���
 * @author Administrator
 *
 */
public class TestPoint {
	public static void main(String[] args) 	{
	Point p = new Point(1,2);
//	String str = p.toString();
	/*
	 * System.out.println(Object obj)
	 * ������Ǹ�������toString���ص��ַ���
	 */
	System.out.println(p.toString());
	
	Point p1 = new Point(1,2);
	boolean flag = p.equals(p1);
	System.out.println(flag);
	System.out.println(p1==p);
	}

}
