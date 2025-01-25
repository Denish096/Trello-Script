package learnTestNG;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
		public void Assertion() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form/");
		WebElement LoginBTN = driver.findElement(By.name("submit"));
//	Hard Assert
	Assert.assertTrue(LoginBTN.isEnabled(),"Login Button is in Disabled State");

		/*
		 * For Soft assert You have to create an object of softassert and at last you
		 * have to call allassert method with Softassert object refrence...
		 */
		SoftAssert Softassert = new SoftAssert();
		Softassert.assertTrue(LoginBTN.isEnabled(), "Login Button is in Disabled State");
		
		driver.manage().window().maximize();
		driver.quit();
		Softassert.assertAll();
	}
}
