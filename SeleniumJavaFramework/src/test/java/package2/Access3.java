package package2;

import package1.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		/*Access1 a =new Access1();//this error shows it cant access protected method from a diferen paackaage
		System.out.println(a.hours);
		System.out.println(a.minutes);*/
		
		//but if we extent to Access1 then still we get error 
		//but we can access it this way after extending to Access1
		
		Access3 a = new Access3();
		System.out.println(a.hours);
		System.out.println(a.minutes);
	}

}
