package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActitimeThrewParameterization {
	WebDriver driver; 
@Test
@Parameters({"url","username","password"})
	public void actitime(String url,String username,String password) {
	driver = new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
}}