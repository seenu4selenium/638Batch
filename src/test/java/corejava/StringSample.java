package corejava;

public class StringSample {
	public static void main(String[] args) {
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
		String p = "apple";
		// equls():Compares this string to the specified object.
		if (n.equals(p)) {
			System.out.println("Both the Strings are  matching");
		} else {
			System.out.println("Both the Strings are not matching");
		}

		// EqulasIgnoreCase(): Compares this String to another String, ignoring
		// caseconsiderations.
		if (n.equalsIgnoreCase(p)) {
			System.out.println("Both the Strings are  matching**");
		} else {
			System.out.println("Both the Strings are not matching**");
		}

		String q = "Hi all, How are you?";
		if (q.contains("are you")) {
			System.out.println("Given chars are avialble in String");
		} else {
			System.out.println("Given chars are NOT avialble in String");
		}

	}
}
