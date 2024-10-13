package Other;

public class SwitchCase {
	static String day = "Mondays";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			switch (day) {
			case "Monday": {
				System.out.println("Day 1");
				break;
			}
			case "Tuesday": {
				System.out.println("Day 2");
				break;
			}
			case "Wednesday": {
				System.out.println("Day 3");
				break;
			}
			case "Thursday": {
				System.out.println("Day 4");
				break;
			}
			case "Friday": {
				System.out.println("Day 5");
				break;
			}
			case "Saturday": {
				System.out.println("Day 6");
				break;
			}
			case "Sunday": {
				System.out.println("Day 7");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + day);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
