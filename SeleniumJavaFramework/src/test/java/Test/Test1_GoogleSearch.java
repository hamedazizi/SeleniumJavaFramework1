package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	
	public static void main(String[] args) {
		googleSearch();
		
		
	}
	
	public static void googleSearch(){
		
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//go to google.com
		driver.get("https://google.com/");
		
		//enter text in search TextBox
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");	
		
		//click on search button
		driver.findElement(By.name("btnK")).click();
		
		// this follow method can also enter on the search option
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//close the browser
		driver.close();
		
		System.out.println("Test completed successfully");
		
		
		
		
		
	}
}
