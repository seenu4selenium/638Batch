package corejava;

public class ObjectCreation {
	//Non static method
	public void add() {
		int a = 90;
		int b = 80;
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		//Create an object for Non static method then call method with the help object 
		
		//Create an object for class
		//CLASSNAME ReferenceName = new CLASSNAME();
		ObjectCreation k = new ObjectCreation();
		k.add();
		
		//add();
	}

}
