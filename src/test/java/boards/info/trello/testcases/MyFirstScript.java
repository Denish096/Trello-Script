package boards.info.trello.testcases;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.info.trello.genericutility.Baseclass;
import com.info.trello.genericutility.ExcelUtility;
import com.info.trello.pomrepository.TrelloBoards;
import com.info.trello.pomrepository.TrelloHomePage;
import com.info.trello.pomrepository.TrelloLogOutPage;
import com.info.trello.pomrepository.TrelloLoginPage;
import com.info.trello.pomrepository.TrelloLoginToContinue;
import com.info.trello.pomrepository.TrelloUserCreatedBoard;


public class MyFirstScript extends Baseclass {
	@Test(enabled = true)
	public void LoginLogoutToTrello() throws Throwable {
//		implicitly wait
		webDriverUtils.implicitWait(driver);
//		create object of homepage to access all the element refrence from POM class.
		TrelloHomePage homePage = new TrelloHomePage(driver);
//		click on login option.
		homePage.getLoginOption().click();
		
//		create login to continue object to access all the elements from POM class.
		TrelloLoginToContinue loginToContinue = new TrelloLoginToContinue(driver);
//		explicit wait to password text field is loaded.
		webDriverUtils.ClickableElement(driver, loginToContinue.getPasswordTf());
//      append the username to username text field.
		loginToContinue.getUsernameTF().sendKeys(fileUtility.readCommonData("username"));
//		click on continue button.
		loginToContinue.getContinueBTN().click();
//		append the password to passeord text field.
		loginToContinue.getPasswordTf().sendKeys(fileUtility.readCommonData("password"));
//		click on login button.
		loginToContinue.getLoginBTN().click();
//		create boards page object to access all the elements from POM class.
		TrelloBoards BoardsPage = new TrelloBoards(driver);
//		click on account button.
		BoardsPage.getAccountBTN().click();
//		click on logout button.
		BoardsPage.getLogoutBTN().click();
//		create logout page object to access all the elements from POM class.
		TrelloLogOutPage logoutPage = new TrelloLogOutPage(driver);
//		click on logout button.
		logoutPage.getLogoutBTN().click();
	}
//	testcase no - 1
	@Test(enabled = true)
	public void LoginCreateBoardDeleteBoardLogout() throws Throwable {
//		implicit wait.
		webDriverUtils.implicitWait(driver);
//		create homepage object to access all element refrence from POM class.
		TrelloHomePage homePage = new TrelloHomePage(driver);
//		click on login option.
		homePage.getLoginOption().click();
//		create login page object to access all the element refrence from POM class.
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
//		append username to username text field.
		loginPage.getUsernameTF().sendKeys(fileUtility.readCommonData("username"));
//		click on continue button.
		loginPage.getContinueBTN().click();
//		create an object of logintocontinue to access all the elements refrence from POM class.
		TrelloLoginToContinue loginToContinue = new TrelloLoginToContinue(driver);
//		explicit wait till password text field is clickable.
		webDriverUtils.ClickableElement(driver, loginToContinue.getPasswordTf());
//		append password to password text field.
		loginToContinue.getPasswordTf().sendKeys(fileUtility.readCommonData("password"));
//		click on login button.
		loginToContinue.getLoginBTN().submit();
//		create Boards page object to access all the refrence elements from POM class.
		TrelloBoards BoardsPage = new TrelloBoards(driver);
//		click on create new board.
		BoardsPage.getCreateNewBoard().click();
//		append the board tite to board title text field.
		BoardsPage.getBoardTitleTF().sendKeys(fileUtility.readCommonData("BoardTitle"));
//		explicit wait till create button is clickable.
		webDriverUtils.ClickableElement(driver, BoardsPage.getCreateBTN());
//		click on create button.
		BoardsPage.getCreateBTN().click();
//		create usercreatedboard object to access all the element refrence from POM class.
		TrelloUserCreatedBoard BoardName = new TrelloUserCreatedBoard(driver);
//		Actions actions = new Actions(driver);
//		actions.click(BoardName.getMenuBTN()).click(BoardName.getCloseBoard()).click(BoardName.getCloseBtn())
//		.click(BoardName.getpermenentDeleteBTN()).click(BoardName.getDeletBTN()).build().perform();
//		click on menu button.
		BoardName.getMenuBTN().click();
//		click on close board button.
		BoardName.getCloseBoard().click();
//		click on close button.
		BoardName.getCloseBtn().click();
//		click on permenentdelete button.
		BoardName.getpermenentDeleteBTN().click();
//		click on delete button.
		BoardName.getDeletBTN().click();
//		click on account button.
		BoardsPage.getAccountBTN().click();
//		click on logout button .
		BoardsPage.getLogoutBTN().click();
//		create logoutpage object to access all the elements from POM class.
		TrelloLogOutPage logoutPage = new TrelloLogOutPage(driver);
//		click on logout button.
		logoutPage.getLogoutBTN().click();
	}
//	testcase no - 2
	@Test(enabled = false)
	public void TrelloHomepageCheck() throws Throwable {
		webDriverUtils.implicitWait(driver);
		ExcelUtility excelUtility = new ExcelUtility();
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is verified ");
		System.out.println("Home Page URL is Verified");
		TrelloHomePage homepage = new TrelloHomePage(driver);
		homepage.getLoginOption().click();
		Assert.assertTrue(excelUtility.readStringData("testCase2", 4, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		Assert.assertTrue(excelUtility.readStringData("testcase2", 5, 1).equals(driver.getCurrentUrl()),
				"URL is Not Valid");
		System.out.println("LoginPage Title & URL is verified");}

//	testcase no - 3
	@Test(enabled = true)
	public void TrelloBoardsPageCheck() throws Throwable {
		webDriverUtils.implicitWait(driver);
		ExcelUtility excelUtility = new ExcelUtility();
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "URL is verified ");
		System.out.println("Home Page URL is Verified");
		TrelloHomePage homepage = new TrelloHomePage(driver);
		homepage.getLoginOption().click();
		Assert.assertTrue(excelUtility.readStringData("testCase2", 4, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		Assert.assertTrue(excelUtility.readStringData("testcase2", 5, 1).equals(driver.getCurrentUrl()),
				"URL is Not Valid");
		System.out.println("LoginPage Title & URL is verified");
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
		loginPage.getUsernameTF().sendKeys(fileUtility.readCommonData("username"));
		loginPage.getContinueBTN().click();
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 4, 1));
		Assert.assertTrue(excelUtility.readStringData("testCase2", 4, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 5, 1)),
				"URL is Not Valid");
		System.out.println("LoginToContinue Page Title & URL is verified");
		TrelloLoginToContinue loginToContinue = new TrelloLoginToContinue(driver);
		loginToContinue.getPasswordTf().sendKeys(fileUtility.readCommonData("password"));
		loginToContinue.getFlutterBTN().click();
		loginToContinue.getLoginBTN().click();
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 7, 1));
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 8, 1)),
				"URL content is Not Valid");
		Assert.assertTrue(excelUtility.readStringData("testcase2", 7, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		System.out.println("TrelloBoards Page Title & URL is verified");
		TrelloBoards BoardPage = new TrelloBoards(driver);
		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertTrue(BoardPage.getLogoutBTN().isDisplayed(), "LogOut BTN is Not Displayed");
		BoardPage.getAccountBTN().click();
		softAssert.assertTrue(BoardPage.getLogoutBTN().isDisplayed(), "profile Icon Options is Not displayed");
		BoardPage.getLogoutBTN().click();
		Assert.assertTrue(excelUtility.readStringData("testCase2", 10, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 11, 1)),
				"URL is Not Valid");
		System.out.println("Trello LogOut Page Title & URL is verified");
		TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
		LogOutPage.getLogoutBTN().click();
		softAssert.assertAll();
	}
