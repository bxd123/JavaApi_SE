package string;

import java.util.Scanner;

/**
 * ����ʱ��
 */
public class Time {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����hh1��");
		int hh1 = scan.nextInt();
		System.out.println("����hh2:");
		int hh2 = scan.nextInt();
		System.out.println("����mm1:");
		int mm1 = scan.nextInt();
		System.out.println("����mm2:");
		int mm2 = scan.nextInt();
		double result = 0.0;
		int hh;
		int mm;
		if(hh1>hh2){
			hh = hh1-hh2;
		}else{
			hh = hh2-hh1;
		}
		if(mm1>mm2){
			mm = mm1-mm2;
		}else{
			mm = mm2-mm1;
		}
		result = hh+mm/60.0;
		System.out.println("����õ���ʱ���Ϊ"+result);
	}
}
