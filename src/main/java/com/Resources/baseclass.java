package com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {

	public WebDriver driver; // this driver containts value

	public Properties prop;
	public static String email = generateRandomEmailID();

	public void initilizeDriver() throws IOException {
		// Read the file

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Gauri\\eclipse-workspace\\SeleniumTestNGFrameWorks\\src\\main\\java\\com\\Resources\\data.properties");

		// Aceess content inside the properties file
		prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else {

			System.out.println("please choosee valid browser");

		}
	}

	public static String generateRandomEmailID()

	{
		return "abc" + System.currentTimeMillis() + "@gmail.com";

	}

	@BeforeMethod()
	public void launchBrowser() throws IOException {
		initilizeDriver();

		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void quitBrowser() {
		driver.quit();

	}

}
