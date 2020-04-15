import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {

		try {
			String projectPath = System.getProperty("user.dir");
			System.out.println(projectPath);

			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("http://google.com/");

			// driver.findElement(By.name("q")).sendKeys("Automation step by step");

			WebElement textBox = driver.findElement(By.name("q"));
			
			textBox.sendKeys("Automation step by step");

			List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));

			int count = listOfInputElements.size();

			System.out.println("Count of Input Elements : " + count);

			Thread.sleep(3000);

			driver.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
