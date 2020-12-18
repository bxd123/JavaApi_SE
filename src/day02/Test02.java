package day02;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		String imgName = "2.jpg";
		String names[] = imgName.split("\\.");
		imgName = System.currentTimeMillis()+"."+names[1];
		System.out.println(imgName);
		String arr = "100 = 30+20-10+80-20";
		String[] strArr = arr.split("[\\+\\-]");
		System.out.println(Arrays.toString(strArr));
	}
}