//	testcase no - 4
	@Test(enabled = true)
	public void trelloCreateAndDeleteBoard() throws Throwable {
		webDriverUtils.implicitWait(driver);
		ExcelUtility excelUtility = new ExcelUtility();
		Assert.assertTrue(excelUtility.readStringData("Sheet1", 0, 1).equals(driver.getTitle()), "Title is verified ");
		System.out.println("Home Page URL is Verified");
		TrelloHomePage homepage = new TrelloHomePage(driver);
		homepage.getLoginOption().click();
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		Assert.assertTrue(excelUtility.readStringData("testcase2", 2, 1).equals(driver.getCurrentUrl()),
				"URL is Not Valid");
		System.out.println("LoginPage Title & URL is verified");
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
		loginPage.getUsernameTF().sendKeys(fileUtility.readCommonData("username"));
		loginPage.getContinueBTN().click();
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 4, 1));
		Assert.assertTrue(excelUtility.readStringData("testCase2", 4, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 5, 1)),
				"URL is Not Valid");
		System.out.println("LoginToContinue Page Title & URL is verified");
		TrelloLoginToContinue loginToContinue = new TrelloLoginToContinue(driver);
		loginToContinue.getPasswordTf().sendKeys(fileUtility.readCommonData("password"));
		loginToContinue.getFlutterBTN().click();
		loginToContinue.getLoginBTN().click();
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 7, 1));
		Assert.assertTrue(excelUtility.readStringData("testcase2", 7, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 8, 1)),
				"URL content is Not Valid");
		System.out.println("TrelloBoards Page Title & URL is verified");
		TrelloBoards BoardPage = new TrelloBoards(driver);
		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertTrue(BoardPage.getLogoutBTN().isDisplayed(), "LogOut BTN is Not Displayed");
		BoardPage.getNavMenuCreateBTN().click();
		softAssert.assertTrue(BoardPage.getHeaderCreateBoardBTN().isDisplayed(), "Header Create Board Button is not Displayed");
		BoardPage.getHeaderCreateBoardBTN().click();
		softAssert.assertTrue(BoardPage.getHeaderBoardTitleTF().isDisplayed(), "Header Create Board Title TF is not Displayed");
		BoardPage.getHeaderBoardTitleTF().sendKeys(excelUtility.readStringData("testCase2", 13, 0));
		webDriverUtils.ClickableElement(driver, BoardPage.getCreateBTN());
		BoardPage.getHeaderCreateBTN().click();
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 15, 1));
		Assert.assertTrue(driver.getTitle().equals(excelUtility.readStringData("testCase2", 15, 1)), " Newly Created Board Title is Not Verfied");
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 16, 1)), "Newly Created Board URL is Not Verfied");
		TrelloUserCreatedBoard userCreatedBoard = new TrelloUserCreatedBoard(driver);
		userCreatedBoard.getMenuBTN().click();
		userCreatedBoard.getCloseBoard().click();
		userCreatedBoard.getCloseBtn().click();
		userCreatedBoard.getpermenentDeleteBTN().click();
		userCreatedBoard.getDeletBTN().click();
		BoardPage.getAccountBTN().click();
		BoardPage.getLogoutBTN().click();
		Assert.assertTrue(driver.getTitle().equals(excelUtility.readStringData("testCase2", 10, 1)), "LogOut Page title is Verified");
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 11, 1)), "LogOut Page URL is Verified");
		TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
		LogOutPage.getLogoutBTN().click();
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("Sheet1", 0, 1));
		Assert.assertTrue(excelUtility.readStringData("Sheet1", 0, 1).equals(driver.getTitle()), "Title is verified ");
		System.out.println(driver.getCurrentUrl());
		System.out.println(excelUtility.readStringData("Sheet1", 1, 1));
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("Sheet1", 1, 1)),"URL is Not verified");
	}
