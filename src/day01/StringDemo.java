package day01;
public class StringDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		//查找in在str字符串中的位置，若没有返回-1.
		int index = str.indexOf("in");
		System.out.println("index:"+index);
		/*
		 * 
		 */
		index = str.indexOf("in", 3);
		System.out.println("index:"+index);
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
		index = str.indexOf(0, 6);
		System.out.println("index:"+index);
	}

}
