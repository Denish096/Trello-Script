package ActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverningOnElements {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		List<WebElement> fullsections = driver.findElements(By.xpath("//a[@class='desktop-main']"));
		Actions actions = new Actions(driver);
		for (WebElement Singlesection : fullsections) {
			actions.moveToElement(Singlesection).pause(1000).perform();
		}
	}
}
