package oops;

public class MethodOverridingChildClass extends MethodOverridingParentClass {

	public void myMethod() {
		
		System.out.println("I am  a method from child Class");
		
	}
	public static void main(String[] args) {
		MethodOverridingChildClass obj = new MethodOverridingChildClass();
		//it calls the child class method myMethod()
		obj.myMethod();
		
		
		
		


		

	}

}
