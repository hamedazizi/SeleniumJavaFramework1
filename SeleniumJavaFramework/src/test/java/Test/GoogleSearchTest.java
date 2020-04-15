package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	
	public static void main(String[] args) {
		googleSearch();
		
		
	}
	
	public static void googleSearch(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamed\\Desktop\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//go to google.com
		driver.get("http://google.com/");
		
		//enter text in search TextBox
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");	
		
		
		GoogleSearchPage.textBox_search(driver).sendKeys("Automation step by step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		// this follow method can also enter on the search option
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//close the browser
		driver.close();
		
		
		
		
		
		
		
	}
}
