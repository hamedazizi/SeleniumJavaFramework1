package oops;

//here class is abstract
public abstract class AbstractSuperClass {
	//data members cant be abstract
	public int a=10;
	
	//myMethod() is an abstract
	abstract void myMethod();
	
	//myMethod(int x){ is not an abstract method. it is a concrete method.
	void myMethod(int x) {
		System.out.println("I am in Super class and i am not an abstract method. iam a concrete method.");
	}

}
