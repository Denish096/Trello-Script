package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoOffsetPractice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com/shop/men");
		WebElement men = driver.findElement(By.linkText("MEN"));
		Actions actions = new Actions(driver);
		actions.moveToElement(men).pause(1000).moveByOffset(77, 0).pause(1000).moveToElement(men, 154, 0).pause(1000)
				.moveToElement(men, 220, 0).pause(1000).moveToElement(men, 351, 0).build().perform();
	}

}
