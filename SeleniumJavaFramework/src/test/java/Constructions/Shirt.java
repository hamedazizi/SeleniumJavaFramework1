package Constructions;

public class Shirt {
	
	//what are some property of this shirt , color and size
	public static String color;
	public static char size;
	
	//if we dont write a constructor, there is a default constructor
	/*Shirt(){
		System.out.println("inside Constructor");
	}*/
	
	//parameterized constructor. that we have to pass parameter 
	//and set the values
	Shirt(String newcolor, char newSize){
		color=newcolor;
		size=newSize;
		
	}
	
	public static void putOn() {
		System.out.println("shirt is on!");
	}

	public static void takeOff() {
		System.out.println("shirt is off!");
	}
	
	public static void setColor(String newColor) {
		color = newColor;
	}
	public static void setSize(char newSize) {
		size = newSize;
	}
}
