package com.info.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserCreatedBoard {
	WebDriver driver;
	public  TrelloUserCreatedBoard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@aria-label='Show menu']")
	private WebElement menuBTN;
	public WebElement getMenuBTN() {
		return menuBTN;
	}
	@FindBy(xpath = "//a [contains(.,'Close board')]")
	private WebElement closeBoard;
	public WebElement getCloseBoard() {
		return	closeBoard;
	}
	@FindBy(xpath = "//input[@value='Close']")
	private WebElement closeBTN;
	public WebElement getCloseBtn() {
		return closeBTN;
	}
	@FindBy(xpath = "//button[.='Permanently delete board']")
	private WebElement permenentDeleteBTN;
	public WebElement getpermenentDeleteBTN() {
		return permenentDeleteBTN;
	}
	@FindBy(xpath = "//button[.='Delete']")
	private WebElement DeletBTN;
	public WebElement getDeletBTN() {
		return DeletBTN;
	}
	@FindBy(xpath = "//button[@data-testid='list-composer-button']")
	private WebElement addaList;
	public WebElement getaddaList() {
		return addaList;
	}
	@FindBy (xpath = "//button[.='Add list']")
	private WebElement AddlistBTN;
	public WebElement getAddlistBTN() {
		return AddlistBTN;
	}
	@FindBy (xpath = "//span[@data-testid='CloseIcon']")
	private WebElement closeicon;
	public WebElement getcloseicon() {
		return closeicon;
	}
	@FindBy(xpath = "//textarea[@aria-label='Enter list title…']")
	private WebElement enterListTF;
	public WebElement getenterListTF() {
		return enterListTF;
	}
	@FindBy(xpath = "//h2[.='CreatedListOne']")
	private WebElement CreatedListOne;
	public WebElement getCreatedListOne() {
		return CreatedListOne;
	}
	@FindBy(xpath = "//h2[.='CreatedListTwo']")
	private WebElement CreatedListTwo;
	public WebElement getCreatedListTwo() {
		return CreatedListTwo;
	}
	@FindBy(xpath = "//h2[.='CreatedListOne']/../following-sibling::div/a/span[.='Add a card']")
	private WebElement addCardoption;
	public WebElement getaddCardoption() {
		return addCardoption;
	}
	@FindBy(xpath="//textarea[@placeholder='Enter a title for this card…']")
	private WebElement AddcardTF;
	public WebElement getAddcardTF() {
		return AddcardTF;
	}
	@FindBy(xpath = "//input[@value='Add card']")
	private WebElement AddcardBTN;
	public WebElement getAddCardBTN() {
		return AddcardBTN;
	}
	@FindBy(xpath = "//h2[.='CreatedListOne']/../ancestor::div[@data-testid='list-wrapper']//a[@data-testid='trello-card']")
	private WebElement FirstCardFromListOne;
	public WebElement getFirstCardFromListOne() {
		return FirstCardFromListOne;
	}
	@FindBy(xpath = "//h2[.='CreatedListTwo']/../ancestor::div[@data-testid='list-wrapper']//a[@data-testid='trello-card']")
	private WebElement FirstCardFromListTwo;
	public WebElement getFirstCardFromListTwo() {
		return FirstCardFromListTwo;
	}
	@FindBy(xpath = "//a[@title='Labels']")
	private WebElement labelsoption;
	public WebElement getlabelsoption() {
		return labelsoption;
	}
	@FindBy(xpath = "//div[@data-color='orange']")
	private WebElement orangeLable;
	public WebElement getorangeLable() {
		return orangeLable;
	}
	@FindBy(xpath = "//button[.='Create a new label']")
	private WebElement createLableBTN;
	public WebElement getcreateLableBTN() {
		return createLableBTN;
	}
	
	@FindBy(xpath = "//button[@data-testid='card-back-due-date-button']")
	private WebElement datesoption;
	public WebElement getdatesoption() {
		return datesoption;
	}
	@FindBy(xpath = "//input[@data-testid='card-back-new-comment-input-skeleton']")
	private WebElement commentsTF;
	public WebElement getcommentsTF() {
		return commentsTF ;
	}
	@FindBy(xpath = "//span[.='Checklist']")
	private WebElement checkListoption;
	public WebElement getcheckListoption() {
		return checkListoption;
	}
	@FindBy(xpath="//span[.='Archive']")
	private WebElement archieveoption;
	public WebElement getarchieveoption() {
		return archieveoption;
	}
	@FindBy(xpath = "//span[.='Delete']")
	private WebElement archiveDeleteBTN;
	public WebElement getarchiveDeleteBTN() {
		return archiveDeleteBTN;
	}
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteCard;
	public WebElement getdeleteCard() {
		return deleteCard;
	}
}
