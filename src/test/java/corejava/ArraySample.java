package corejava;

public class ArraySample {

	public static void main(String[] args) {
		// int a = 32434,4,343,43,43,43,43,4,34,3;
		// String b = "asdfsdf","hi","hello";
		String b[] = { "hi", "hello", "sdgdsg", "45435", "345345" };
		System.out.println(b.length);
		System.out.println(b[3]);

		int a[] = { 23, 4, 556, 7, 87989, 0, 45, 345, 467576 };
		System.out.println(a.length);
		System.out.println(a[5]);
		System.out.println("**********");
		// Print b values using for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("**********");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("$$$$$$$$$$$$$$");

		
		//Print array values using FOREACH loop
		for (int i : a) {
			System.out.println(i);
		}

	}

}
