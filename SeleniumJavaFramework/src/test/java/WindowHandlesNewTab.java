import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlesNewTab {
	
	@Test
	public void OpenNewWindow() throws InterruptedException {
		
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/hamed/Desktop/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    driver.get("http://www.google.com/");
	    
	    driver.manage().window().maximize();
	    
	    //open new tab, navigate to URL In it and wait for 3 seconds
	    ((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com','_blank');");
	   Thread.sleep(3000);
	   
	//create an instance  or array list to store opened windows, switch to the frist one and wait for 3 seconds
	   ArrayList<String> tabs_list=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs_list.get(0));
Thread.sleep(3000);
	//switch to second tab, wait , switch to first tab, wait, close current tab, wait for 3 seconds then quite the page
driver.switchTo().window(tabs_list.get(1));
Thread.sleep(3000);
driver.switchTo().window(tabs_list.get(0));
Thread.sleep(3000);
driver.close();
Thread.sleep(3000);
driver.quit();

	}
}