package boards.info.trello.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.info.trello.genericutility.Baseclass;
import com.info.trello.genericutility.ExcelUtility;
import com.info.trello.pomrepository.TrelloBoards;
import com.info.trello.pomrepository.TrelloHomePage;
import com.info.trello.pomrepository.TrelloLogOutPage;
import com.info.trello.pomrepository.TrelloLoginPage;
import com.info.trello.pomrepository.TrelloLoginToContinue;
import com.info.trello.pomrepository.TrelloUserCreatedBoard;

public class TestCasefromChatGPT extends Baseclass {
	
	@Test
	public void delteCardFromList()throws Throwable {
//		give implicitly wait.
		webDriverUtils.implicitWait(driver);
//		create object for excel utility.
		ExcelUtility excelUtility = new ExcelUtility();
//		hard assert to verify Title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is verified ");
		System.out.println("Home Page URL is Verified");
//		create homepage object to access all elements refrences from POM class.
		TrelloHomePage homepage = new TrelloHomePage(driver);
//		click on login button.
		homepage.getLoginOption().click();
//		hard assert to verify Title.
//		Assert.assertTrue(excelUtility.readStringData("testCase2", 4, 1).equals(driver.getTitle()),
//				"Title is Not Valid");
//		hard assert to verify URL.
//		Assert.assertTrue(excelUtility.readStringData("testcase2", 5, 1).equals(driver.getCurrentUrl()),
//				"URL is Not Valid");
		System.out.println("LoginPage Title & URL is verified");
//		create login page object to access all element refrence from login page.
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
//		to append username to username text fild.
		loginPage.getUsernameTF().sendKeys(fileUtility.readCommonData("username"));
//		click on continue button.
		loginPage.getContinueBTN().click();
//		explicit wait to verfy Title.
//		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 7, 1));
//		hard aasert to verify Title.
//		Assert.assertTrue(excelUtility.readStringData("testCase2", 7, 1).equals(driver.getTitle()),
//				"Title is Not Valid");
////		hard asssert to verift URL.
//		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 8, 1)),
//				"URL is Not Valid");
		System.out.println("LoginToContinue Page Title & URL is verified");
//		create an object of login to continue to access all the elements from POM class.
		TrelloLoginToContinue loginToContinue = new TrelloLoginToContinue(driver);
//		to append the user name into username text field.
		loginToContinue.getPasswordTf().sendKeys("hello");
//	loginToContinue.getPasswordTf().sendKeys(fileUtility.readCommonData("user"));
//		 click on continue button
		loginToContinue.getContinueBTN().click();
//		append password to password text field.
		loginToContinue.getPasswordTf().sendKeys(fileUtility.readCommonData("password"));
//		click on flutter button.
		loginToContinue.getFlutterBTN().click();
//		click on login button.
		loginToContinue.getLoginBTN().click();
//		explicit wait to verify Title.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 10, 1));
//		hard assert to verify Title.
		Assert.assertTrue(excelUtility.readStringData("testcase2", 10, 1).equals(driver.getTitle()),
				"Title is Not Valid");
//		hard assert to verify URL .
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 11, 1)),
				"URL content is Not Valid");
		System.out.println("TrelloBoards Page Title & URL is verified");
//		create boards page object to access all the element refrence from POM class.
		TrelloBoards BoardPage = new TrelloBoards(driver);
//		create softassert object for giving soft assertions.
//		softAssert.assertTrue(BoardPage.getLogoutBTN().isDisplayed(), "LogOut BTN is Not Displayed");
//		click on navigation menu click button.
		BoardPage.getNavMenuCreateBTN().click();
//		hard assert to header create button.
		Assert.assertTrue(BoardPage.getHeaderCreateBoardBTN().isDisplayed(), "Header Create Board Button is not Displayed");
//		click on header create board button .
		BoardPage.getHeaderCreateBoardBTN().click();
//		hard assert to verify header text field is displayed?
		Assert.assertTrue(BoardPage.getHeaderBoardTitleTF().isDisplayed(), "Header Create Board Title TF is not Displayed");
//		append th board title to board title text field.
		BoardPage.getHeaderBoardTitleTF().sendKeys(excelUtility.readStringData("testCase2", 13, 1));
//		explicit wait till the create button is clickable.
		webDriverUtils.ClickableElement(driver, BoardPage.getCreateBTN());
//		click on header create button.
		BoardPage.getHeaderCreateBTN().click();
//		explicit wait to verify Title.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 15, 1));
//		hard assert to verify Title.
		Assert.assertTrue(driver.getTitle().equals(excelUtility.readStringData("testCase2", 15, 1)), " Newly Created Board Title is Not Verfied");
