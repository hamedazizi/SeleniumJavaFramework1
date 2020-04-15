package Demo;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	WebDriver driver=null;
	@BeforeMethod
	@Parameters("browser")
	public void paramerizedTest(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/hamed/Desktop/chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/hamed/Desktop/SeleniumJavaFramework/drivers/firefoxdriver/geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:/Users/hamed/Desktop/SeleniumJavaFramework/drivers/IEDriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
	}
		@Test
		public void test1() throws Exception {
			driver.get("https://google.com/");
			Thread.sleep(3000);
			
		
	}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}

}
