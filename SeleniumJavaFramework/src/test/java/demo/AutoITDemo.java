package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	public static void main(String[] args) throws Throwable  {
		
		test();
	}
	
	
	public static void test() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/hamed/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("C://Users//hamed//Desktop//AutoIT//FileUploadScript1.exe");
		
		//Runtime.getRuntime().exec("C:/Users/hamed/Desktop/AutoIT/FileUploadScript.exe");
	
		Thread.sleep(3000);
		driver.close();
	}

}
