package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class usageOfClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		// identify the login btn
//		  WebElement loginBTN = driver.findElement(By.name("login"));
		  //create Actions class object
		  Actions actions = new Actions(driver);
		  WebElement linkText = driver.findElement(By.linkText("Forgotten password?"));
		  actions.moveToElement(linkText).click().perform();
//		  actions.click(linkText).perform();
		  }

}
