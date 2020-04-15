package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textBox_search = By.name("q");
	
	By button_search = By.name("btnK");
	
	
	//create a constructor and get webdriver instance from calling class 
	public GoogleSearchPageObjects(WebDriver driver) {  
		
		this.driver = driver;
		
	}
	
	
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textBox_search).sendKeys(text);
		
		
	}
	
	public void clickSearchButton () {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
