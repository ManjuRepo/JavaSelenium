package Oops;

class Day3 {

	void Demo(int x, int y) {

		System.out.println("Addition"+" "+ (x + y));

	}
}

class Day2 extends Day3 {

	void Demo(int x, int y) {

		System.out.println("Addition"+" "+ (x+ y));
		
		super.Demo(45, 54);

	}
}

public class Method_OverRide {
	public static void main(String[] args) {
		Day2 day = new Day2();
		day.Demo(9, 10);
		
	}
}
