package oops;

//Inheriting the AbstractSuperClass
public class AbstractChildClass extends AbstractSuperClass {

	public static void main(String[] args) {
		//here we cant instantiate the AbstractSuperClass but we can instantiate the AbstractChildClass class.
		//Using the instance of AbstractChildClass we can access methods and data members of AbstractSuperClass class
		//AbstractSuperClass ab=new AbstractSuperClass();can not instantiate abstractSuperClass..

		
		AbstractSuperClass obj=new AbstractChildClass();
		System.out.println("I am a data member from super class and my value is "+obj.a);
		obj.myMethod();
		obj.myMethod(20);

	}

	@Override
	void myMethod() {

        System.out.println("I am in child class");
		
	}

}
