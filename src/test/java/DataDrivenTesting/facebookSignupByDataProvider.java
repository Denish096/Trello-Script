package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebookSignupByDataProvider {
	WebDriver driver ;
	@Test(dataProvider = "data", dataProviderClass = DataForFacebookSignup.class)
	public void  facebookSignup(String Firstname, String Surname, String email, String password, String day,
			String month, String year, String gender,String url) throws Throwable {
		
		driver= new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys(Firstname);
		driver.findElement(By.name("lastname")).sendKeys(Surname);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		driver.findElement(By.id("day")).sendKeys(day);
		driver.findElement(By.id("month")).sendKeys(month);
		driver.findElement(By.id("year")).sendKeys(year);
		if (gender.equals("Male"))
		driver.findElement(By.cssSelector("input[value='2']")).click();
		else if (gender.equals("Female"))
			driver.findElement(By.cssSelector("input[value='1']")).click();
		
//		System.out.println("My Firstname is:" + Firstname);
//		System.out.println("My Surname is:" + Surname);
//		System.out.println("My email is:" + email);
//		System.out.println("My password is:" + password);
//		System.out.println("My DOB is:" + day + "-" + month + "-" + year);
//		System.out.println("My gender is:" + gender);
//		System.out.println(url);
	}
}
