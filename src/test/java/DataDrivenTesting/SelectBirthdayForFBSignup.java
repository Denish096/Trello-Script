package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBirthdayForFBSignup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select dayoption = new Select(daydropdown);
		dayoption.selectByVisibleText("9");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthOption = new Select(monthDropdown);
		monthOption.selectByVisibleText("Sep");
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearOption = new Select(yearDropdown);
		yearOption.selectByVisibleText("1967");
		driver.manage().window().minimize();
//		driver.quit();
	}


}
