package Oops.Abstraction;

//Similarly we can use in InterFace
abstract class Vehicals {

	abstract void Bike();

	abstract void Car();

	abstract void AirBus();

	abstract void Auto();
}

class Company extends Vehicals {
	public void Bike() {
		System.out.println("Royal Enfield");
	}

	public void Car() {
		System.out.println("TATA");
	}

	public void AirBus() {
		System.out.println("Air India");
	}

	public void Auto() {
		System.out.println("Bajaj");
	}
}

abstract public class Abstraction {

	public static void main(String[] args) {

		Company c = new Company();
		c.AirBus();
		c.Auto();
		c.Bike();
		c.Car();
	}

}
