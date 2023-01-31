package corejava;

public class Assignemt1_Age {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 17;

		if (age > 0 && age <= 2) {
			System.out.println("infant");
		} else if (age > 2 && age <= 12) {
			System.out.println("child");
		} else if (age > 12 && age <= 25) {
			System.out.println("youth");
		} else if (age > 25 && age <= 59) {
			System.out.println("adult");
		} else if (age > 59 && age <= 100) {
			System.out.println("senior citizen");
		} else {
			System.out.println("Please enter age input in b/w 1 to 100");
		}

	}
}
