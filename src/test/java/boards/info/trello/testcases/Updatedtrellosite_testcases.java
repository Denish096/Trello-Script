package boards.info.trello.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.info.trello.genericutility.Baseclass;
import com.info.trello.genericutility.ExcelUtility;
import com.info.trello.pomrepository.TrelloBoards;
import com.info.trello.pomrepository.TrelloHomePage;
import com.info.trello.pomrepository.TrelloLoginToContinue;
import com.info.trello.pomrepository.TrelloUserCreatedBoard;

public class Updatedtrellosite_testcases extends Baseclass {
	@Test
	public void trelloHomePageCheck() throws Throwable {
		webDriverUtils.implicitWait(driver);
		ExcelUtility excelutility = new ExcelUtility();
		Assert.assertTrue(excelutility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "URL is verified ");
//		to access all the element refrences from pom class
		TrelloHomePage homepage = new TrelloHomePage(driver);
//		click on login to continue.
		homepage.getLoginOption().click();
//		create login to continue object to access all the elements from POM class.
		TrelloLoginToContinue logintocontinue = new TrelloLoginToContinue(driver);
//		to verify url & Title
		webDriverUtils.waitForCompleteTitle(driver, excelutility.readStringData("testCase2", 4, 1));
		Assert.assertTrue(excelutility.readStringData("testCase2", 4, 1).equals(driver.getTitle()),
				"Title is Not Valid");
		Assert.assertTrue(driver.getCurrentUrl().contains(excelutility.readStringData("testCase2", 5, 1)),
				"URL is Not Valid");
/**
 * entering username and password for login
 */
		logintocontinue.getUsernameTF().sendKeys(fileUtility.readCommonData("username"));
		logintocontinue.getContinueBTN().click();
		logintocontinue.getPasswordTf().sendKeys(fileUtility.readCommonData("password"));
//		Sorry for not showin password..
//		logintocontinue.getFlutterBTN().click();
		logintocontinue.getLoginBTN().click();
//		to access all the elements from POM class
//		explicit wait to verify Title.
		webDriverUtils.waitForCompleteTitle(driver, excelutility.readStringData("testCase2", 10, 1));
//		hard assert to verify Title.
		Assert.assertTrue(excelutility.readStringData("testcase2", 10, 1).equals(driver.getTitle()),
				"Title is Not Valid");
//		hard assert to verify URL .
		Assert.assertTrue(driver.getCurrentUrl().contains(excelutility.readStringData("testCase2", 11, 1)),
				"URL content is Not Valid");		
		TrelloBoards boardspage = new TrelloBoards(driver);
		boardspage.getCreateNewBoard().click();
//		to append the board name
		boardspage.getBoardTitleTF().sendKeys(excelutility.readStringData("testcase2", 13, 1));
//		to click on create button
		boardspage.getCreateBTN().click();
//		explicit wait till the create button is clickable.
		webDriverUtils.ClickableElement(driver, boardspage.getCreateBTN());
//		click on header create button.
		boardspage.getHeaderCreateBTN().click();
//		explicit wait to verify Title.
		webDriverUtils.waitForCompleteTitle(driver, excelutility.readStringData("testCase2", 15, 1));
//		hard assert to verify Title.
		Assert.assertTrue(driver.getTitle().equals(excelutility.readStringData("testCase2", 15, 1)),
				" Newly Created Board Title is Not Verfied");
		Assert.assertTrue(driver.getCurrentUrl().contains(excelutility.readStringData("testCase2", 16, 1)),
				"Newly Created Board URL is Not Verfied");
//		create an object of a user created board to access all the elements from POM class.		
		TrelloUserCreatedBoard usercreatedboard = new TrelloUserCreatedBoard(driver);
//		usercreatedboard.getaddaList().click();
		usercreatedboard.getenterListTF().sendKeys(excelutility.readStringData("testcase2", 17, 1));
//		Thread.sleep(2000);
		/**
		 * to Add lists
		 */
		usercreatedboard.getAddlistBTN().click();
		usercreatedboard.getenterListTF().sendKeys(excelutility.readStringData("testcase2", 18, 1));
		usercreatedboard.getAddlistBTN().click();
		usercreatedboard.getcloseicon().click();
//		Thread.sleep(5000);
		Actions actions =new Actions(driver);
//		to swap the elements .
		actions.clickAndHold(usercreatedboard.getCreatedListOne()).moveByOffset(350, 50).release().build().perform();
//		click on menu button.
		usercreatedboard.getMenuBTN().click();
//		click on close board button.
		usercreatedboard.getCloseBoard().click();
//		click on close button.
		usercreatedboard.getCloseBtn().click();
//		click on permenently delete button.
		usercreatedboard.getpermenentDeleteBTN().click();
//		click on delete button.
		usercreatedboard.getDeletBTN().click();
//		click on account button.
		boardspage.getAccountBTN().click();
//		click on logout button.
		boardspage.getLogoutBTN().click();
	}

}
