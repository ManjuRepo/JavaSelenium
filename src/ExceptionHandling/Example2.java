package ExceptionHandling;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value (digits) :");
		int day = sc.nextInt();
		try {
			switch (day) {
			case 2: {
				System.out.println("Day" + " " + day +" is Monday");
				break;
			}
			case 3: {
				System.out.println("Day" + " " + day +" is Tuesday");
				break;
			}
			case 4: {
				System.out.println("Day" + " " + day +" is Wednesday");
				break;
			}
			case 5: {
				System.out.println("Day" + " " + day +" is Thursday");
				break;
			}
			case 6: {
				System.out.println("Day" + " " + day +" is Friday");
				break;
			}
			case 7: {
				System.out.println("Day" + " " + day +" is Saturday");
				break;
			}
			case 1: {
				System.out.println("Day" + " " + day +" is Sunday");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value : " + day + " " + "Search days between 1 to 7");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
