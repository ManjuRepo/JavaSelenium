package Oops;

// Used to covert from one type to another
public class wrapper_class {
	static String A = "10";
	static String B = "20";
	static int C = 30;
	static int D = 32;

	public static void main(String[] args) {

		System.out.println(Integer.parseInt(A) + Integer.parseInt(B));
		System.out.println(Double.parseDouble(A) * Double.parseDouble(B));
		System.out.println(String.valueOf(C) + String.valueOf(D));

	}

}
