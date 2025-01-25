package DataDrivenTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.info.trello.genericutility.Baseclass;
import com.info.trello.genericutility.ExcelUtility;

public class TestCaseSample extends Baseclass {
	
	@Test
	public void TestCase1() throws Throwable {
		webDriverUtils.implicitWait(driver);
		ExcelUtility excelUtility = new ExcelUtility();
		Assert.assertTrue(excelUtility.readStringData("testCase2", 1, 1).equals(driver.getTitle()), "Title is verified ");
		System.out.println("Home Page URL is Verified");
		
	}

}
