package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void assertion() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hamed/Desktop/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com");
		//Actual title is "Home"
		//we took title as "Hom" to make the test fail
		
		String Title="Hom";
		String GetTitle =driver.getTitle();
		System.out.println("Assertion starts here...");
		
		//The assertion failed and next step is skipped ; To over come this we use try-catch block. See the below program.
	try {
		
	
		Assert.assertEquals(Title, GetTitle);
	}catch(Throwable t) {
		
	
		System.out.println("A blog for Software Testers");
	}
		driver.quit();
		
		
	}

}
