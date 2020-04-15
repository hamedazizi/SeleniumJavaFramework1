package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNG_Demo;

public class PropertiesFile {
	
	static Properties prop= new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
		
	}
	public static void getProperties() {
		
		try {
			
         //1st create obj of properties file
		prop = new Properties();
		
		String projectPath = System.getProperty("user.dir");
		
		//2nd create obj of class InputStream
		InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
		
		//3rd load properties file
		prop.load(input);
		
		//4th get values from properties
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		TestNG_Demo.browserName=browser;
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
			
		}
	}
	//how to set data for properties file
	public static void setProperties() {
		try {
		//create obj of properties class.
		OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
		prop.setProperty("result", "pass");
		prop.store(output, null);
		
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
			
			//set values 
			
	}
	}

}

