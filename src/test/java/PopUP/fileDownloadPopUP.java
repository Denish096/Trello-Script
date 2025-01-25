package PopUP;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileDownloadPopUP {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement download = driver.findElement(By.xpath("//a[.='4.11.0']"));
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 570).pause(1000).click(download).perform();
		driver.get("chrome://downloads/");
		Thread.sleep(2000);
		WebElement host2 = driver.findElement(By.tagName("downloads-manager")).getShadowRoot()
				.findElement(By.cssSelector("downloads-item[id='frb0']"));
		host2.getShadowRoot().findElement(By.cssSelector("cr-button[focus-type='save']")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}