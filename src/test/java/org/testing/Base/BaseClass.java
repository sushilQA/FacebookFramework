package org.testing.Base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties properties;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "../FacebookFramwork/chromedriver.exe");
		this.driver = new ChromeDriver(options);
		options.addArguments("--disable-notification");
		this.properties = LoadPropertiesFile.handlePropertyFile("../FacebookFramwork/ObjectRepositery.properties");
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
