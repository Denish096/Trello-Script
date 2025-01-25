package com.info.trello.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

/**
 * @author Denish
 */

public class Baseclass {
	public WebDriver driver;
	public fileUtility fileUtility = new fileUtility();
	public WebDriverUtility webDriverUtils = new WebDriverUtility();
	public SoftAssert softAssert;

	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		String BrowserName = fileUtility.readCommonData("browser");
		if (BrowserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BrowserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtility.readCommonData("url"));
		
	}


	@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
