package Pattren;

public class Example4 {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
