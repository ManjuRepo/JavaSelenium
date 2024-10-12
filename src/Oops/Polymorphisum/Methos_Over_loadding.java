package Oops.Polymorphisum;
//create multiple method with same name and pass different data type in methods 
public class Methos_Over_loadding {

	void demo(int x, int y) {
		System.out.println("values of x,y is : " + x + "," + y);
	}

	void demo(int y, int x, int z) {
		System.out.println("values of x,y,z is : " + x + "," + y + "," + z);
	}

	void demo(String x, char y) {
		System.out.println("values of x,y is : " + x + "," + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methos_Over_loadding md = new Methos_Over_loadding();
		md.demo(100, 200);
		md.demo("String", 'A');
		md.demo(1, 2, 3);
	}

}
