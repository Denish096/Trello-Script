package com.info.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginToContinue {
	WebDriver driver;

	public TrelloLoginToContinue(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameTF;

	public WebElement getUsernameTF() {
		return usernameTF;

	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continueBTN;

	public WebElement getContinueBTN() {
		return continueBTN;
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement PasswordTF;

	public WebElement getPasswordTf() {
		return PasswordTF;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginBTN;

	public WebElement getLoginBTN() {
		return LoginBTN;
	}
	@FindBy(xpath = "//input[@id='password']/../../../following-sibling::span")
	private WebElement FlutterBTN;
	
	public WebElement getFlutterBTN() {
		return FlutterBTN;
	}
	
}
