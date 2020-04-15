package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		//here i created object properties class 
		Properties prop = new Properties();
		    //created obj fileinput stream class to read from./or create connection btwn java code and configfile.// here we have to specify the path of file stream 
		FileInputStream ip = new FileInputStream("C:\\Users\\hamed\\eclipse-workspace_nov_27_18\\SeleniumJavaFramework\\src\\test\\java\\SeleniumSessions\\config.properties");
		// here after the connection is estableshed , we load that particular property file .
		
		prop.load(ip);
		
		//now what ever the keys and values we create in the properties file , we read them here.
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url =prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName =prop.getProperty("browser");
		
		System.out.println(browserName);
		
		//here i write a logic condition if..browser is equals chrome ,, launch chrome, if not go to next blog of code..
		
		if(browserName.equals("chrome")) {
		                                    //here i initialize my webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamed\\eclipse-workspace_nov_27_18\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		
		driver =new ChromeDriver();       //launch chrome
		} else if(browserName.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamed\\eclipse-workspace_nov_27_18\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamed\\eclipse-workspace_nov_27_18\\SeleniumJavaFramework\\drivers\\IEDriver\\IEDriverServer.exe");
		   driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		
		driver.findElement(By.xpath(prop.getProperty("userid_xpath"))).sendKeys(prop.getProperty("emial"));
		
		driver.findElement(By.xpath(prop.getProperty("pass_xpath"))).sendKeys(prop.getProperty("password"));
		
		
		
	}

}
