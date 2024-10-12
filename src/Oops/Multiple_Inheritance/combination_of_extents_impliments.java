package Oops.Multiple_Inheritance;

public class combination_of_extents_impliments extends sample
		implements Interface1, Interface2 { /* Extends allow only one class implements allow multiple Interface */

	public void A() { // Implementation for Abstract class Interface1
		System.out.println(a);
	}

	public void B() { // Implementation for Abstract class Interface2
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combination_of_extents_impliments obj = new combination_of_extents_impliments();
		obj.A();
		obj.B();
		obj.Sam(); // inheriting sample class by Obj into main method
	}

}
