package day04;
/**
 * 
 * @author Administrator
 *
 */
public class PointTest {
	public static void main(String[] args) {
		Point<Integer> p1 = new Point<Integer>(1,2);
		p1.setX(2);
		double x1 = p1.getX();
		System.out.println("x1:"+x1);
		
		Point<Double> p2 = new Point<Double>(1.2,1.2);
		p2.setX(2.2);
		Double x2 = p2.getX();
		System.out.println("x2:"+x2);
		
		Point<String> p3 = new Point<String>("Õº","¡È");
		p3.setX("");
		String x3 = p3.getX();
		String y3 = p3.getY();
		System.out.println("x3:"+x3+" "+y3);
	}
}