//		hard assert to verify URl.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 16, 1)), "Newly Created Board URL is Not Verfied");
//		create an object of a user created board to access all the elements from POM class.
		TrelloUserCreatedBoard userCreatedBoard = new TrelloUserCreatedBoard(driver);
//		append the dat into enter List text field.
		userCreatedBoard.getenterListTF().sendKeys(excelUtility.readStringData("testCase2", 17, 1));
//		click on addlist button.
		userCreatedBoard.getAddlistBTN().click();
//		append the data into enter list text field.
		userCreatedBoard.getenterListTF().sendKeys(excelUtility.readStringData("testCase2", 18, 1));
//		click on addlist button.
		userCreatedBoard.getAddlistBTN().click();
//		create actions class object to access all the mothods of actions class.
		Actions actions =new Actions(driver);
//		to swap the elements .
		actions.clickAndHold(userCreatedBoard.getCreatedListOne()).moveByOffset(350, 50).release().build().perform();
//		click on menu button.
		
		userCreatedBoard.getaddCardoption().click();
		userCreatedBoard.getAddcardTF().sendKeys(excelUtility.readStringData("testCase2", 24, 1));
		userCreatedBoard.getAddCardBTN().click();
		Thread.sleep(3000);
		actions.clickAndHold(userCreatedBoard.getFirstCardFromListOne()).moveToElement(userCreatedBoard.getCreatedListTwo()).release().build().perform();
		Thread.sleep(3000);
		
		userCreatedBoard.getMenuBTN().click();
//		click on close board button.
		userCreatedBoard.getCloseBoard().click();
//		click on close button.
		userCreatedBoard.getCloseBtn().click();
//		click on permenently delete button.
		userCreatedBoard.getpermenentDeleteBTN().click();
//		click on delete button.
		userCreatedBoard.getDeletBTN().click();
//		click on account button.
		BoardPage.getAccountBTN().click();
//		click on logout button.
		BoardPage.getLogoutBTN().click();
//		hard assert to verify title.
		Assert.assertTrue(driver.getTitle().equals(excelUtility.readStringData("testCase2", 21, 1)), "LogOut Page title is Verified");
//  	hard assert to verify URL.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 22, 1)), "LogOut Page URL is Verified");
//		create an object of an trello logout page to access all th elements from POM class.
		TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
//		click on logout button.
		LogOutPage.getLogoutBTN().click();
//		explicit wait to verify title.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 1, 1));
//		hard assert to verify Title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is verified ");
//		hard assert to veri URL.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 2, 1)),"URL is Not verified");
//		soft assert to use assert all method.
		softAssert.assertAll();
	}
	public void moveCardToAnotherList()throws Throwable {
//		give implicitly wait.
		webDriverUtils.implicitWait(driver);
//		create object for excel utility.
		ExcelUtility excelUtility = new ExcelUtility();
//		hard assert to verify Title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is verified ");
		System.out.println("Home Page URL is Verified");
//		create homepage object to access all elements refrences from POM class.
		TrelloHomePage homepage = new TrelloHomePage(driver);
//		click on login button.
		homepage.getLoginOption().click();
//		hard assert to verify Title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 4, 1).equals(driver.getTitle()),
				"Title is Not Valid");
//		hard assert to verify URL.
		Assert.assertTrue(excelUtility.readStringData("testcase2", 5, 1).equals(driver.getCurrentUrl()),
				"URL is Not Valid");
		System.out.println("LoginPage Title & URL is verified");
//		create login page object to access all element refrence from login page.
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
//		to append username to username text fild.
		loginPage.getUsernameTF().sendKeys(fileUtility.readCommonData("username"));
//		click on continue button.
		loginPage.getContinueBTN().click();
//		explicit wait to verfy Title.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 7, 1));
//		hard aasert to verify Title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 7, 1).equals(driver.getTitle()),
				"Title is Not Valid");
//		hard asssert to verift URL.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 8, 1)),
				"URL is Not Valid");
		System.out.println("LoginToContinue Page Title & URL is verified");
//		create an object of login to continue to access all the elements from POM class.
		TrelloLoginToContinue loginToContinue = new TrelloLoginToContinue(driver);
//		append password to password text field.
		loginToContinue.getPasswordTf().sendKeys(fileUtility.readCommonData("password"));
//		click on flutter button.
		loginToContinue.getFlutterBTN().click();
//		click on login button.
		loginToContinue.getLoginBTN().click();
//		explicit wait to verify Title.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 10, 1));
//		hard assert to verify Title.
		Assert.assertTrue(excelUtility.readStringData("testcase2", 10, 1).equals(driver.getTitle()),
				"Title is Not Valid");
