package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hamed/Desktop/chromedriver.exe");
		//this will run chrome headless , with out GUI
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Headless");
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		System.out.println("Completed");
		driver.close();
		driver.quit();
	}

}
