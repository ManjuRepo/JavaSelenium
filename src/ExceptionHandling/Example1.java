package ExceptionHandling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Position :");
			int Pos = sc.nextInt();
			System.out.println("Enter Value :");
			int Val = sc.nextInt();
			arr[Pos] = Val;
			System.out.println(arr[Pos]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
