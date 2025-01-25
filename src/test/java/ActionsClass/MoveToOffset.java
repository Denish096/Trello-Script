package ActionsClass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToOffset {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com/shop/men");
		WebElement favourite = driver.findElement(By.xpath("//div/img[@alt='wishlistIcon']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(favourite).pause(1000).moveToElement(favourite, 54, 0).build().perform();
	}

}
