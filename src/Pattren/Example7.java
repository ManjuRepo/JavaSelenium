package Pattren;

public class Example7 {

	public static void main(String[] args) {
		int n = 5;
		int num = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int l = 4; l >= 1; l--) {
			for (int m = 0; m <= num - l; m++) {
				System.out.print(" ");
			}
			for (int n1 = 1; n1 <= l; n1++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
