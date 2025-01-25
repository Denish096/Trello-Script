package PopUP;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shadowHostAndShadowRootElements {
	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement download = driver.findElement(By.xpath("//a[.='4.11.0']"));
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 570).pause(1000).click(download).perform();
		driver.get("chrome://downloads/");
		Thread.sleep(2000);
		WebElement host1 = driver.findElement(By.tagName("downloads-manager"));
		SearchContext Shadowroot1 =host1.getShadowRoot() ;
		WebElement host2 =	Shadowroot1.findElement(By.cssSelector("downloads-item[id='frb0']"));
		SearchContext Shadowroot2 = host2.getShadowRoot();
		WebElement InteractiveElement=Shadowroot2.findElement(By.cssSelector("cr-button[focus-type='save']"));
		InteractiveElement.click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
