package org.testing.TestScripts;

import java.io.IOException;
import org.testing.Base.BaseClass;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.TestSteps.YouTubeActivities;
import org.testing.utilities.ExcelDataRead;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class TC1 extends BaseClass {

	YouTubeActivities activities = new YouTubeActivities();

	@Test(dataProvider = "dataProvider")
	public void tc1Method(String userName,String password) throws InterruptedException, IOException, BiffException {
		Login login = new Login(properties, driver);
		Logout logout = new Logout(properties, driver);
		Home home = new Home(properties, driver);
		login.signIn(userName,password);
		// logout.signOut(driver);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TC1 Executed Successfully");
	}

	@DataProvider
	public Object[][] dataProvider() throws BiffException, IOException {
		int rows = ExcelDataRead.getNumberOfRows();
		int columns = ExcelDataRead.getNumberOfColumns();
		Object[][] object = new Object[rows][columns];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				object[i][j] = ExcelDataRead.readACell(i, j);
			}
		}
			
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.println(object[i][j]);
				}
		}
		return object;
	}

}
