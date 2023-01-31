package corejava;

public class VariableSample {
	// Global Variable
	static int a = 100;
	static int b = 50;

	public static void add() {
		// Local Variable
		//int a = 90;
		//int b = 80;
		System.out.println("Add Results is: " + (a + b));
	}

	public static void main(String[] args) {
		add();
	}

}
