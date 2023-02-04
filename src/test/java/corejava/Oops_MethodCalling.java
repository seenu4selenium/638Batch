package corejava;

public class Oops_MethodCalling {

	public static void main(String[] args) {
		//Call parent class methods into child class, we have to create an object for parent class
		//CLASSNAME referenceName/ObjectName = new CLASSNAME();
		Oops_Inheritance1 test = new Oops_Inheritance1();
		
		test.add();
		test.sub();
		
//		add();
//		sub();
	}

}
