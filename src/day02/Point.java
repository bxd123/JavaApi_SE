package day02;
/**
 * 使用该类来测试Object相关方法的重写。
 * 该类的每个实例表示直角坐标系上的一个点。
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
	 * 通常我们要使用一个类的toString方法时，
	 * 就应当重写该方法。
	 * Object自身的toString方法返回是：类名@地址
	 * 这种字符串没有什么实际意义。
	 * 重写该方法后，返回的字符串没有严格的格式要求，
	 * 将来可以根据需求而定。但是原则上该字符串中应当
	 * 包含当前对象的属性信息。
	 * 只有我们自定义的类需要重写该方法，JAVA API
	 * 提供的类通常已经重写了该方法。
	 */
	public String toString(){
		return x+"，"+y;
	}
	/**
	 * 通常，当我们需要使用一个类的equals方法时，
	 * 就应当重写它。
	 * equals方法的作用是比较当前对象与给定对象内容
	 * 是否一样（长得像不像）
	 * Object提供的equals方法内部就是用"=="实现的
	 * 所以没有意义。
	 * equals比较时不一定要求所有属性值都相同，这
	 * 要结合实际需求而定。
	 * 只有自己定义的类需要重写，JAVA API提供的类
	 * 基本都重写了equals
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
	