//	testcase no - 5
	@Test(enabled = true)
	public void trelloCreateMultipleListInCreatedBoard() throws Throwable {
//		to give implicitly wait.
		webDriverUtils.implicitWait(driver);
//		Create create Excel utitlity .
		ExcelUtility excelUtility = new ExcelUtility();
//		Hard aasert to verify title of home page.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is not verified ");
//		System.out.println("Home Page URL is Verified");
//		creating homepage object to access the elements of homepage POM class.
		TrelloHomePage homepage = new TrelloHomePage(driver);
//		click on login option.
		homepage.getLoginOption().click();
//		hard assert to verify the title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 4, 1).equals(driver.getTitle()),
				"Title is Not Valid");
//		hard assert to verify the URL+.
		Assert.assertTrue(excelUtility.readStringData("testcase2", 5, 1).equals(driver.getCurrentUrl()),
				"URL is Not Valid");
		System.out.println("LoginPage Title & URL is verified");
//		create object of an loginpage to access all the elements from login POM class.
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
//		Append the username into username textfield.
		loginPage.getUsernameTF().sendKeys(fileUtility.readCommonData("username"));
//		click on continue button.
		loginPage.getContinueBTN().click();
//		giving explicit wait to get  title Loaded.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 7, 1));
//		hardassert to verify title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 7, 1).equals(driver.getTitle()),
				"Title is Not Valid");
//		hardassert to verify URL.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 8, 1)),
				"URL is Not Valid");
		System.out.println("LoginToContinue Page Title & URL is verified");
//		create LoginTOContinue Page object to access all the elements refrence stored in POM class.
		TrelloLoginToContinue loginToContinue = new TrelloLoginToContinue(driver);
//		Append the password into Password textfield.
		loginToContinue.getPasswordTf().sendKeys(fileUtility.readCommonData("password"));
//		click on flutter button.
		loginToContinue.getFlutterBTN().click();
//		Thread.sleep(1000);
//		click on login button.
		loginToContinue.getLoginBTN().click();
//		giving explicit wait till title is get loaded.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 10, 1));
//		Assert to verify the title.
		Assert.assertTrue(excelUtility.readStringData("testcase2", 10, 1).equals(driver.getTitle()),
				"Title is Not Valid");
//		Assert to verify the URL.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 11, 1)),
				"URL content is Not Valid");
