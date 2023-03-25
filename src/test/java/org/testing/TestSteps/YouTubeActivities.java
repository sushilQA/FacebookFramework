package org.testing.TestSteps;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.utilities.RandomNumberGenerator;
import org.testing.utilities.ScreenShotCaptured;

public class YouTubeActivities {

	public void trendingClick(WebDriver driver, Properties properties) throws InterruptedException, IOException {
		try {
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			int count = 0;
			List<WebElement> list = driver.findElements(By.xpath(properties.getProperty("TrendingClick")));
			for (WebElement element : list) {
				action.click().sendKeys(element).perform();
				count = count + 1;
				System.out.println("Trending click = " + count);
				Thread.sleep(1000);
			}
			System.out.println("Trending clicked have been performed Successfully! ");
			Thread.sleep(3000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void youTubeHistory(WebDriver driver, Properties properties) throws InterruptedException, IOException {

		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("History"))).click();
			System.out.println("History has been performed Successfully! ");
			Thread.sleep(3000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void youTubeSubscribedVideos(WebDriver driver, Properties properties)
			throws InterruptedException, IOException {

		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Subscriptions"))).click();
			System.out.println("Subscriptions has been performed Successfully! ");
			Thread.sleep(3000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void playAnYouTubeVideo(WebDriver driver, Properties properties) throws InterruptedException, IOException {

		try {
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.sendKeys(driver.findElement(By.xpath(properties.getProperty("YouTubeVideo"))), Keys.ENTER).click()
					.perform();
			// action.sendKeys(Keys.ESCAPE).build().perform();
			Thread.sleep(3000);
			System.out.println("Video has been Played Successfully! ");
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void likeAnYouTubeVideo(WebDriver driver, Properties properties) throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("LikeYoutubeVideo"))).click();
			System.out.println("YouTube video has been Liked Successfully! ");
			Thread.sleep(3000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void subscribeAnYouTubeVideo(WebDriver driver, Properties properties)
			throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			WebElement subscribe = driver.findElement(By.xpath(properties.getProperty("Subscribe")));
			if (subscribe.getText().equalsIgnoreCase("Subscribe")) {
				subscribe.click();
				System.out.println("YouTube video has been Subscribe Successfully! ");
				Thread.sleep(3000);
			} else {

				subscribe.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(properties.getProperty("Unsubscribe"))).click();
				System.out.println("YouTube video has been UnSubscribe Successfully! ");
				Thread.sleep(3000);

			}
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void commentOnAnYouTubeVideo(WebDriver driver, Properties properties)
			throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
			WebElement comment = driver.findElement(By.xpath(properties.getProperty("Comment")));
			if (comment.getText().contains("Add a comment")) {
				comment.sendKeys("Comment Added By An Automated Script");
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("SubmitComment"))).click();

			} else {
				driver.findElement(By.xpath(properties.getProperty("Comment"))).click();
				comment.sendKeys("Comment Added By An Automated Script");
				Thread.sleep(1000);
				driver.findElement(By.xpath(properties.getProperty("SubmitComment"))).click();
			}
			Thread.sleep(3000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void watchLaterAnYouTubeVideo(WebDriver driver, Properties properties)
			throws InterruptedException, IOException {

		try {
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(driver.findElement(By.xpath(properties.getProperty("Video")))).perform();
			driver.findElement(By.xpath(properties.getProperty("WatchLater"))).click();
			;
			System.out.println("An YouTube video has been marked Watch Later Successfully! ");
			Thread.sleep(3000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}

	}

	public void libraryOnYouTubeVideo(WebDriver driver, Properties properties)
			throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Library"))).click();
			System.out.println("Library on YouTube has been clicked Successfully! ");
			Thread.sleep(3000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}

	public void youTubeLikedVideos(WebDriver driver, Properties properties) throws InterruptedException {

		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("LikedVideo"))).click();
			System.out.println("Liked Videos on YouTube has been clicked Successfully! ");
			Thread.sleep(3000);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

	public void youTubeWatchedLaterVideos(WebDriver driver, Properties properties)
			throws InterruptedException, IOException {

		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("WatchLaterBucket"))).click();
			System.out.println("Watch Later Bucket has been clicked Successfully !");
			Thread.sleep(3000);
			Thread.sleep(3000);
		} catch (Exception exception) {
			ScreenShotCaptured.takeScreenShot("../YTFramwork/src/test/java/org/testing/ScreenShots/"
					+ RandomNumberGenerator.randomNumber() + ".png", driver);
			System.out.println("There is an Exception in Code :" + exception);
		}
	}
}
