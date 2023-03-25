package org.testing.Pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.utilities.RandomNumberGenerator;
import org.testing.utilities.ScreenShotCaptured;
import org.testingAssertion.Assertion;
import org.testng.Assert;

public class Login {
	
	Properties properties;
	WebDriver driver;
	public Login(Properties properties, WebDriver driver)
	{
		this.properties = properties;
		this.driver = driver;
	}
	
	public void signIn(String userName , String password) throws IOException
	{
		try {
		    driver.findElement(By.xpath(properties.getProperty("Email"))).sendKeys(userName);
		    driver.findElement(By.xpath(properties.getProperty("Password"))).sendKeys(password);
     	    driver.findElement(By.xpath(properties.getProperty("SignIn"))).click();
   			Thread.sleep(10000);
			String actual = driver.findElement(By.xpath(properties.getProperty("Profile"))).getText();
			Assertion.assertContains(actual, "Sushil");
			}catch(Exception exception)
			{
				ScreenShotCaptured.takeScreenShot("../FacebookFramwork/src/test/java/org/testing/ScreenShots/"+RandomNumberGenerator.randomNumber()+".png", driver);
				System.out.println("There is an Exception in Code :"+exception);
			}
	}

}
