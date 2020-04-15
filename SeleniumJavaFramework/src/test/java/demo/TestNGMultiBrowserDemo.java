package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver= null;
	@BeforeTest
	@Parameters("browserName")
	public void setUp(String browserName) {
		
		System.out.println("Browser name is :"+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hamed/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/hamed/Desktop/SeleniumJavaFramework/drivers/firefoxdriver/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", "C:/Users/hamed/Desktop/SeleniumJavaFramework/drivers/IEDriver/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	}
	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("Test Completed successfully");
	}
}
