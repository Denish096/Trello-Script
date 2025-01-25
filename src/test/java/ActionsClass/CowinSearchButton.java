package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CowinSearchButton {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cowin.gov.in/");
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 900).perform();
//		MoveTargetOutOfBoundException
		WebElement SearchBTN = driver.findElement(By.xpath("//button[text()='Search']"));
		action.pause(1000).moveToElement(SearchBTN).pause(1000).click(SearchBTN).perform();
	}
}
