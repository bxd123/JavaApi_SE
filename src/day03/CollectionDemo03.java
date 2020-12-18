package day03;
import day02.Point;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合存放元素存放的是元素的引用(地址)
 * 
 * @author Administrator
 *
 */
public class CollectionDemo03 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Point p = new Point(1,2);
		c.add(p);
		System.out.println("p:"+p);
		System.out.println(c);
		p.setX(2);
		System.out.println("p:"+p);
		System.out.println(c);
		
	}
}
