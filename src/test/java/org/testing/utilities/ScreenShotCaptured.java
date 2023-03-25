package org.testing.utilities;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenShotCaptured {
	
	public static void takeScreenShot(String path, WebDriver driver) throws IOException
	{

        TakesScreenshot screenShot =((TakesScreenshot)driver);
        File SourceFile=screenShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SourceFile, new File(path));

    }
		
	
	
	

}