//		System.out.println("TrelloBoards Page Title & URL is verified");
//		create an object of Boardpage to access all the element refrences from POM class.
		TrelloBoards BoardPage = new TrelloBoards(driver);
//		create softAssert object. 
		SoftAssert softAssert = new SoftAssert();
//		softassert to verify login button is displayed or not?
//		softAssert.assertTrue(BoardPage.getLogoutBTN().isDisplayed(), "LogOut BTN is Not Displayed");
//		click on navmenu create button.
		BoardPage.getNavMenuCreateBTN().click();
//		softassert to verify Header create button is displayed or not.
		softAssert.assertTrue(BoardPage.getHeaderCreateBoardBTN().isDisplayed(), "Header Create Board Button is not Displayed");
//		click on create Board button.
		BoardPage.getHeaderCreateBoardBTN().click();
//		softassert to verify board title Text Field is  displayed or not?
		softAssert.assertTrue(BoardPage.getHeaderBoardTitleTF().isDisplayed(), "Header Create Board Title TF is not Displayed");
//		to append the data of Boardname.
		BoardPage.getHeaderBoardTitleTF().sendKeys(excelUtility.readStringData("testCase2", 13, 1));
//		explicit wait till create button is clickable.
		webDriverUtils.ClickableElement(driver, BoardPage.getCreateBTN());
//		click on create button.
		BoardPage.getHeaderCreateBTN().click();
//		explicit wait to verify title.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 15, 1));
//		hardassert to verify title.
		Assert.assertTrue(driver.getTitle().equals(excelUtility.readStringData("testCase2", 15, 1)), " Newly Created Board Title is Not Verfied");
//		hardassert to verify url.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 16, 1)), "Newly Created Board URL is Not Verfied");
//		create an object of user created board to access all the elements refrence from pom classs.
		TrelloUserCreatedBoard userCreatedBoard = new TrelloUserCreatedBoard(driver);
//		append the data into enterlist text field.
		userCreatedBoard.getenterListTF().sendKeys(excelUtility.readStringData("testCase2", 17, 1));
//		click on addlist button.
		userCreatedBoard.getaddList().click();
//		append the data into enterlist text field.
		userCreatedBoard.getenterListTF().sendKeys(excelUtility.readStringData("testCase2", 18, 1));
//		click on addlist button.
		userCreatedBoard.getAddlistBTN().click();
//		Thread.sleep(3000);
//		click on menu.
		userCreatedBoard.getMenuBTN().click();
//		click on close board.
		userCreatedBoard.getCloseBoard().click();
//		click on close button.
		userCreatedBoard.getCloseBtn().click();
//		click on permenantly delet button.
		userCreatedBoard.getpermenentDeleteBTN().click();
//		click on delete button.
		userCreatedBoard.getDeletBTN().click();
//		click on account button.
		BoardPage.getAccountBTN().click();
//		click on logout button.
		BoardPage.getLogoutBTN().click();
//		hard assert to verify title.
		Assert.assertTrue(driver.getTitle().equals(excelUtility.readStringData("testCase2", 21, 1)), "LogOut Page title is Verified");
//		hard assert to verify url.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 22, 1)), "LogOut Page URL is Verified");
//		create logout page object to access all the element refrence from POM class.
		TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
//		click on logout button.
		LogOutPage.getLogoutBTN().click();
//		explicit wait till title is loaded.
		webDriverUtils.waitForCompleteTitle(driver, excelUtility.readStringData("testCase2", 1, 1));
//		hardassert to verify title.
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is verified ");
//		hard assert to verify URL.
		Assert.assertTrue(driver.getCurrentUrl().contains(excelUtility.readStringData("testCase2", 2, 1)),"URL is Not verified");
//		assertall for soft assert.
		softAssert.assertAll();
	}
//	testcase no - 6
	@Test
	public void trelloCreateMultipleListAndSwapInCreatedBoard()throws Throwable {
//		give implicitly wait.
		webDriverUtils.implicitWait(driver);
//		create object for excel utility.
		ExcelUtility excelUtility = new ExcelUtility();
//		hard assert to verify Title.
//		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is verified ");
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
		softAssert.assertTrue(BoardPage.getLogoutBTN().isDisplayed(), "LogOut BTN is Not Displayed");
//		click on navigation menu click button.
		BoardPage.getNavMenuCreateBTN().click();
//		hard assert to header create button.
//		Assert.assertTrue(BoardPage.getHeaderCreateBoardBTN().isDisplayed(), "Header Create Board Button is not Displayed");
//		click on header create board button .
		BoardPage.getHeaderCreateBoardBTN().click();
//		hard assert to verify header text field is displayed?
//		Assert.assertTrue(BoardPage.getHeaderBoardTitleTF().isDisplayed(), "Header Create Board Title TF is not Displayed");
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