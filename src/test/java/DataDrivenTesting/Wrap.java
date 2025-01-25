package DataDrivenTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrap {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> Alldropdowns = driver.findElements(By.tagName("select"));
		for (WebElement webElement : Alldropdowns) {
			webElement.click();
		}
 	}

}