//		hard assert to verify URL .
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 11, 1)),
				"URL content is Not Valid");
		System.out.println("TrelloBoards Page Title & URL is verified");
//		create boards page object to access all the element refrence from POM class.
		TrelloBoards BoardPage = new TrelloBoards(driver);
//		create softassert object for giving soft assertions.
//		softAssert.assertTrue(BoardPage.getLogoutBTN().isDisplayed(), "LogOut BTN is Not Displayed");
//		click on navigation menu click button.
		BoardPage.getNavMenuCreateBTN().click();
//		hard assert to header create button.
		Assert.assertTrue(BoardPage.getHeaderCreateBoardBTN().isDisplayed(), "Header Create Board Button is not Displayed");
//		click on header create board button .
		BoardPage.getHeaderCreateBoardBTN().click();
//		hard assert to verify header text field is displayed?
		Assert.assertTrue(BoardPage.getHeaderBoardTitleTF().isDisplayed(), "Header Create Board Title TF is not Displayed");
//		append th board title to board title text field.
		BoardPage.getHeaderBoardTitleTF().sendKeys(excelUtility.readStringData("testCase2", 13, 1));
//		explicit wait till the create button is clickable.
		webDriverUtils.ClickableElement(driver, BoardPage.getCreateBTN());
//		click on header create button.
		BoardPage.getHeaderCreateBTN().click();
//		explicit wait to verify Title.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 15, 1));
//		hard assert to verify Title.
		Assert.assertTrue(driver.getTitle().equals(excelUtility.readStringData("testCase2", 15, 1)), " Newly Created Board Title is Not Verfied");
//		hard assert to verify URl.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 16, 1)), "Newly Created Board URL is Not Verfied");
//		create an object of a user created board to access all the elements from POM class.
		TrelloUserCreatedBoard userCreatedBoard = new TrelloUserCreatedBoard(driver);
//		append the dat into enter List text field.
		userCreatedBoard.getenterListTF().sendKeys(excelUtility.readStringData("testCase2", 17, 1));
//		click on addlist button.
		userCreatedBoard.getAddlistBTN().click();
//		append the data into enter list text field.
		userCreatedBoard.getenterListTF().sendKeys(excelUtility.readStringData("testCase2", 18, 1));
//		click on addlist button.
		userCreatedBoard.getAddlistBTN().click();
//		create actions class object to access all the mothods of actions class.
		Actions actions =new Actions(driver);
//		to swap the elements .
		actions.clickAndHold(userCreatedBoard.getCreatedListOne()).moveByOffset(350, 50).release().build().perform();
//		click on menu button.
		
		userCreatedBoard.getaddCardoption().click();
		userCreatedBoard.getAddcardTF().sendKeys(excelUtility.readStringData("testCase2", 24, 1));
		userCreatedBoard.getAddCardBTN().click();
		Thread.sleep(3000);
		actions.clickAndHold(userCreatedBoard.getFirstCardFromListOne()).moveToElement(userCreatedBoard.getCreatedListTwo()).release().build().perform();
		Thread.sleep(3000);
		userCreatedBoard.getFirstCardFromListTwo().click();
		userCreatedBoard.getlabelsoption().click();
		userCreatedBoard.getorangeLable().click();
		userCreatedBoard.getcreateLableBTN().click();
		userCreatedBoard.getarchieveoption().click();
		userCreatedBoard.getarchiveDeleteBTN().click();
		userCreatedBoard.getdeleteCard().click();
		userCreatedBoard.getMenuBTN().click();
//		click on close board button.
		userCreatedBoard.getCloseBoard().click();
//		click on close button.
		userCreatedBoard.getCloseBtn().click();
//		click on permenently delete button.
		userCreatedBoard.getpermenentDeleteBTN().click();
//		click on delete button.
		userCreatedBoard.getDeletBTN().click();
//		click on account button.
		BoardPage.getAccountBTN().click();
//		click on logout button.
		BoardPage.getLogoutBTN().click();
//		hard assert to verify title.
		Assert.assertTrue(driver.getTitle().equals(excelUtility.readStringData("testCase2", 21, 1)), "LogOut Page title is Verified");
//  	hard assert to verify URL.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 22, 1)), "LogOut Page URL is Verified");
//		create an object of an trello logout page to access all th elements from POM class.
		TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
//		click on logout button.
		LogOutPage.getLogoutBTN().click();
//		explicit wait to verify title.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 1, 1));
//		hard assert to verify Title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is verified ");
//		hard assert to veri URL.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 2, 1)),"URL is Not verified");
//		soft assert to use assert all method.
		softAssert.assertAll();
	}
	

}
