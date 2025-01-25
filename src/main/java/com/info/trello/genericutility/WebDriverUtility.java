package com.info.trello.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Denish
 *
 */
public class WebDriverUtility {
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	public boolean waitForCompleteTitle(WebDriver driver,String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean validate=wait.until(ExpectedConditions.titleIs(expectedTitle));
		return validate;
	}
	public boolean  waitForCompleteURL(WebDriver driver,String expectedURL) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean validate = wait.until(ExpectedConditions.urlToBe(expectedURL));
		return validate;
	}
	public WebElement ClickableElement(WebDriver driver,WebElement targetEle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ClickableElement=wait.until(ExpectedConditions.elementToBeClickable(targetEle));
		return ClickableElement;
	}

}
