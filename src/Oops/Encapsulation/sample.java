package Oops.Encapsulation;

public class sample extends Oops.Inheritance.sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
		d.setName("Lion");
		d.setGrade('M');
		d.setAge(27);

		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getGrade());
		
		d.setName("Tiger");
		System.out.println(d.getName());
	}

}
