package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingAbilityOfClickMethod {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement Messenger = driver.findElement(By.linkText("Messenger"));
	Thread.sleep(2000);
//	Note : click() has default scrolling ability and it is not always working
	Messenger.click();
	Actions actions = new Actions(driver);
//	actions.scrollToElement(Messenger).perform();
	actions.scrollByAmount(0, 200).perform();
	
}
}
