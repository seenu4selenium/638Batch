package corejava;

public class Calculator {
	public static void add() {
		// DataType Objet = Value;
		int a = 90;
		int b = 80;
		System.out.println("Add Results is: " + (a + b));
	}

	public static void sub() {
		// DataType Objet = Value;
		int a = 90;
		int b = 80;
		System.out.println("Sub Results is---> " + (a - b));
	}

	public static void main(String[] args) {
		System.out.println("I am Main Method test");
		// Calling a method
		add();
		sub();
	}

}
