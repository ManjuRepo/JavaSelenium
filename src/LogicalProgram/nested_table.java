package LogicalProgram;

public class nested_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {

			System.out.println("Tabels of : " + i);

			for (int j = 1; j <= 10; j++) {

				System.out.print((i * j) + " ");

			}

			System.out.println();
			System.out.println();
		}
	}

}
