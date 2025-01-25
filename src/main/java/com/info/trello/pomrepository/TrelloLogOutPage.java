package com.info.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogOutPage {
	WebDriver driver;
public	TrelloLogOutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[.='Log out']")
	private WebElement LogoutBTN;
	public WebElement getLogoutBTN() {
		return LogoutBTN;
	}

}
