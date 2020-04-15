package oops;

public class QA extends Employee {

	String fullName ="Hamed azizi";
	
	public static void main(String[] args) {


		QA objName = new QA();
		System.out.println(objName.name);
		System.out.println(objName.fullName);
		//In the above example, QA object can access the properties of its own 
		//as well as Employee class.
		
		
		
	}

}
