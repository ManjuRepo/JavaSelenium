package Oops.Abstraction;

interface Demo {
	int a = 10; // In Interface Variables are by default Static & final
	int b = 20; // In Interface Variables are by default Static & final

	default void A() {
		System.out.println((a + b) + ":" + "Add");
	}

	static void B(int a, int b) {
		System.out.println((a / b) + ":" + "Division");
	}

	void c(int a, int b); // Abstract Methods cannot Implement in Interface it Should be implement in
	// class
}

public class InterFace implements Demo {

	public void c(int a, int b) { /*
									 * In InterFace by default access specifier will be default but its lower then
									 * Public so access specifier should be public The Implementation of Abstract
									 * method c take place here
									 */
		System.out.println((b - a) + ":" + "Subtraction");
	}

	public static void main(String[] args) {

		// Scenario 1

		InterFace Obj = new InterFace();/*
										 * we cannot create Object for InterFace but from implemented class we can
										 * create create Object(Object of the class is storing into the class variable)
										 */
		Obj.A();
		Obj.c(200, 300);

		Demo.B(500, 600); /*
							 * access specifier is Static & its within the class so we can directly call
							 * from Interface Name no need to creating Object
							 */

		// Scenario 1 : How to create Object for InterFace

		Demo D = new InterFace(); /*
									 * we can create a refrains variable for InterFace but to create an Object we
									 * should call class (Object of the Interface is storing into the class
									 * variable)
									 */
		D.A();
		D.c(200, 300); // here we can reinitialize the values because it comes under class

		Demo.B(800, 900); /*
							 * Static Method can directly access from InterFace (we cannon reinitialize the
							 * value because by default its Static & Final)
							 */

	}

}
