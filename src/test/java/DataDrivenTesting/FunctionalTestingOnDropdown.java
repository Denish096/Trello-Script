package DataDrivenTesting;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class FunctionalTestingOnDropdown {
	@Test
	public void functionaltesting() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		List<WebElement> alldropdown = driver.findElements(By.tagName("select"));
		for (WebElement dropdown : alldropdown) {
			if (dropdown.isDisplayed()) {
				Select DropDownselect = new Select(dropdown);
				List<WebElement> AllOptions = DropDownselect.getOptions();
				for (WebElement option : AllOptions) {
//					DropDownselect.selectByVisibleText(option.getText());
					option.click();
					if (option.isSelected()) {
						System.out.println(option.getText() + " is selected");
					} else
						System.out.println(option.getText() + " is not Selected");
				}
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}