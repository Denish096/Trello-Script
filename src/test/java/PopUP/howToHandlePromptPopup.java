package PopUP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class howToHandlePromptPopup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/denis/OneDrive/Documents/Pop%20UPs/prompt%20popup.html");
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("29");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
