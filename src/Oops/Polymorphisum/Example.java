package Oops.Polymorphisum;

class Parent1 {
	void sample(String x) {
		System.out.print("Value of x : " + x + " ");
	}
}

class Parent2 extends Parent1 {
	void sample(String x) {
		super.sample("Manju");
		System.out.println(x);
				
	}
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p = new Parent2();
		p.sample("KV");
	}

}
