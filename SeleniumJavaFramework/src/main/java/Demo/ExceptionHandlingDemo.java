package Demo;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		try {
			
		
		System.out.println("Hello World...!");
		
		//int i = 1/0;
		//System.out.println("Completed");
		//you can also dilberatly throw exception by using throw keyword
		throw new ArithmeticException("not valid operation");
		
		
		}
		catch(Exception exp) {
			System.out.println("I am inside catch block");
			System.out.println("Message is : "+exp.getMessage());
			System.out.println("Cause is : "+exp.getCause());
			exp.printStackTrace();
		}
		finally {
			System.out.println("i am inside finally block");
		}
	}

}
