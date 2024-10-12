package Oops.Inheritance;

public class Main_Class implements Interface1, Interface2 {

	public void A() {
		System.out.println(a);
	}

	public void B() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_Class MC = new Main_Class();
		MC.A();
		MC.B();
	}

}
