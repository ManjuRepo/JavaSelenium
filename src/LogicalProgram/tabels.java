package LogicalProgram;

import java.util.Scanner;

public class tabels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which you want to print the Tabels : ");
		int val = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(val + " x " + i + " = " + (val * i));
		}
	}

}
