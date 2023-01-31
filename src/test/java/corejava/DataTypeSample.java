package corejava;

public class DataTypeSample {

	public static void main(String[] args) {
		byte a = 90;
		short b = 789;
		int d = 45;
		long e = 345435;

		double c = 79345.34543;
		char g = '$';

		boolean j = true;
		boolean k = false;

		String h = "Selenium is a Automation Framework";
		System.out.println(h);
		String m = "Hi all";
		// Length: Returns the length of this string.
		System.out.println(m.length());

		// Get the 3rd position character
		System.out.println(h.charAt(15));

		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());

		String n = "Apple";
		String p = "Apple";

		if (n.equals(p)) {
			System.out.println("Both the Strings are  matching");

		} else {
			System.out.println("Both the Strings are not matching");
		}

	}

}
