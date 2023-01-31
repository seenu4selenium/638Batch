package corejava;

public class NestedIfSample {

	public static void main(String[] args) {

		// want to book a flight ticket for your grandparents
		// age >=60 : 30% offer *;
			// Gender = female (30%)
			// Gender = male (25%)
			// Gender = Common (20%)

		int age = 78;
		String gender = "O";
		
		if (age >= 60) {
			System.out.println("booking offer for aged pple 30% offer");
			if (gender.equals("M")) {
				System.out.println("25% offer applicable ");
			} else if (gender.equals("F")) {
				System.out.println("30% offer applicable ");
			} else if (gender.equals("O")) {
				System.out.println("20% offer applicable ");
			}
		} else {
			System.out.println("booking offer is not applicable for below <60");

		}
	}
}
