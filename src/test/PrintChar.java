package test;

public class PrintChar {
	public static void main(String[] args) {
		printChar(10);
	}

	public static void printChar(int n) {
		for (int i = n; i > 0; i--) {
			int j = 0, k = 0;
			for (; j < i; j++) {
				System.out.print(" ");
			}
			for (; k < (n-i)+1; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}