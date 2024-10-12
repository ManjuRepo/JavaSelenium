package Oops.Data_Abstraction;

abstract class Bike {

	abstract void Hunter(); /*
							 * When ever method is declared as abstract the class should also declared as
							 * abstract
							 */
}

class Sample extends Bike {
	public void Hunter() {
		System.out.println("Its Abstraction");
	}
}

abstract public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample(); // Cannot create constructor for abstract
		s.Hunter();
	}

}
