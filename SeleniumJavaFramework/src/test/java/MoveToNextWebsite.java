import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class MoveToNextWebsite {

	public static void main(String[] args) throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com/");

		// driver.findElement(By.name("q")).sendKeys("Automation step by step");

		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("www.costco.com");
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.linkText("Welcome to Costco Wholesale")).click();
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/a/h3")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("search-field")).sendKeys("toilet paper");
		driver.findElement(By.xpath("//*[@id='formcatsearch']/div[3]/button")).click();
		
		driver.findElement(By.linkText("Kirkland Signature Bath Tissue, 2-Ply, 425 sheets, 30 rolls")).click();
		System.out.println("TestCase passed Successfully");
		Thread.sleep(4000);
		
		
		//driver.quit();

	}

}
