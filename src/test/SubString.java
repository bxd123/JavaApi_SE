package test;

import java.io.UnsupportedEncodingException;

public class SubString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "Œ“∞ÆJavaddddd∫‹∫√";
		
		int num = tirmGBK(str.getBytes("GBK"),5);
		System.out.println(str.substring(0,num));
	}

	private static int tirmGBK(byte[] bytes, int n) {
		int num = 0;
		boolean bChineseFirstHalf = false;
		for(int i=0;i<n;i++){
			if(bytes[i]<0 && !bChineseFirstHalf){
				bChineseFirstHalf = true;
			}else{
				num++;
				bChineseFirstHalf = false;
			}
		}
		return num;
	}
	
}
