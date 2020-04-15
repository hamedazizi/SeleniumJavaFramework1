package Constructions;

public class Person {
	
	//private variables
	private String firstName;
	private String lastName;
	
	//constructor
	public Person(String firstName, String lastname) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	//getter and setter for variable
	public String setFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;

}
}