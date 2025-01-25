package ActionsClass;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Check {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.google.com/doodles");

		Actions actions = new Actions(driver);
		for (;;) {
			try {
				WebElement Colombia = driver.findElement(By.linkText("Colombia Independence Day 2023"));
				Colombia.click();
			} catch (NoSuchElementException e) {
				actions.scrollByAmount(0, 200).perform();
			}
		}// Colombia.click();
	}
}