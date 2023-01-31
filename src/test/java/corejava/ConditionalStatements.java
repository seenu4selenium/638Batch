package corejava;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 90;
		int b = 90;
		int c = 90;

		// Find the large value
		if (a > b && a > c) {
			System.out.println("A is large value");
		} else if (b > a && b > c) {
			System.out.println("B is large value");
		} else if (c > a && c > b ) {
			System.out.println("C is large value");
		}else {
			System.out.println("All are same/Equal");
		}

	}
}
