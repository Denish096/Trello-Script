package com.info.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoards {
	WebDriver driver;

	public TrelloBoards(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Create new board']")
	private WebElement CreateNewBoard;
	public WebElement getCreateNewBoard() {
		return CreateNewBoard;
	}
	@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	private WebElement BoardTitleTF;
	public WebElement getBoardTitleTF() {
		return BoardTitleTF;
	}
	@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
	private WebElement CreateBTN;
	public WebElement getCreateBTN() {
		return CreateBTN;
	}
	@FindBy(xpath = "//button[@data-testid='header-member-menu-button']")
	private WebElement AccountBTN;
	public WebElement getAccountBTN() {
		return AccountBTN;
	}
	@FindBy(xpath = "//span[.='Log out']")
	private WebElement LogoutBTN;
	public WebElement getLogoutBTN() {
		return LogoutBTN;
	}
	@FindBy(xpath = "//p[.='Create']")
	private WebElement NavMenuCreateBTN;
	public WebElement getNavMenuCreateBTN() {
		return NavMenuCreateBTN;
	}
	@FindBy(xpath = "//button[@data-testid='header-create-board-button']")
	private WebElement HeaderCreateBoardBTN;
	public WebElement getHeaderCreateBoardBTN() {
		return HeaderCreateBoardBTN;
	}
	@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	private WebElement HeaderBoardTitleTF;
	public WebElement getHeaderBoardTitleTF() {
		return HeaderBoardTitleTF;
	}
	@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
	private WebElement HeaderCreateBTN;
	public WebElement getHeaderCreateBTN() {
		return HeaderCreateBTN;
	}
	
}
