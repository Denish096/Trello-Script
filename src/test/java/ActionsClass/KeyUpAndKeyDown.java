package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		Actions actions = new Actions(driver);
		actions.keyDown(driver.switchTo().activeElement(),Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("e").perform();
		actions.keyDown(driver.switchTo().activeElement(),Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL).perform();
		WebElement password = driver.findElement(By.name("pass"));
		actions.keyDown(Keys.CONTROL).sendKeys(password, "v").perform();
	}
}
