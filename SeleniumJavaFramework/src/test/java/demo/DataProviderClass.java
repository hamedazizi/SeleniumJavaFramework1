package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	//This method takes data as input parameters.
	//The attribute dataprovider is mapped to get data
	@Test(dataProvider="getData")
	//Number of columns should match the number of input parameters
	public void loginTest(String Uid, String Pwd) {
		System.out.println("UserName is "+ Uid);
		System.out.println("Password is "+ Pwd);
		}

	//if the name is not supplied, the data provider's name automatically defaults to the method name
	//A data provider returns an array of objects.
	@DataProvider(name="getData")
	public Object[][] getData(){
		//object [][] data =new obj [rowCount][colCount];
		Object[][] data = new Object[2][2];
		
		data [0][0] ="FirstUid";
		data [0][1] ="FirstPWD";
		
		data[1][0]="SecondUid";
		data[1][1]="SecondPWD";
	
		return data;
	}
}
