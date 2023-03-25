package org.testing.Pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.utilities.RandomNumberGenerator;
import org.testing.utilities.ScreenShotCaptured;

public class Home {

	Properties properties;
	WebDriver driver;

	public Home(Properties properties, WebDriver driver) {
		this.properties = properties;
		this.driver = driver;
	}

}
