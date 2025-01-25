package learnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AchieveParameterization {
	WebDriver driver;
	@Test
	@Parameters("browserName")
	public void launchBrowser(String browserName) {
		if(browserName.equals("chrome")) {
			driver= new ChromeDriver();}
		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().window().minimize();
	driver.quit();
	}
}
