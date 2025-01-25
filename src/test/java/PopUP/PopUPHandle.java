package PopUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUPHandle {
	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("--diable-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://www.pib.gov.in/");
		Thread.sleep(2000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		String PIBId = driver.getWindowHandle();
//			driver.navigate().refresh();

		WebElement MOD = (driver.findElement(By.linkText("Ministry of Defence")));
		Actions actions = new Actions(driver);
		actions.scrollToElement(MOD).pause(2000).perform();
		wait.until(ExpectedConditions.elementToBeClickable(MOD)).click();
		System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		for (String windowid : driver.getWindowHandles()) {
			String windowURL = driver.switchTo().window(windowid).getCurrentUrl();
			if (windowURL.contains("https://mod.gov.in/"));
			driver.close();
		}
		driver.switchTo().window(PIBId).manage().window().minimize();
		Thread.sleep(1000);
		driver.quit();

	}

}
