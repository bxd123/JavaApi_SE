package day01;

import java.util.Arrays;

public class StringUtils {
	    public static void main(String[] args) {
	        System.out.println(leftPad("1234", 10, '#'));
	        System.out.println(rightPad("1234", 10, '#'));
	        System.out.println(repeat("123", 4));
	        System.out.println(john(new Integer[] { 1, 2, 3, 4 }, "-"));
	
	    }
	    public static String leftPad(String str, int size, char padChar) {
        char[] cs = new char[size];
	        Arrays.fill(cs, padChar);
        char[] ch = str.toCharArray();
        System.arraycopy(ch, 0, cs, cs.length - ch.length, ch.length);
        return new String(cs);
    }
    public static String rightPad(String str, int size, char padChar) {
        char[] cs = new char[size];
	        Arrays.fill(cs, padChar);
        char[] ch = str.toCharArray();
       System.arraycopy(ch, 0, cs, 0, ch.length);
	        return new String(cs);
    }
    public static String repeat(String str, int repeat) {
	        if (str == null || str.equals(""))
            return "";
        StringBuilder buf = new StringBuilder(str.length() * repeat);
        for (int i = 0; i < repeat; i++) {
            buf.append(str);        }
        return buf.toString();
	    }
	    public static String john(Object[] ary, String str) {
	        if (ary == null || ary.length == 0)
	            return "";	        
	        	StringBuilder buf = new StringBuilder(ary[0].toString());
	        	for (int i = 1; i < ary.length; i++) {
	            buf.append(str).append(ary[i]);
        }
	        	return buf.toString();	 
	        	}
	}
